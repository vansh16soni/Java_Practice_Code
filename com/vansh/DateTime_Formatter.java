package com.vansh;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter fdt = DateTimeFormatter.ofPattern("dd-yy-mm");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(df);
        String Mydate = dt.format(fdt);
        System.out.println(Mydate);
    }
}
