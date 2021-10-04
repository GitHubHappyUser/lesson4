package ru.geekbrains.lesson3;

import java.util.Arrays;

public class ThirdHomeworkUpdated {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(invertArray(new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0})) + "\n");
        System.out.println(Arrays.toString(fillArray(100)) + "\n");
        System.out.println(Arrays.toString(changeArray(new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 })) + "\n");
        fillDiagonal(5);
        System.out.println(Arrays.toString(methodEqual(6,9)));
        minMax(new int[] { 2, 4, 5, 3, 12, 4, 3, 5, 9, 0, -3, 4, 0, -11, 4, 5, 13, 4});
//        System.out.println(checkBalance(new int[] { 2, 2, 2, 1, 2, 2, 10, 1 })) + "\n");

    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static int[] invertArray(final int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                input[i] = 0;
            } else {
                input[i] = 1;
            }
        }
        return input;
    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
     * 1 2 3 4 5 6 7 8 … 100;
     */

    public static int[] fillArray(final int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /** 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие
     * 6 умножить на 2;
     */

    public static int[] changeArray(final int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 6) {
                input[i] *= 2;
            }
        }
        return input;
    }

    /** 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     *   и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
     *   диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
     *    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public static void fillDiagonal(final int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            int rowLength = arr[i].length;
            for (int j = 0; j < rowLength; j++) {
                if ((i == j) || (j == rowLength - 1 - i)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    /** 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
     *  массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] methodEqual(final int len, final int initialValue) {
        int[] arr = new int [len];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = initialValue;
            }
        return arr;
    }

    /**
     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */
    public static void minMax(final int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimal value from array: " + min);
        System.out.println("Maximum value from array: " + max);
        System.out.println();
    }


}





