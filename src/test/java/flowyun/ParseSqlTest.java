package flowyun;

import com.test.Employee;
import com.test.MyEmployee;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectBody;
import net.sf.jsqlparser.statement.select.WithItem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ParseSqlTest {

    @Test
    public void test(){
        String sql = "select ft.id,\n" +
                "       ft.req_id,\n" +
                "       ft.name,\n" +
                "       ft.short_name,\n" +
                "       ft.template_id,\n" +
                "       ft.version,\n" +
                "       ft.group_id,\n" +
                "       ft.sub_group_id,\n" +
                "       ft.status,\n" +
                "       ft.tenant_id,\n" +
                "       ft.create_date,\n" +
                "       ft.create_user,\n" +
                "       ft.modified_date,\n" +
                "       ft.modified_user\n" +
                "from flow_template ft\n" +
                "         left join flow_template_item fti on ft.create_date = fti.create_date\n" +
                "where ft.req_id = '123456'\n" +
                "  and ft.name is not null \n" +
                "  and ft.tenant_id = 'asfsdafsa1234'\n" +
                "order by create_date desc;";
        try {
            Select parse = (Select) CCJSqlParserUtil.parse(sql);
            List<WithItem> withItemsList = parse.getWithItemsList();
            PlainSelect selectBody = (PlainSelect) parse.getSelectBody();
            System.out.println();
        } catch (JSQLParserException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test1(){
        List<String> list = List.of("abc", "bcd", "efg");
        System.out.println(list.contains("bcd"));
    }
}
