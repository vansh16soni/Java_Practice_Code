package com.vansh;


//class Cylinder{
//   private int  h;
//   private float r;
//
//    public Cylinder(int h,float r) {
//        this.h = h;
//        this.r=r;
//    }
//
//    public int getH() {
//        return h;
//    }
//
//    public void setH(int h) {
//        this.h = h;
//    }
//
//    public float getR() {
//        return r;
//    }
//
//    public void setR(float r) {
//        this.r = r;
//    }
//    public double surfacearea(){
//        return ((2*3.14*r*h)+2*3.14*r*r);
//    }
//    public double volume(){
//     return (3.14*r*r*h);
//    }
//}
//
//class Rectangle{
//    private int lenght,width;
//
//    public Rectangle(int lenght, int width) {
//        this.lenght = lenght;
//        this.width = width;
//    }
//
//    public int getLenght() {
//        return lenght;
//    }
//
//    public void setLenght(int lenght) {
//        this.lenght = lenght;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//}

class Sphere{
    private float r;

    public Sphere(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    public double surface(){
        return 4*3.14*r*r;
    }
    public double volumw(){
        return (4/3)*3.14*r*r*r;
    }
}
public class practiceseton_constructor {
    public static void main(String[] args) {
//        Cylinder c= new Cylinder(1,2.0f);
//       // c.setH(2);
//        //c.setR(2.0f);
//
//        System.out.println(c.getH());
//        System.out.println(c.getR());
//
//        System.out.println(c.surfacearea());
//        System.out.println(c.volume());

//        Rectangle r=new Rectangle(2,3);
//        System.out.println(r.getLenght());
//        System.out.println(r.getWidth());

        Sphere s=new Sphere(3);
        System.out.println(s.getR());
        System.out.println(s.surface());
        System.out.println(s.volumw());
   }
}
