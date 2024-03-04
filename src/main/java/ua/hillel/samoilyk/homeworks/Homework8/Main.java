package ua.hillel.samoilyk.homeworks.Homework8;

public class Main {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; counter < 10; i++) {
            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
                continue;
            }
            System.out.println(i);
            counter++;
        }


    }
}