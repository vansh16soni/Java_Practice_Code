package com.vansh;

class Employe{
    private int id;
    private String name;
    public String  getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public void setid(int i){
        id=i;
    }
    public int getid(){
        return id;
    }
}
public class AcessModifiers {
    public static void main(String[] args) {
        Employe vansh = new Employe();
        vansh.setname("VAnsh");
        vansh.setid(6);
        System.out.println(vansh.getname());
        System.out.println(vansh.getid());

    }
}
