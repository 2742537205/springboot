package com.bjpowernode.springboot.model;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer sid;

    private String sname;

    private Integer sage;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }
}