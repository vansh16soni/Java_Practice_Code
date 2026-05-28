package com.vansh;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> MyHaashSet = new HashSet<>(6,0.9f);
        MyHaashSet.add(6);
        MyHaashSet.add(8);
        MyHaashSet.add(3);
        MyHaashSet.add(11);
        System.out.println(MyHaashSet);
    }
}
