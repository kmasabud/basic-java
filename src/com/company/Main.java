package com.company;

import com.company.abstractEx.ShopInfo;

import java.math.BigDecimal;

public class Main {
    //[main, DataClass.lessThanZero]
    public static void main(String[] args) {
        int a = 1;
        DataClass obj = new DataClass();
        obj.setA(a);
        System.out.println(obj.getA());

        obj.lessThanZero();//a
        obj.moreThanZeroOrElse();//a
        obj.ifElseIf();//a
    }
}
