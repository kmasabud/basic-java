package com.company.interfaceEx.impl;

import com.company.interfaceEx.HumanInterface;

public class EarthImpl implements HumanInterface {
    @Override
    public void walk(){
        System.out.println("Earth walk");
    }

    @Override
    public String talk(){
        return "honk honk";
    }

    @Override
    public void ability() {
        drawing();
    }

    private void drawing(){
        System.out.println("earth drawing");
    }
}
