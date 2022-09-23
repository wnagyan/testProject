package com.maycur;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.logging.stdout.StdOutImpl;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiemhvdWpoIiwiY29tcGFueSI6IuW-ruWujyIsImV4cCI6MTY2MzMxMjY3NywiY2xhc3MiOiJKV1QifQ.OMgx0bOxKQz5gpjDE4_StRXpz5XGjU-UiAVtlzVFe-w";
//        Map<String, String> map = decodeedToken(token);
//        map.forEach((key, value) -> {
//            System.out.println(value);
//        });
        String s = "/health,/api/socket/**,/manager/**,/captcha/**,/auth/**,/refreshVersionFeatures,/limit/**,/gw/manager/**,/dtalk/**,/weixinserv/**,/actuator/**,/flow/api/workflow/**,/flow/design/form/noVerification/**,/vfs/downloads/**,/orgs/user/activeUser,/orgs/error,/orgs/register/**,/orgs/page/**,/orgs/auth/**,/orgs/captcha/**,/orgs/common/**,/orgs/api/**,/orgs/pavilion/simulationOn,/disv/**,/security/oauth/**,/vfs/wps/v1/3rd/fileinfo,/openapi/**,/project/ivr/callback,/yixin/**,/flow/workflow/endorsement/**,/flow/workflow/qrCodeData/get/CodeValue,/bfc/plat/data/**,/bfc/msg/test/**,/bfc/tenant/org/sync,/bfc/wx/**,/bfc/plat/data/**,/bfc/tenant/init/check,/bfc/error,/bfc/api/**,/seal/open/getCount,/flow/raReport/**";
        String[] split = s.split(",");
        for (String str : split){
            System.out.println(str);
        }
    }

}
