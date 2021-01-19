package com.company;

public class IfElse {
    public static void main(String... args) {

        int a = 1;
        if(a < 10){
            System.out.println("a less than ten");
        }


        if(a>0){
            System.out.println("a more than zero");
        }else{
            System.out.println("a less than or equals zero");
        }


        if(a>0){
            System.out.println("a more than zero");
        }else if (a<0){
            System.out.println("a less than zero");
        }else{
            System.out.println("a equals zero");
        }
    }
}
