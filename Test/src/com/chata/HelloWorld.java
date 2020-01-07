package com.chata;

public class HelloWorld {

    final Integer x = 10;
    public   void test(){
        System.out.println("Hello chata!");

    }

    public static  void main(String[] args){
        int a = 50;
        int b = 30;
        int ter = a<b?100:200;
        System.out.println(ter);
            HelloWorld helloWorld = new HelloWorld();
            helloWorld.test();
    }
}
