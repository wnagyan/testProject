package com.test;

import lombok.Getter;

@Getter
public enum StatusType {

    RUN(1, "跑步"),
    SLEEP(2, "睡觉"),
    EAT(3, "吃饭")
    ;

    private Integer val;
    private String desc;

    StatusType(Integer val, String desc) {
        this.val = val;
        this.desc = desc;
    }

}
