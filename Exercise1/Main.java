package com.fasttrackit.Exercise1;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        Company floralDeco = new Company(asList(new Facebook(), new Email(), new Print()));

        for (int i = 0; i < 10; i++) {
            floralDeco.advertiseWith("Facebook");
        }
        for (int i = 0; i < 5; i++) {
            floralDeco.advertiseWith("Email");
        }
        for (int i = 0; i < 2; i++) {
            floralDeco.advertiseWith("Paper Print");
        }

        floralDeco.printReport();


    }
}
