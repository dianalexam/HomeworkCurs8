package com.fasttrackit.Exercise3;

public class Cat implements Animal{
    @Override
    public String walk() {
        return "cat-walking";
    }

    @Override
    public boolean talk() {
        return false;
    }

    @Override
    public String eat() {
        return "cat-eating";
    }
}
