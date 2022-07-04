package com.fasttrackit.Exercise2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(new BT());
        Person person2 = new Person(new BRD());
        Person person3 = new Person(new ING());

        System.out.println(person1.performDeposit(100));
        System.out.println(person1.checkBalance());
        System.out.println(person1.performWithdrawal(50.5));
        System.out.println(person1.checkBalance());
        System.out.println(person1.checkBankName());

        System.out.println(person2.performWithdrawal(50));
        System.out.println(person2.performDeposit(100));
        System.out.println(person2.performWithdrawal(50));
        System.out.println(person2.checkBalance());
        System.out.println(person2.checkBankName());

        System.out.println(person3.performDeposit(1000));
        System.out.println(person3.checkBankName());

    }
}
