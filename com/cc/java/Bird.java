package com.cc.java;

public class Bird implements Flyable, IFeathers  {

    @Override
    public String feather() {
    return "Birds have feathers";
    }

    @Override
    public String fly() {
    return "I can fly at 20mph!";    
    }


}
