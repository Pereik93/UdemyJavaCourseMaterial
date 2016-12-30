package com.polymorphismchallenge;

/**
 * Created by perol on 15.12.2016.
 */
public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHaburgerAddition1("Chips", 2.75);
        super.addHaburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHaburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHaburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHaburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHaburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
