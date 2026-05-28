package com.vansh;

import java.util.*;

public class Collection_FrameWork {
    public static void main(String[] args) {
     ArrayList<Integer> l1 = new ArrayList<>();
     ArrayList<Integer> l2 = new ArrayList<>(5);
     l2.add(10);
     l2.add(11);
     l2.add(15);
     l1.add(6);
     l1.add(7);
     l1.add(5);
     l1.add(4);
     l1.add(6);
     l1.add(0,4);
     l1.add(5,1);
     l1.add(0,6);
     l1.addAll(l2);
       // System.out.println(l1);
//       System.out.println("Size of ArrayList is "+l1.size());
//        for (int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }
        System.out.println(l1.contains(20));
      //  System.out.println(l1.indexOf(69));
        System.out.println(l1.lastIndexOf(6));
        l1.set(0,100);
        System.out.println(l1);
    }
}
