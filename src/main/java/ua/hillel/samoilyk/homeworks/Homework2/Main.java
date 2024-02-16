package ua.hillel.samoilyk.homeworks.Homework2;

public class Main {

    public static void main(String[] args) {

        // Location
        String country = "France";
        String city = "Paris";
        String street = "7th arrondissement";

        // Coordinates
        String latitude = "48.858093";
        String longitude = "2.294694";

        // DMS Coordinates
        String DMS_lat = "48° 51' 29.1348'' N";
        String DMS_long = "2° 17' 40.8984'' E";

        // UTM Coordinates
        String UTM_easting = "448,265.91";
        String UTM_northing = "5,411,920.65";

        // Everything is combined into one: location, coordinates, DMS, UTM
        String location = "Location: " + street + ", " + city + ", " + country + ".";
        String coordinates = "Latitude: " + latitude + " | " + "Longitude: " + longitude;
        String DMS_coordinates = "DMS_Latitude: " + DMS_lat + " | " + "DMS_Longitude: " + DMS_long;
        String UTM_coordinates = "UTM_Easting: " + UTM_easting + " | " + "UTM_Northing: " + UTM_northing;

        String allTogether = location + "\n" + coordinates + "\n" + DMS_coordinates + "\n" + UTM_coordinates;

        System.out.println(allTogether);
    }
}
