package com.cc.java;

public class Bird implements Flyable, IFeathers  {

    @Override
    public String hasFeathers() {
    return "Birds have feathers";
    }

    @Override
    public String fly() {
        return "I can fly at 20mph!";    

    }


}
