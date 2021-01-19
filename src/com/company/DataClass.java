package com.company;


public class DataClass {
    private int a;

    public DataClass(){}

    public DataClass(int a){
        this.a = a;
    }


    public void showMe(){
        System.out.println("Show me!!!");
    }

    public void lessThanZero(){
        if(a < 10){
            System.out.println("a less than ten");
        }
    }

    public void moreThanZeroOrElse(){
        if(a>0){
            System.out.println("a more than zero");
        }else{
            System.out.println("a less than or equals zero");
        }
    }

    public void ifElseIf(){
        if(a>0){
            System.out.println("a more than zero");
        }else if (a<0){
            System.out.println("a less than zero");
        }else{
            System.out.println("a equals zero");
        }
    }

    public void setA(int a){
        this.a = a;
    }

    public int getA(){
        return a; //this.a
    }
}
