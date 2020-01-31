package com.chata;

public class StringDemo {
    public static void main(String[] args) {
        String s = "Chatson";
        String x = "Hellooo";

        System.out.println(s.length());
        System.out.println(s.substring(2));

        System.out.println(x.compareTo(s));

        String replace = x.replace("o","e");


        System.out.println(replace);



        ///String buffer
        StringBuffer str = new StringBuffer("Welcome to chatson land");


        str.append("\nHello Chata");


        //insert method

        str.insert(0,"Chatson lanka\n");

        System.out.println(str);
    }
}
