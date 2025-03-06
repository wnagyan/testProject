package flowyun;

import com.test.MyEmployee;
import com.test.RefenceEmployee;
import com.test.StatusType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SimpleTest {

    @Test
    public void test() {
        StatusType statusType = StatusType.RUN;
        switch (statusType) {
            case RUN -> log.info("跑步");
            case SLEEP -> log.info("睡觉");
            case EAT -> log.info("吃饭");
        }

    }

    @Test
    public void test1(){
        MyEmployee myEmployee = new MyEmployee("北京");
        myEmployee.setName("张三");

        RefenceEmployee refenceEmployee = new RefenceEmployee();
        refenceEmployee.setMyEmployee(myEmployee);
        refenceEmployee.getMyEmployee().setName("李四");

        log.info(myEmployee.getName());
    }
}
