package com.vansh;

import java.util.Date;

public class daye_and_time {
    public static void main(String[] args) {
//        long l;
//        System.out.println(l=System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());
    }
}
