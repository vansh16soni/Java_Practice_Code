package com.vansh;
class myEmploye{
    private int id;
    private String name;
    public myEmploye(String myname, int i){
        id = i;
        name = myname;
    }
    public myEmploye(){
        id = 5;
        name = "Soni";
    }
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
public class Constructor {
    public static void main(String[] args) {
        myEmploye e=new myEmploye();
        myEmploye ev=new myEmploye("Vansh",8);
        System.out.println(e.getid());
        System.out.println(e.getname());
        System.out.println(ev.getid());
        System.out.println(ev.getname());
    }
}
