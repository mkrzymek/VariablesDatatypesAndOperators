package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        floatAndDouble();
        charAndBoolean();
    }

    private static void floatAndDouble() {
        // width 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width 64 (8 bytes)
        double myDoubleValue = 5d / 2d;
        System.out.println("myIntValue = " +myIntValue);
        System.out.println("myFloatValue = " +myFloatValue);
        System.out.println("myDoubleValue = " +myDoubleValue);
    }

    private static void charAndBoolean () {
        char myChar = 'D'; // any ONE character
        char myUnicodeChar = '\u00A9';
        System.out.println(myUnicodeChar);

        boolean myBoolean = true; // only true or false
    }

}
