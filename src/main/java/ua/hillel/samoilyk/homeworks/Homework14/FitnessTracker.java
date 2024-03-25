package ua.hillel.samoilyk.homeworks.Homework14;

public class FitnessTracker {
    // Ім'я та прізвище користувача
    private String name;
    public String surname;

    // Дата народження
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    // Контакти
    private long phoneNumber;
    private String email;

    // Інше
    public int weight;
    public int pressure;
    public int steps;

    FitnessTracker(String name,
                   String surname,
                   int birthDay,
                   int birthMonth,
                   int birthYear,
                   String email,
                   long phoneNumber,
                   int weight,
                   int pressure,
                   int steps) {

        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    String printAccountInfo() {
        return "Name: " + name + ", surname: " + surname
                + "\nAge: " + (2024 - birthYear)
                + "\nEmail: " + email
                + "\nPhone number: " + phoneNumber
                + "\nWeight: " + weight
                + "\nPressure: " + pressure
                + "\nSteps: " + steps;
    }


    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return (2024 - birthYear);
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }


}
