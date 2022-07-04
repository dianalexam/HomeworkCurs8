package com.fasttrackit.Exercise3;

public class Mouse implements Animal {
    @Override
    public String walk() {
        return "mouse-walking";
    }

    @Override
    public boolean talk() {
        return false;
    }

    @Override
    public String eat() {
        return "mouse-eating";
    }
}
