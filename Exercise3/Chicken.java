package com.fasttrackit.Exercise3;

public class Chicken implements Animal {
    @Override
    public String walk() {
        return "chicken-walking";
    }

    @Override
    public boolean talk() {
        return false;
    }

    @Override
    public String eat() {
        return "chicken-eating";
    }
}
