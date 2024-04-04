package ua.hillel.samoilyk.homeworks.Homework16;

public class Androids implements Smartphones, LinuxOS {

    @Override
    public void call() {
        System.out.println("Calling from Android");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on Android");
    }

    @Override
    public void startLinuxOS() {
        System.out.println("Start LinuxOS");
    }


}
