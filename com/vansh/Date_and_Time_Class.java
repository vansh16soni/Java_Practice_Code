package com.vansh;
import java.util.*;
public class Date_and_Time_Class {
    public static void main(String[] args) {
      //  Date d= new Date();
      //  System.out.println("The current date is : " + d);

//        Date d1= new Date(1621709639111l);
//        System.out.println("The date calculated form miliseconds is : " + d1);


//         Date d1= new Date(2021,12, 24);  //both dates are different
//        System.out.println(d1.compareTo(d));
//
//        Date d= new Date(2021,5,23);
//
//        System.out.println("The number of milliseonds passed since Jan 1, 1970 :" +d.getTime() );
//
//        Date d= new Date();
//        System.out.println("The current date is : "+ d.getDate());
//        System.out.println("The current year is : "+ d.getYear());

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());

    }
}
