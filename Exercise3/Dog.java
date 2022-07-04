package com.fasttrackit.Exercise3;

public class Dog implements Animal {
    @Override
    public String walk() {
        return "dog-walking";
    }

    @Override
    public boolean talk() {
        return false;
    }

    @Override
    public String eat() {
        return "dog-eating";
    }
}
