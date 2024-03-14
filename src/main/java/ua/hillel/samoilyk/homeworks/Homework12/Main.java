package ua.hillel.samoilyk.homeworks.Homework12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення змінних
        String name;
        String surname;
        String city;
        String phoneNumber;

        int numberOfPersons = 3;
        System.out.println("Write info of " + numberOfPersons + " person(s):");
        for (int i = 0; i < numberOfPersons; i++) {

            // Введення імені
            System.out.print("Name: ");
            name = scanner.nextLine();

            // Введення прізвища
            System.out.print("Surname: ");
            surname = scanner.nextLine();

            // Введення міста
            System.out.print("City: ");
            city = scanner.nextLine();

            // Введення мобільного номера
            System.out.print("Number: ");
            phoneNumber = scanner.nextLine();

            // Виклик методу personInfo
            System.out.println(personInfo(name, surname, city, phoneNumber));
        }
    }


    // Метод personInfo
    static String personInfo(String Name, String Surname, String City, String Number) {
        return ("Зателефонувати громадянину " + Name + " " + Surname
                + " із міста " + City + " можна за номером: " + Number + "\n");
    }
}