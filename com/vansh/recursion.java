package com.vansh;

public class recursion {
    static int factorial(int n){
        int fact=1;
        if(n==0||n==1){
            return n=1;
        }
        else {
            fact = n * factorial(n - 1);
        }
        return fact;
    }
    static int fact(int x){
        if (x==0||x==1){
            return x=1;
        }
        else {
            int pro=1;
            for(int i=1;i<=x;i++){
                pro *=i;
            }
            return pro;
        }
    }
    static int fibo(int y){
        if (y==0||y==1){
            return y;
        }
        else {
            return fibo(y-1)+fibo(y-2);
        }
    }
    public static void main(String[] args) {
        int f ;//=factorial(4);
        f=fact(5);

        int a=4;
        System.out.println("Series: ");
        for (int i=0;i<a;i++){
            System.out.println(fibo(i)+",");
        }
    }
}
