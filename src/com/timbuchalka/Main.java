package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        floatAndDouble();
        charAndBoolean();
        primitiveTypesAndString();
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

    private static void primitiveTypesAndString () {
        // primitive datatypes (8)
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String class

        String myString = "This is a string";
        myString += "123";
        System.out.println(myString);

        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNumber = 127.45;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }


}
