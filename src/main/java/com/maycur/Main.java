package com.maycur;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import lombok.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.logging.stdout.StdOutImpl;

import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
//        String token = "c1f80d42359297910d72d435e05c3000";
//        Date date = new Date();
//        System.out.println(DigestUtils.md5Hex(token + JSON.toJSONString(date)));
//        System.out.println(UUID.randomUUID().toString());
//
//        String sql = "select ID, $valid_, $code_, $name_, $order_, $overview_, $definition_, $scene_desc_, $deadline_, $business_scope_, $inner_interaction_,        " +
//                "$interaction_modular_id_, $app_id_, $handle_url_4_pc_, $handle_url_4_mobile_, $valid_date_time_, $valid_num_, $master_version_, $minor_version_," +
//                "$version_, $next_level_, $upper_level_, $disable_status_, $date_, $effective_date_, $purpose_, $up_levels_, $create_date_, $create_user_," +
//                "        $mod_date_, $mod_user_ from WIDES final where ID in ( #{id_} )       and BIZ = 'ecl_bpa2_workflow_' and TENANT_ID = '1234abcd' ";
//        List<String> columns = List.of("valid_date_time_", "valid_num_", "valid_");
//        for (String c : columns){
//            sql = sql.replace(("$" + c), ("${" + c + "} as " + c));
//        }
//        System.out.println(sql);
//        Map<String, Object> map = new HashMap<>();
//        map.put("abc01", "abc01");
//        map.put("abc02", "abc02");
//        map.put("abc03", "abc03")
        List<String> list = Lists.newArrayList("abc");
        list.add("cnd");
        System.out.println(Boolean.valueOf("true"));


    }

    @Data
    @AllArgsConstructor
    static class Employee{
        private String name;
        private Integer age;
    }

}
