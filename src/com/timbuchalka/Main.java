package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // width 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " +myIntValue);
        System.out.println("myFloatValue = " +myFloatValue);
        System.out.println("myDoubleValue = " +myDoubleValue);
    }
}
