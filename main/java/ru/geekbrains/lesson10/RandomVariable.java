package ru.geekbrains.lesson10;

public class RandomVariable {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10 - 5);
        System.out.println(a);
        double b = Math.sqrt(a);
        System.out.println(b);
    }
}
