package ua.hillel.samoilyk.homeworks.Homework13;

public class Burger {
    boolean bun;
    boolean meat;
    boolean cheese;
    boolean green;
    boolean mayo;

    Burger() {
        System.out.println("Enter something to create a burger");
    }

    Burger(boolean bun, boolean meat, boolean cheese, boolean green, boolean mayo) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;

        if (bun && meat && cheese && green && mayo) {

            System.out.println("Classic burger"
                    + "\nHas bun: " + bun
                    + "\nHas meat: " + meat
                    + "\nHas cheese: " + cheese
                    + "\nHas green: " + green
                    + "\nHas mayo: " + mayo);
        }
    }

    Burger(boolean bun, boolean meat, boolean cheese, boolean green) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;

        if (bun && meat && cheese && green) {

            System.out.println("Diet burger"
                    + "\nHas bun: " + bun
                    + "\nHas meat: " + meat
                    + "\nHas cheese: " + cheese
                    + "\nHas green: " + green);
        }
    }


}