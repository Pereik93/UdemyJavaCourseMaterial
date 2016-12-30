package com.polymorphismchallenge;

public class Main {

    public static void main(String[] args) {
    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHaburgerAddition1("Tomato", 0.27);
        hamburger.addHaburgerAddition2("Lettuce", 0.75);
        hamburger.addHaburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHaburgerAddition1("Egg", 5.43);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("Lentils", 3.41);

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();



    }
}
