package com.econage.antlr;

import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomClickHouseParserBaseListener extends ClickHouseParserBaseListener {
    private Map<String, Set<String>> dataBaseTablenameAndOper = new HashMap<>();//用来保存表与操作的对应关系
    private Map<String, Set<String>> dataBaseTablenameAliasAndOper = new HashMap<>();//用来保存表别名与操作的对应关系
    private Set<String> dataBaseColumnAndOper = new HashSet<>();

    public Map<String, Set<String>> getDataBaseTablenameAndOper() {
        return dataBaseTablenameAndOper;
    }
    public Map<String, Set<String>> getDataBaseTablenameAliasAndOper() {
        return dataBaseTablenameAliasAndOper;
    }

    public Map<String, Set<String>> getRealDataBaseTablenameAndOper() {
        for (String key : dataBaseTablenameAliasAndOper.keySet()) {
            if (dataBaseTablenameAndOper.containsKey(key)) {
                dataBaseTablenameAndOper.remove(key);
            }
        }
        return dataBaseTablenameAndOper;
    }

    public Set<String> getDataBaseColumnAndOper(){
        return dataBaseColumnAndOper;
    }


    @Override
    public void enterQuery(ClickHouseParser.QueryContext ctx) {
        ParseTreeWalker queryWalker = new ParseTreeWalker();
        queryWalker.walk(new ClickHouseParserBaseListener() {

            public void enterTableIdentifier(ClickHouseParser.TableIdentifierContext tctx) {
                if(tctx!=null) {
                    String table = tctx.getText()/*.toLowerCase()*/;
                    Set<String> oper;
                    if (dataBaseTablenameAndOper.containsKey(table)) {
                        oper = dataBaseTablenameAndOper.get(table);
                    } else {
                        oper = new HashSet<>();
                    }
                    oper.add("SELECT");
                    dataBaseTablenameAndOper.put(table, oper);
                }
            }
        }, ctx);
        queryWalker.walk(new ClickHouseParserBaseListener() {
            public void enterAlias(ClickHouseParser.AliasContext tctx) {
                if(tctx!=null) {
                    String table = tctx.getText()/*.toLowerCase()*/;
                    Set<String> oper;
                    if (dataBaseTablenameAliasAndOper.containsKey(table)) {
                        oper = dataBaseTablenameAliasAndOper.get(table);
                    } else {
                        oper = new HashSet<>();
                    }
                    oper.add("SELECT");
                    dataBaseTablenameAliasAndOper.put(table, oper);
                }
            }
        }, ctx);
        queryWalker.walk(new ClickHouseParserBaseListener(){
            @Override
            public void enterColumnIdentifier(ClickHouseParser.ColumnIdentifierContext cctx) {
                if(cctx!=null) {
                    String column = cctx.getText()/*.toLowerCase()*/;
                    dataBaseColumnAndOper.add(column);
                }
            }
        }, ctx);
    }
}
