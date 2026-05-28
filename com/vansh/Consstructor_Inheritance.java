package com.vansh;
class Base1{
     Base1() {
         System.out.println("I am a base constructor");
    }

    public Base1(int x) {
        System.out.println("i am a vale base constructor "+ x);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
   public int y;

     Derived1() {
        // super(9);
         System.out.println("I am a Derived constructor");
    }
    Derived1(int x,int y){
         super(x);
        System.out.println("value of y "+ y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ChildofDerived extends Derived1{
    ChildofDerived(){
        System.out.println("I am a child");
    }
    ChildofDerived(int x,int y, int z){
        super(x, y);
        System.out.println("value of z"+  z);
    }
}
public class Consstructor_Inheritance {
    public static void main(String[] args) {
       // Base1 b=new Base1();
       // Derived1 d =new Derived1();
        ChildofDerived c=new ChildofDerived(3,2,5);
    }
}
