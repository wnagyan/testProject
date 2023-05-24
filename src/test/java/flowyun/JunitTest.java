package flowyun;

import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.parser.deserializer.JSONObjectDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.Employee;
import com.test.StatusType;
import com.util.MapToBeanUtil;
import lombok.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class JunitTest {

    @Test
    public void test(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "zhoujh");
        map.put("age", 16);
        map.put("businessscope", "abc");
        map.put("idS", List.of("1", "2"));
        try {
            Employee employee = MapToBeanUtil.mapToBean(map, Employee.class);
            System.out.println(employee);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("这是分界线----------------------------------------------");

        try {
            Employee employee = MapToBeanUtil.beanMapConverter(map, Employee.class);
            System.out.println(employee);
        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }

    @Test
    public void TestStream() {

        User user = new User("李", "1223123123");
        User user1 = new User("哈哈", "412412412");
        User user2 = new User("haha", "231231");
        User user3 = new User("李", "4241241241");
        /**
         * 需要过滤的源数据
         */
        List<User> list = new ArrayList<User>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        /**
         * 过滤条件
         * 只要名字是haha或者李的对象集合
         */
        List<User> userList = new ArrayList();
        userList.add(new User("haha", "2131231"));
        userList.add(new User("李", "231231"));

//        List<User> result = list.stream().filter(users -> userList.stream().anyMatch(user5 -> user5.getName().equals(users.getName()))).collect(Collectors.toList());

//        List<User> result = list.stream().filter(users -> users.name.equals("李")).collect(Collectors.toList());
        boolean match = list.stream().noneMatch(users -> users.name.equals(""));
        System.out.println(match);
//        System.out.println(result.size());
//        result.forEach(aa -> {
//            System.out.println("姓名: " + aa.getName() + "，手机号: " + aa.getPhone());
//        });
    }


    @Test
    public void test1(){
        List<String> ebaColumn = List.of("code_", "valid_", "short_name_", "name_", "order_", "input_", "output_", "start_", "end_", "kpi_", "master_version_",
                "minor_version_", "version_", "next_level_", "upper_level_", "purpose_", "definition_", "date_", "disable_status_", "up_levels_", "create_date_",
                "create_user_", "mod_date_", "mod_user_");
        String sql = "select ID, $code_, $valid_, $short_name_, $name_, $order_, $input_, $output_, $start_, $end_, $kpi_, $master_version_, \" + " +
                "                \" $minor_version_, $version_, $next_level_, $upper_level_, $purpose_, $definition_,  $disable_status_, $up_levels_, \" + " +
                "                \" $create_date_, $create_user_, $mod_date_, $mod_user_,$date_, from WIDES";

        for (String s : ebaColumn){
            sql = sql.replace("$"+s, s.replace("_", ""));
        }
        System.out.println(sql);
    }

    @Test
    public void test2(){
        String employee = "";
        String[] split = employee.split(";", -1);
        Arrays.asList(split).forEach(System.out::println);
        System.out.println(split.length);

    }

    class User{
        private String name;
        private String phone;

        public User() {
        }

        public User(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    @Test
    public void test3(){
        try {
            InetAddress ip4 = Inet4Address.getLocalHost();
            System.out.println(ip4);
            System.out.println(ip4.getHostAddress());
            System.out.println(ip4.getHostName());
            System.out.println(ip4.getCanonicalHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        Set<User> userList = new HashSet<>();
        User user = new User("张三", "18770816729");
        userList.add(user);
        userList.forEach(System.out::println);
        System.out.println();
        user.setName("李四");
        userList.add(user);
        userList.forEach(System.out::println);
    }

    private static final Map<String, Integer> retryMap = new HashMap<>();

    @Test
    public void testTimeSort(){
        LocalDateTime time1 = LocalDateTime.parse("2023-03-29T17:41:27.725907600");
        LocalDateTime time2 = LocalDateTime.parse("2023-03-30T17:41:27.725907600");
        LocalDateTime time3 = LocalDateTime.parse("2023-03-31T17:41:27.725907600");
        List.of(time1, time2, time3).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        System.out.println(time1);
    }

    @Test
    public void switchTest(){
        String str = "";
        StatusType statusType = StatusType.RUN;
        switch (statusType){
            case RUN:
                str += StatusType.RUN.getDesc();
            case EAT:
                str += StatusType.EAT.getDesc();
            case SLEEP:
                str += StatusType.SLEEP.getDesc();
            default:
                break;
        }
        System.out.println(str);
    }

    @Test
    public void jsonTest(){
       
        String object = "{ " +
                "\"jfgn\": \"\", " +
                "\"services\": [ { " +
                "\"branch\": \"\", " +
                "\"nameCode\": \"\", " +
                "\"comment\": \"\", " +
                "\"other\": \"\" " +
                " }] " +
                "}";

        JSONObject jsonObject = JSONObject.fromObject(object);
        JSONArray jsonArray = jsonObject.getJSONArray("services");

        System.out.println(jsonArray);
    }

    @Test
    public void getStreamByUrl(){
        String urlString = "https://disv.flowyun.com/vfs/downloads/dingb47554b4070453b4f2c783f7214b6d69/cebe03d1f4c4443391b77afd77b816c6";
        if (StringUtils.isEmpty(urlString)){
            System.out.println(1231231232);
        }
        try {
            URL url = new URL(urlString);
            InputStream inputStream = url.openConnection().getInputStream();
            System.out.println(Objects.isNull(url.openConnection().getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void transferTime(){
        String value = "2023-12";
        int quarter = (Integer.parseInt(value.substring(value.indexOf("-") + 1)) + 2) / 3;
        value = value.substring(0, value.indexOf("-")) + "-" + quarter;
        System.out.println(value);;
    }

    @Test
    public void numberTest(){
        String number = "0";
        String[] split = number.split("\\.", -1);
        System.out.println(split[0]);
        System.out.println(number.matches("^[0]+$"));
    }

    @Test
    public void testDistinct(){
        List<User> list = new ArrayList<>();
        User u1 = new User("张三", "123");
        User u2 = new User("李四", "234");
        User u3 = new User("王五", "456");
        User u4 = new User("张四", "123");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.stream().distinct().collect(Collectors.toList());
    }

    @Test
    public void booleanTest(){
        String str = "FALSE";

        System.out.println(str.toLowerCase());
    }
}
