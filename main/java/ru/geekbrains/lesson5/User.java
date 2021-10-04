package ru.geekbrains.lesson5;

public class User {
    private int id;
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public User(int id, String fullName, String position, String email, String phone, int salary, int age) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        String infoMessage = "User: %d\nID: %s\nPosition: %s\nEmail: %s\nPhone: %s\nSalary: %d\nAge: %d\n\n";
        System.out.printf(infoMessage, id, fullName, position, email, phone, salary, age);
    }

    public int getAge() {
        return age;
    }

}
