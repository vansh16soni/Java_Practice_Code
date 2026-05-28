package com.vansh;


import java.util.ArrayList;
import java.util.Scanner;


class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}



public class Generic {
    public static void main(String[] args) {
//        ArrayList myArrayList = new ArrayList();
//        myArrayList.add(10);  //Integer value
//        myArrayList.add(" Bhai!"); //String value
//        myArrayList.add(20.4); //Double value
//        System.out.println(myArrayList);


//        ArrayList myArrayList = new ArrayList();
//        myArrayList.add(10);  //Integer value
//        myArrayList.add("Bhai!"); //String value
//        myArrayList.add(20.4); //Double value
//
//        int x = myArrayList.get(0);
//        System.out.println(x);

//        ArrayList myArrayList = new ArrayList();
//        myArrayList.add(10);  //Integer value
//        myArrayList.add("Bhai!"); //String value
//        myArrayList.add(20.4); //Double value
//
//        int x = (int) myArrayList.get(0); //b=object typecasted into integer
//        System.out.println(x);

        ArrayList<Integer> arrayList = new ArrayList();
//        ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner(System.in));

        int a = (int) arrayList.get(0);
//        System.out.println(a);
        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}
