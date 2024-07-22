package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        Bird bird = new Bird();
        output(bird.fly());
        output(bird.feather());
      
     
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

