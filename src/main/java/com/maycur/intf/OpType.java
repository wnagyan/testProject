package com.maycur.intf;

import lombok.Data;

@Data
public class OpType {

    private String name;

    public String name(){
         return this.name;
    }
}
