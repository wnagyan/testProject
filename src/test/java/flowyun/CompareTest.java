package flowyun;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
public class CompareTest {

    @Test
    public void compareTest1(){
        Map map = null;
        List<Map> list = new ArrayList<>();
        list.add(map);
        System.out.println(CollectionUtils.isEmpty(list));
    }
}
