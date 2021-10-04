package ru.geekbrains.lesson2;

public class SecondHomework {
    public static void main(String[] args) {
        System.out.println("Guten Tag!");
        System.out.println(sumTest(10,0, 10,20));
        positiveOrNegative();
        System.out.println(compareData(100,-1));
        printFewStrings();
        leapYears(2021);
    }
    //Task1
    public static boolean sumTest(final int a, final int b, final int x1, final int x2) {
        System.out.println("\nTask1");
        int sum;
        sum = a + b;
        if ((sum >= x1) && (sum <= x2)) {
            System.out.println(sum);
        return true;
        } else {
        System.out.println(sum);
        return false;
        }
    }
    //Task2
    public static void positiveOrNegative() {
        System.out.println("\nTask2");
        int z;
        z = 50;
        if (z >= 0) {
            System.out.println(z);
            System.out.println("Positive %)");
        } else {
            System.out.println(z);
            System.out.println("Negative %(");
        }
    }
    //Task3
    public static boolean compareData(int y, int r) {
        System.out.println("\nTask3");
        int multiply;
        multiply = y * r;
        if (multiply >= 0) {
            System.out.println(multiply);
            return true;
        } else {
            System.out.println(multiply);
            return false;
        }
    }
    //Task4
    public static void printFewStrings() {
        System.out.println("\nTask4");
        int i = 0;
        String word = "Hi!";
        for (i = 1; i <= 10; i++) {
            System.out.println(word);
        }
    }

    //Task5 (не моё решение)

    static void leapYears(int year) {
        System.out.println("\nTask5");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " Not Leap-Year");
        }else {
            System.out.println(year + " Leap-Year");
        }

        System.out.println("\nGute Nacht! Auf Wiedersehen!)");
    }
}




/** 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
 * (включительно), если да – вернуть true, в противном случае – false.
 */

/** 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */
/** 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
 * если число отрицательное, и вернуть false если положительное.
 */
/** 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
 * в консоль указанную строку, указанное количество раз;
 */
/** 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
 *  не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
 *  при этом каждый 400-й – високосный.
 */