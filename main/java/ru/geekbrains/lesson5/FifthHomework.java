package ru.geekbrains.lesson5;

public class FifthHomework {
        public static void main (String[] args) {
        User[] users = {
            new User(1, "Vasily Ivanov", "Director", "vi@comp.com", "+79197777777", 100000, 18),
            new User(2, "Petr Sergeev", "Sales Manager", "ps@comp.com", "+79195555555", 50000, 43),
            new User(3, "Zinaida Petrova", "Secretary", "zp@comp.com", "+79193333333", 30000, 25),
            new User(4, "Guru Forever", "QA President", "GF@comp.com", "+436645557777", 1500000, 298),
            new User(5, "Georgiy Jakovlev", "Security", "gj@comp.com", "+79191111111", 200000, 33),
            };

        for (User user : users) {
            if (user.getAge() > 40) {
                user.info();
            }
        }
    }
}

/*
  1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
  2. Конструктор класса должен заполнять эти поля при создании объекта.
  3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
  4. Создать массив из 5 сотрудников.
  5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */