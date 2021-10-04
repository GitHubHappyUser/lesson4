package ru.geekbrains.lesson12;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList(
           "Eins","Zwei","Eins","Zehn","Drei","Vier","Zehn","Fünf","Vier","Sechs","Zehn","Sieben","Vier","Drei","Neun",
                "Zehn","Eins","Eins","Eins","Elf","Zwölf","Drei","Drei","Drei","Drei","Drei","Drei","Drei","Acht"
        ));
        printWithoutDuplicates(stringList);
        countDuplicates(stringList);
        testPhoneBook();
    }

    public static void printWithoutDuplicates(List<String> input) {
        Set<String> inputSet = new HashSet<>(input);
        System.out.println("Task#1.1");
        System.out.println(inputSet);
    }

    public static void countDuplicates(List<String> input) {
        System.out.println("Task#1.2");
        Set<String> inputSet = new HashSet<>(input);
        for (String word : inputSet) {
            int count = 0;
            for (String inner : input) {
                if (word.equals(inner)) {
                    count++;
                }
            }
            System.out.printf("%s: %d ; ", word, count);
        }
    }

    public static void testPhoneBook() {
        PhoneBook.add("George", "+43 555 ßßß 777");
        PhoneBook.add("Paul", "+43 555 222 777");
        PhoneBook.add("John", "+43 555 111 777");
        PhoneBook.add("Darren", "+44 555 000 777");
        PhoneBook.add("Jack", "+43 555 777 777");
        PhoneBook.add("Darren", "+45 555 555 777");
        PhoneBook.add("Bob", "+43 555 999 777");
        PhoneBook.add("Nadya", "+39 555 777 777");
        PhoneBook.add("Sergio", "+7 111 666 777");
        PhoneBook.add("Lenka", "+1 555 111 777");
        PhoneBook.add("Nadya", "+45 555 666 111");
        PhoneBook.add("George", "+45 555 333 777");
        PhoneBook.add("Jack", "+39 222 666 777");
        PhoneBook.add("Jack", "+43 555 333 777");
        PhoneBook.add("Vasiliy", "+7 999 666 777");
        PhoneBook.add("Stephan", "+1 555 000 777");
        PhoneBook.add("Stephan", "+44 555 222 777");

        System.out.println("\nTask#2");

        PhoneBook.get("Vasiliy");
        PhoneBook.get("John");
        PhoneBook.get("Paul");
        PhoneBook.get("Nadya");
        PhoneBook.get("Jack");
        PhoneBook.get("Stephan");
        PhoneBook.get("Darren");
        PhoneBook.get("George");
        PhoneBook.get("Sergio");
        PhoneBook.get("Bob");
        PhoneBook.get("Lenka");
    }


}

/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 *
 * 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи,
 * а с помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */