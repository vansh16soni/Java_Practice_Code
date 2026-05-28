package com.vansh;

public class mathod {
//    static int logic(int x,int y) {
//        int z;
//        if (x > y) {
//            z = x + y;
//        } else {
//            z = (x + y) * 2;
//        }
//        return z;
//    }
 int logic(int x,int y) {
    int z;
    if (x > y) {
        z = x + y;
    } else {
        z = (x + y) * 2;
    }
    return z;
}
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int c;
        mathod obj = new mathod();
        c= obj.logic(a,b);
        System.out.println(c);
        }

    }

