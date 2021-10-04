package ru.geekbrains.lesson3;

import java.util.Arrays;

public class ThirdHomework {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        methodEqual();
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void invertArray() {
        System.out.println("\nTask1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
     * 1 2 3 4 5 6 7 8 … 100;
     */

    public static void fillArray() {
        System.out.println("\nTask2");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
    /** 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие
     * 6 умножить на 2;
     */

    public static void changeArray() {
        System.out.println("\nTask3");
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /** 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     *   и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
     *   диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
     *    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public static void fillDiagonal() {
        System.out.println("\nTask4");
        int n = 7;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][i] = 1;
                arr[i][n - i - 1] = 1;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /** 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
     *  массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static void methodEqual() {
        System.out.println("\nTask5");
        int i;
        int len = 10;
        int[] arr = new int [len];
        int initialValue = 20;
            for (i = 1; i <= arr.length; i++) {
                System.out.print(initialValue + " ");
            }
        System.out.println("\n");

    }

}





