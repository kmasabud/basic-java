package com.company;

import java.math.BigDecimal;

public class Object {

    ///[main class, lessthanZeo,moreThanZeroOrElse, e[BigDecimal] -> non memory [showMe]

    public static void main(String... args){
        int a = 1;
        lessThanZero(a);
        moreThanZeroOrElse(a);
        ifElseIf(a);
    }

    public static void lessThanZero(int data){
        if(data < 10){
            System.out.println("a less than ten");
        }
    }

    public static void moreThanZeroOrElse(int data){
        if(data>0){
            System.out.println("a more than zero");
        }else{
            System.out.println("a less than or equals zero");
        }
    }

    public static void ifElseIf(int data){
        if(data>0){
            System.out.println("a more than zero");
        }else if (data<0){
            System.out.println("a less than zero");
        }else{
            System.out.println("a equals zero");
        }
    }

}
