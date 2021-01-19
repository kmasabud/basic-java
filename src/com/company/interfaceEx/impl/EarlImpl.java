package com.company.interfaceEx.impl;

import com.company.interfaceEx.HumanInterface;

public class EarlImpl implements HumanInterface {

    @Override
    public void walk(){
        System.out.println("earl walk");
    }

    @Override
    public String talk(){
        return "jib jib";
    }

    @Override
    public void ability(){
        swimming();
    }

    private void swimming(){
        System.out.println("Earl swimming");
    }


    public void discount(){

    }



}
