package ua.hillel.samoilyk.homeworks.Homework13;

public class Burger {
    int bun;
    int meat;
    int cheese;
    int green;
    int mayo;


    Burger(int amountOfBun, int amountOfMeat, int amountOfCheese, int amountOfGreen, int amountOfMayo) {
        System.out.println(AllPossibleBurgers());

        this.bun = amountOfBun;
        this.meat = amountOfMeat;
        this.cheese = amountOfCheese;
        this.green = amountOfGreen;
        this.mayo = amountOfMayo;

        TypeOfBurger(bun, meat, cheese, green, mayo);
    }


    void TypeOfBurger(int amountOfBun, int amountOfMeat, int amountOfCheese, int amountOfGreen, int amountOfMayo) {

        // Якщо класичний бургер
        if (amountOfBun == 2
                && amountOfMeat == 1
                && amountOfCheese == 1
                && amountOfGreen == 1
                && amountOfMayo == 1) {
            System.out.println("\nThis is classic burger: " + bun + "x bun, meat, cheese, green, mayo");
        }

        // Якщо дієтичний бургер
        else if (amountOfBun == 2
                && amountOfMeat == 1
                && amountOfCheese == 1
                && amountOfGreen == 1
                && amountOfMayo == 0) {
            System.out.println("\nThis is diet burger: " + bun + "x bun, meat, cheese, green.");
        }

        // Якщо бургер із подвійним м'ясом
        else if (amountOfBun == 2
                && amountOfMeat == 2
                && amountOfCheese == 1
                && amountOfGreen == 1
                && amountOfMayo == 1) {
            System.out.println("\nThis is double meat burger: " + bun + "x bun, " + meat + "x meat, cheese, green, mayo");
        }

        // Якщо склад бургер не збігається
        else {
            System.out.println("\nCouldn't find a burger with this ingredients!");
        }
    }


    // Написання кількості інгредієнтів
    String PrintBurgerIngredients() {
        return "\nAmount of bun: " + bun
                + "\nAmount of meat: " + meat
                + "\nAmount of cheese: " + cheese
                + "\nAmount of green: " + green
                + "\nAmount of mayo: " + mayo;
    }


    // Написання типів бургерів
    String AllPossibleBurgers() {
        return """
                Classic burger: 2 bun, 1 meat, 1 cheese, 1 green, 1 mayo.
                Diet burger: 2 bun, 1 meat, 1 cheese, 1 green, 0 mayo.
                Double meat burger: 2 bun, 2 meat, 1 cheese, 1 green, 1 mayo.""";
    }


}