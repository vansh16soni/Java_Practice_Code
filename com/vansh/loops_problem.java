package com.vansh;

public class loops_problem {
    public static void main(String[] args) {
        // 1
//        int n=5;
//        for(int i=n;i>0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

//        // 2
//        int i=0;
//        int sum=0;
//        while(i<=4){
//            i++;
//            sum = sum+(i);
//        }
//        System.out.print("Sum of even num: ");
//        System.out.println(sum);

//        //3 and 4
//        int n=10;
//        for(int i=10;i>=0;i--){
//            System.out.printf("%d X %d = %d\n",n,i,i*n);
//        }

        // 5
//        int f=1;
//        int n=4;
//        for ( int i=1;i<=n;i++){
//            f=f*i;
//        }
//        System.out.println(f);

        //6
//        int f=1;
//        int n=4;
//        int i=0;
//        while (i<n){
//            i++;
//            f*=i;
//        }
//        System.out.println(f);

        //7

        int n=4;
        int i=n;
        while(i>0){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println("\n");
            i--;
        }

        //8
//        int n=8;
//        int sum=0;
//        for(int i=0;i<=10;i++){
//            sum+=n*i;
//        }
//        System.out.println(sum);
//

        //9
//        int n=3;
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum=sum+(2*i);
//        }
//        System.out.println(sum);
    }
}
