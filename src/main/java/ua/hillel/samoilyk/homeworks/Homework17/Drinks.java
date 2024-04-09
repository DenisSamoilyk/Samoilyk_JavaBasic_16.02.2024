package ua.hillel.samoilyk.homeworks.Homework17;

public class Drinks {
    public static final double COFFEE_PRICE  = 19.99;
    public static final double TEA_PRICE = 9.99;
    public static final double LEMONADE_PRICE = 14.49;
    public static final double MOJITO_PRICE = 29.99;
    public static final double MINERAL_WATER_PRICE = 4.49;
    public static final double COCA_COLA_PRICE = 24.49;


    private static int totalDrinksSold = 0;
    private static double totalRevenue = 0.0;


    public static int getTotalDrinksSold() {
        return totalDrinksSold;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public static void prepareDrink(DrinksMachine drinkType) {
        switch (drinkType) {
            case COFFEE:
                System.out.println("Coffee is prepared");
                totalDrinksSold++;
                totalRevenue += COFFEE_PRICE;
                break;

            case TEA:
                System.out.println("Tea is prepared");
                totalDrinksSold++;
                totalRevenue += TEA_PRICE;
                break;

            case LEMONADE:
                System.out.println("Lemonade is prepared");
                totalDrinksSold++;
                totalRevenue += LEMONADE_PRICE;
                break;

            case MOJITO:
                System.out.println("Mojito is prepared");
                totalDrinksSold++;
                totalRevenue += MOJITO_PRICE;
                break;

            case MINERAL_WATER:
                System.out.println("Mineral water is prepared");
                totalDrinksSold++;
                totalRevenue += MINERAL_WATER_PRICE;
                break;

            case COCA_COLA:
                System.out.println("Coca Cola is prepared");
                totalDrinksSold++;
                totalRevenue += COCA_COLA_PRICE;
                break;

            default:
                System.out.println("Error. Invalid drink choice.");
                break;
        }
    }


}
