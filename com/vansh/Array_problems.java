package com.vansh;

public class Array_problems {
    public static void main(String[] args) {
        //1
//        float [] num ={1.1f,2.2f,3.3f,4.4f,5.5f};
//        float sum=0;
//        for (float e:num){
//            sum=sum+e;
//        }
//        System.out.println(sum);

        //2
//        int[] marks = {1, 2, 3, 4, 5};
//        int num = 6;
//        boolean present = false;
//        for (int element : marks) {
//            if (num == element) {
//                present = true;
//                break;
//            }
//        }
//        if(present){
//            System.out.println("yes");
//        }
//        else System.out.println("no");

        //3
//        int []marks={1,2,3,4,5};
//        float sum=0;
//        for (int e:marks){
//            sum=sum+e;
//        }
//        System.out.println("average");
//        System.out.println(sum/marks.length);

        //4
//        int [][] mat1={{1,1},{2,2}};
//        int [][] mat2={{1,1},{2,2}};
//        int [][] mat3={{0,0},{0,0}};
//
//        for(int i=0;i< mat1.length;i++){
//            for(int j=0;j<mat1[i].length;j++){
//                mat3[i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
//
//        for (int i=0;i<mat3.length;i++){
//            for(int j=0;j<mat3[i].length;j++){
//                System.out.print(mat3[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        //5
//        int[] num = {1, 2, 3, 4};
//        System.out.println("Elements are");
//        for (int e : num) {
//            System.out.println(e);
//        }
//        System.out.println("reverse");
//        int l = num.length;
//        int n = Math.floorDiv(l, 2);
//        for (int i = 0; i < n; i++) {
//            int t;
//            t = num[i];
//            num[i] = num[l - 1 - i];
//            num[l - 1 - i] = t;
//        }
//        for (int e:num){
//            System.out.println(e);
//        }

        //6
//        int [] num={1,2,3,5,4};
//        int max=0;
//        for(int e:num){
//            if(e>max) {
//                max = e;
//            }
//        }
//        System.out.println(max);

        //7
//        int [] num={1,2,3,5,4};
//        int min=Integer.MAX_VALUE;
//        for(int e:num){
//            if(e<min) {
//                min = e;
//            }
//        }
//        System.out.println(min);

        //8
        int [] num={2,4,3,1,5};
        boolean sort=true;
        for(int i=0;i< num.length;i++){
            if (num[i] > num[i+1]) {
                sort=false;
                break;
            }
        }
        if(sort) System.out.println("Sorted");
        else System.out.println("..|..");
    }
}