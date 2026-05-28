package vansh.dsa;

public class BIt_Manupulation_Set {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int newNUmber = bitMask | n;
        System.out.println(newNUmber);
    }
}
