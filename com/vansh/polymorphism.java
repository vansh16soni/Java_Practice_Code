package com.vansh;

interface Camera2{
    void takeSnap();
    void Recordvideo();
    private void greet(){
        System.out.println("mornig");
    }
    default void video(){
        greet();
        System.out.println("Recoeding video...in ak");
    }
}
interface wifi2{
    String [] getNetworks();
    void ConnectToNetwork(String networks);
}
class CellPhone2{
    void cellNUmber(int phonenum){
        System.out.println("Calling "+ phonenum);
    }
}
class SmartPhone2 extends CellPhone2 implements wifi2,Camera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void Recordvideo(){
        System.out.println("Recording Video");
    }
    public String [] getNetworks(){
        System.out.println("Getting list of networks: ");
        String[] networks={" Vansh"," Vanshika"," Gagan"};
        return networks;
    }
    public void ConnectToNetwork(String networks){
        System.out.println("Connecting to "+ networks);
    }

//     public void video(){
//         System.out.println("Recoeding video and snaping");
//     }
}
public class polymorphism{
    public static void main(String[] args) {
        Camera2 cam1 =new SmartPhone2();
        cam1.Recordvideo();
        }
    }

