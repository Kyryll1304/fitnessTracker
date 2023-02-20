package com.gmail.kirilltrosnickii;

import java.time.LocalDate;
import java.time.Period;

public class FitnessTracker {
    private final String firstName;
    private String lastName;
    private int weight;
    private final String email;
    private final String phone;
    private int steps;
    private final int age;
    private int systolicPressure;

    private final LocalDate dateOfBirth;

    // Конструктор класу
    public FitnessTracker(String firstName, String lastName, int weight, String email, String phone, int steps, int systolicPressure, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.email = email;
        this.phone = phone;
        this.steps = steps;
        this.systolicPressure = systolicPressure;

        this.dateOfBirth = LocalDate.of(year, month, day);
        this.age = Period.between(dateOfBirth, LocalDate.of(2023, 2, 20)).getYears();
    }

    // Гетери
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWeight() {
        return weight;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSteps() {
        return steps;
    }

    public int getSystolicPressure() {
        return systolicPressure;
    }


    public int getAge() {
        return age;
    }

    public int getDayOfBirth() {
        return dateOfBirth.getDayOfMonth();
    }

    public int getMonthOfBirth() {
        return dateOfBirth.getMonthValue();
    }

    public int getYearOfBirth() {
        return dateOfBirth.getYear();
    }

    // Сетери
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }


    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }


    // Метод для друку всіх даних про користувача
    public void printAccountInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Steps: " + steps);
        System.out.println("Pressure: " + systolicPressure);

    }

    public static void main(String[] args) {
        // Створення користувачів
        FitnessTracker user1 = new FitnessTracker("John", "Bennet", 70, "johndoe@mail.com", "123456789", 10000, 120, 22, 3, 1990);
        FitnessTracker user2 = new FitnessTracker("Jane", "Big", 60, "janedoe@mail.com", "987654321", 8000, 130, 15, 2, 1992);
        FitnessTracker user3 = new FitnessTracker("Jade", "Collins", 55, "janecol@mail.com", "982254321", 8030, 120, 25, 6, 1997);

        System.out.println("User 1:");
        user1.printAccountInfo();
        System.out.println();

        System.out.println("User 2:");
        user2.printAccountInfo();
        System.out.println();

        System.out.println("User 3:");
        user3.printAccountInfo();
        System.out.println();

        user1.setLastName("Smith");
        user1.setWeight(75);
        user2.setSteps(10000);
        user2.setLastName("Box");

        System.out.println("User 1 new:");
        user1.printAccountInfo();
        System.out.println();

        System.out.println("User 3 new:");
        user3.printAccountInfo();
        System.out.println();
    }
}