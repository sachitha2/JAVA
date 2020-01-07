package com.chata;

public class Calc {
    public int add(int arg1,int arg2){
        return arg1+arg2;
    }

    public  int add(int arg1,int arg2,int arg3){

        return  arg1+arg2+arg3;
    }
    public static void main(String[] args){
        Calc calc = new Calc();
        System.out.println("Value id"+calc.add(10,20,40));
    }
}
