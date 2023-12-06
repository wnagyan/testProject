package com.econage.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Map;
import java.util.Set;

public class ClickhouseSqlUtil {
    public static Map<String, Set<String>> getDataBaseTablenameAndOper(String sql){
        ClickHouseLexer lexer = new ClickHouseLexer(new ANTLRInputStream(sql));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ClickHouseParser parser = new ClickHouseParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();

        CustomClickHouseParserBaseListener clickhouseBaseBaseListener = new CustomClickHouseParserBaseListener();
        walker.walk(clickhouseBaseBaseListener, parser.queryStmt());

        return clickhouseBaseBaseListener.getRealDataBaseTablenameAndOper();
    }

    public static void main(String[] args) {
        Map<String, Set<String>> dataBaseTablenameAndOper = getDataBaseTablenameAndOper("select a.id from t_order a join t_product b on a.productId = b.id");
        System.out.println(dataBaseTablenameAndOper);
    }
}