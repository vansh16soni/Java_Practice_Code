package com.vansh;

public class mutlidimensionalarray {
    public static void main(String[] args) {
        int [][] flats= new int[2][2];
        flats[0][0]=1;
        flats[0][1]=2;
        flats[1][0]=3;
        flats[1][1]=4;

        for (int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
}
