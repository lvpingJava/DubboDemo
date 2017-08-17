package com.lp.demo.bean;

import java.io.Serializable;

/**
 * Created by lvping on 2017/8/2.
 */
public class Test implements Serializable{
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
