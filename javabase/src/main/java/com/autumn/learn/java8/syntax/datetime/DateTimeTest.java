package com.autumn.learn.java8.syntax.datetime;

import java.util.Calendar;
import java.util.regex.Pattern;

public class DateTimeTest {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021,5,1);
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        System.out.println((calendar.get(Calendar.MONTH)+1) +"-" + calendar.get(Calendar.DAY_OF_MONTH));

        String s1 = "01a234bcd5";
        String s2 = Pattern.compile("[a-z]").matcher(s1).replaceAll("AB");
        System.out.println(s2);
    }
}
