package com.vansh;

import java.util.ArrayDeque;

public class dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.add(10);
        d1.add(8);
        System.out.println(d1.getFirst());
    }
}
