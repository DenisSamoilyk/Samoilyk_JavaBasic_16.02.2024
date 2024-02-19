package ua.hillel.samoilyk.homeworks.Homework5;

public class Main {
    public static void main(String[] args) {

        // Лі
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;

        int warriorsLi = 860;

        int sumAttackLi = (warriorLi + archerLi + riderLi) * warriorsLi;
        System.out.println("Загальна атака армії Лі: " + sumAttackLi);


        // Мінь
        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;

        double warriorsMin = 1.5;

        double sumAttackMin = ((warriorMin + archerMin + riderMin) * (warriorsLi * warriorsMin));
        System.out.println("Загальна атака армії Мінь: " + (int) sumAttackMin);

    }
}
