package ua.hillel.samoilyk.homeworks.Homework16;

public class Main {
    public static void main(String[] args) {

        Androids android = new Androids();
        IPhones iPhone = new IPhones();

        android.startLinuxOS();
        android.call();
        android.sms();
        android.internet();

        System.out.println(".................................");

        iPhone.startIOS();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();


    }
}
