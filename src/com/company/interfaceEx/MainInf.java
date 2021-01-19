package com.company.interfaceEx;

import com.company.interfaceEx.impl.EarlImpl;
import com.company.interfaceEx.impl.EarthImpl;

public class MainInf {
    public static void main(String... args){
//        EarthImpl earth = new EarthImpl();
//        earth.walk();
//        System.out.println(earth.talk());
//        earth.Drawing();
//
//        EarlImpl earl = new EarlImpl();
//        earl.walk();
//        System.out.println(earl.talk());
//        earl.swimming();

        HumanInterface a = new EarlImpl();
        HumanInterface b = new EarlImpl();
        execute(new EarthImpl());
        execute(new EarlImpl());

        EarlImpl test = new EarlImpl();
        test.discount();
    }

    public static void execute(HumanInterface hu){
        System.out.println(hu.talk());
        hu.walk();
        hu.ability();
    }
}
