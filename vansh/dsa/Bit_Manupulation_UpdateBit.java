package vansh.dsa;

import java.util.Scanner;

public class Bit_Manupulation_UpdateBit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int bit;
        Scanner sc = new Scanner(System.in);
        System.out.println("case 1 for 0");
        System.out.println("case 2 for 1");
        System.out.println("Enter which bit to update (0 or 1): ");
        bit =sc.nextInt();

        switch (bit){
            case 1:
                int newNum=(~(bitMask)&n);
                System.out.println(newNum);
                break;

            case 2:
                int newNUmber = bitMask | n;
                System.out.println(newNUmber);
                break;

            default:
                System.out.println("No such bit available");
        }
    }
}
