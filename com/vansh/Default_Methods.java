package com.vansh;

interface Camera{
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
interface wifi{
    String [] getNetworks();
    void ConnectToNetwork(String networks);
}
class CellPhone{
    void cellNUmber(int phonenum){
        System.out.println("Calling "+ phonenum);
    }
}
 class SmartPhone extends CellPhone implements wifi,Camera{
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
public class Default_Methods {
    public static void main(String[] args) {
     SmartPhone s =new SmartPhone();
     s.video();
     String[] ar=s.getNetworks();
     for(String item:ar){
         System.out.println(item);
     }
    }
}
