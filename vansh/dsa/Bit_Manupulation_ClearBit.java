package vansh.dsa;

public class
Bit_Manupulation_ClearBit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
       int newNum=(~(bitMask)&n);
        System.out.println(newNum);
    }
}
