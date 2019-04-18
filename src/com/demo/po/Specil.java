package com.demo.po;

import lombok.Data;

@Data
public class Specil {
    private int sid;
    private int did;
    private String scode;
    private String sname;
    private String saim;
    private String sprodire;

    @Override
    public String toString() {
        return "Specil{" +
                "sid=" + sid +
                ", did=" + did +
                ", scode='" + scode + '\'' +
                ", sname='" + sname + '\'' +
                ", saim='" + saim + '\'' +
                ", sprodire='" + sprodire + '\'' +
                '}';
    }
}
