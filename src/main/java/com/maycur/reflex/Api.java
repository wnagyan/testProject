package com.maycur.reflex;

import com.maycur.intf.annotation.OpLog;
import com.maycur.intf.annotation.RequestMapping;

@RequestMapping(value = "title")
public interface Api {

    @RequestMapping(value = "post")
    void save();
}
