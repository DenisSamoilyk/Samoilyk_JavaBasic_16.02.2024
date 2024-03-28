package ua.hillel.samoilyk.homeworks.Homework15;

public class Main {
    public static void main(String[] args) {
        PopMusic popBand = new PopMusic();
        RockMusic rockBand = new RockMusic();
        ClassicMusic classicBand = new ClassicMusic();

        MusicStyles[] musicBand = {popBand, rockBand, classicBand};

        for (MusicStyles band : musicBand) {
            band.playMusic();
        }


    }
}
