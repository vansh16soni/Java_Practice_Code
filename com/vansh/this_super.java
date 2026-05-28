package com.vansh;

class EKclass{
    int a;

    public int getA() {
        return a;
    }

    EKclass(int a){
        this.a=a;
    }
    public int returnnone(){
        return 1;
    }
}
public class this_super {
    public static void main(String[] args) {
    EKclass e=  new EKclass(9);
        System.out.println(e.getA());
    }
}
