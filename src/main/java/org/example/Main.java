package org.example;

import org.example.module.AddCommas;

public class Main {
    public static void main(String[] args) {
        AddCommas ac = new AddCommas();

        System.out.println(ac.addComma(1000000000));
    }
}