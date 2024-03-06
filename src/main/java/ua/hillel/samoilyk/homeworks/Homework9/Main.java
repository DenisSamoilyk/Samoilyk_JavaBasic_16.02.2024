package ua.hillel.samoilyk.homeworks.Homework9;

public class Main {
    public static void main(String[] args) {

    // Рандомне вік від 18 до 40
        int minAge = 18;
        int maxAge = 40;

    // Пронумування команд
        int numberingOfTeams = 1;

    // Зміна кількість команд та гравців
        int amountTeams = 2;
        int amountPlayers = 25;

        for (int i = 0; i < amountTeams; i++) {
            System.out.println("Age of players in Team " + numberingOfTeams + ":");
            numberingOfTeams++;

            // Сума віку усіх гравців
            double sumAge = 0;

            for (int j = 0; j < amountPlayers - 1; j++) {
                int age = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
                System.out.print(age + ", ");
                sumAge += age;

                if (j == amountPlayers - 2) {
                    int age1 = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
                    System.out.println(age1 + ".");
                    sumAge += age1;
                }
            }
            System.out.println("Average age: " + sumAge / amountPlayers);

            // Просто пробіл ¯\_(ツ)_/¯
            System.out.println();
        }
    }
}
