package ua.hillel.samoilyk.homeworks.Homework14;

public class Main {
    public static void main(String[] args) {
        FitnessTracker person1 = new FitnessTracker("Adam", "Popa",
                26, 6, 2004,
                "Popa@gmail.com",
                4802565477L,
                55, 116,
                11056);
        System.out.println(person1.printAccountInfo());
        System.out.println();

        person1.surname = "JaNePopa";
        person1.weight = 50;
        System.out.println(person1.printAccountInfo());
        System.out.println("...........................................................");


        FitnessTracker person2 = new FitnessTracker("Leo", "Romantic",
                5, 10, 1980,
                "Romantic@gmail.com",
                9202565410L,
                60, 126,
                15777);
        System.out.println(person2.printAccountInfo());
        System.out.println();

        person2.pressure = 0;
        person2.steps = 0;
        System.out.println(person2.printAccountInfo());
        System.out.println("...........................................................");


        FitnessTracker person3 = new FitnessTracker("Sofia", "Strashna",
                14, 3, 1995,
                "Strashna@gmail.com",
                7802565424L,
                100, 144,
                410);
        System.out.println(person3.printAccountInfo());
        System.out.println();

        person3.weight = 70;
        person3.pressure = 126;
        person3.steps = 20117;
        System.out.println(person3.printAccountInfo());
        System.out.println("...........................................................");
    }
}
