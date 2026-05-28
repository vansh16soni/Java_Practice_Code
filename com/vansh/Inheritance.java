package com.vansh;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printme(){
        System.out.println("i am setting x now");
    }
}
class Derive extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
     Derive d=new Derive();
     d.printme();
     d.setX(5);
        System.out.println(d.getX());

    }
}
