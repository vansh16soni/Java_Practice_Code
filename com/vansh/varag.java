package com.vansh;

public class varag {
    static int sum(int x,int...arr){
        int result=x;
        for (int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 2 and 5: "+sum(2,3,4,5));
    }
}
