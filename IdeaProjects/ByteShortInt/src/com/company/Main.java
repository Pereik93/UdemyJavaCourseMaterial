package com.company;

public class Main {

    public static void main(String[] args) {

        // default value in java is Int, this is why we have to cast
        // the values other than int.

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue =  2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValeu = (byte)(myMinByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValeu);

        // short has a width of 16
        short myMinShortValue = -32_768;
        short myMaxShortValue = 32_767;
        short myNewShortValue = (short) (myMaxShortValue / 2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has a width of 64
        long myMinLongValue = -9_223_372_036_854_755_808L;
        long myMaxLongValue = 9_223_372_036_854_755_807L;
        // no need to cast here since long will accept an Integer.
        long myNewLongValue = (myMaxLongValue / 2);
        System.out.println("myNewLongValue = " + myNewLongValue);

    }
}
