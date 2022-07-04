package com.fasttrackit.Exercise3;

public class Duck implements Animal {
    @Override
    public String walk() {
        return "duck-walking";
    }

    @Override
    public boolean talk() {
        return false;
    }

    @Override
    public String eat() {
        return "duck-eating";
    }
}
