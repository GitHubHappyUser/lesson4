package ru.geekbrains.lesson1;

public class FirstHomework {
    public static void main(String[] args) {
        System.out.println("Buenos Dias!\n");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple\n");
    }
    public static void checkSumSign() {
        int a = 22 , b = -33;
        int tasksCount;
        tasksCount = a + b;
        if (tasksCount > 0) {
            System.out.println("The sum is positive\n");
        } else if (tasksCount == 0) {
            System.out.println("The sum is zero\n");
        } else {
            System.out.println("The sum is negative\n");
        }
    }
    public static void printColor() {
        int value = 1000;
        if (value <= 0) {
            System.out.println("RED\n");
        } else if ((value > 0) && (value <= 100)) {
            System.out.println("YELLOW\n");
        } else {
            System.out.println("GREEN\n");
        }
    }
    public static void compareNumbers() {
        int a = 220 , b = 330;
        if (a >= b)  {
            System.out.println("a >= b\n");
        } else {
            System.out.println("a < b\n");
        }
        System.out.println("Hasta La Vista :)");
    }
}
