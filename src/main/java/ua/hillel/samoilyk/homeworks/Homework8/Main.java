package ua.hillel.samoilyk.homeworks.Homework8;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("9")) {
                continue;
            }
            System.out.println(i);
        }




    }
}