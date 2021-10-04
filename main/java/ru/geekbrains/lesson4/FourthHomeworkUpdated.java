package ru.geekbrains.lesson4;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class FourthHomeworkUpdated {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin0(DOT_X)) {
                System.out.println("Human won");
                break;
            }
            if (isMapFull()) {
                System.out.println("Dead Heat");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin0(DOT_O)) {
                System.out.println("Robot won");
                break;
            }
            if (isMapFull()) {
                System.out.println("Dead Heat");
                break;
            }
        }
        System.out.println("Game Over");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Your turn! Specify X and Y coordinates");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static void aiTurn() {
        Random random = new Random();
        int x;
        int y;

        do {
            x = random.nextInt() - 1;
            y = random.nextInt() - 1;
        } while (!isCellValid(x, y));
        System.out.println("Computer turn " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean checkWin0(char symbol) {
        int diag1, diag2, hor, ver;
        for (int i = 0; i < SIZE; i++) {
            hor = 0; ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    hor++;
                }
                if (map[j][i] == symbol) {
                    ver++;
                }
            }
            if (hor == DOTS_TO_WIN || ver == DOTS_TO_WIN) {
                return true;
            }
        }
        diag1 = 0; diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                diag1++;
            }
            if (map[i][SIZE - i - 1] == symbol) {
                diag2++;
            }
        }
        if (diag1 == DOTS_TO_WIN || diag2 == DOTS_TO_WIN) {
            return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }



//1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
//2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например,
// с использованием циклов.
//3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
// Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
//4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
}

