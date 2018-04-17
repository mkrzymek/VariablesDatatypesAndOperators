package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        floatAndDouble();
//        charAndBoolean();
//        primitiveTypesAndString();
        operatorsInJava();
    }

    private static void floatAndDouble() {
        // width 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width 64 (8 bytes)
        double myDoubleValue = 5d / 2d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }

    private static void charAndBoolean() {
        char myChar = 'D'; // any ONE character
        char myUnicodeChar = '\u00A9';
        System.out.println(myUnicodeChar);

        boolean myBoolean = true; // only true or false
    }

    private static void primitiveTypesAndString() {
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

    private static void operatorsInJava() {
        int result = 1 + 2;

        int previousResult = result;

        result = result - 1;
        System.out.println("result = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(result);

        previousResult = result;
        result++;
        System.out.println(result);

        result *= 5;
        System.out.println(result);

        result -= 10;
        System.out.println(result);

        result /= 5;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == true) {
            System.out.println("It is not an Alien");
        }

        int topScore = 80;
        if(topScore >= 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater than second top score and less then 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("one of these test is true");
        }

        int newValue = 50;
        if(newValue == 50)
            System.out.println("this is an error");

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("to nie powinno sie zdarzyc");
        }

        boolean wasCar = isCar ? true : false;
    }
}
