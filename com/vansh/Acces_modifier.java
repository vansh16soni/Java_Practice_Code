package com.vansh;

class C1{
    public int x=5;
    protected int y=45;
    int z=6;
    private int a=87;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class Acces_modifier {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);
    }
}
