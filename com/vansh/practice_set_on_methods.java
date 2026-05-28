package com.vansh;

public class practice_set_on_methods {
    static void mul(int n){
        for (int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d",n,i,n*i);
            System.out.println();
        }
    }

    static void pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<(i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern_rec(int n){

      if(n>0){
          pattern_rec(n-1);
          for(int i=0;i<n;i++){
              System.out.print("*");
          }
          System.out.println();
      }

    }

    static int sum(int n){
        if (n==0){
            return n;
        }
        return n+sum(n-1);
    }

    static void pattern2(int n){
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2_rec(int n){
        if (n>0){
            for(int i=n;i>=1;i--){
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n-1);
        }
    }

    static int fibo(int y){
        if (y==1){
            return 0;
        }
        else if (y==2) {
            return 1;
        }
        else {
            return fibo(y-1)+fibo(y-2);
        }
    }

    static int avg(int...a){
        int sum=0;
        for(int e:a){
            sum=sum+e;
        }
        return (sum/(a.length));

    }

    static int con(int n){
        int result=n*32;
        return result;
    }
    public static void main(String[] args) {
        //1
      // mul(2);

        //2
       // pattern(4);

        //3
//       int c= sum(3);
//        System.out.println(c);

        //4
        //pattern2(4);

        //5 fibonachi
//        int result=fibo(7);
//        System.out.println(result);

        //6
//        int c=avg(1,2,3);
//

        //7
       // pattern2_rec(4);

        //8
        //pattern_rec(4);

        //9
        System.out.println("tem in degree c: ");
        int c=32;
        System.out.println(c);
        System.out.println("temp in degree f: ");
        int f=con(32);
        System.out.println(f);
    }
}