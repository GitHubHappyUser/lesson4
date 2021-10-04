package ru.geekbrains.lesson6;

import java.util.Arrays;

public abstract class Animal {
    public String name;
    public String colour;
    public int age;
    public int run;
    public int swim;

    public static int count = 0;

    public Animal(String name, String colour, int age, int run, int swim) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.run = run;
        this.swim = swim;
        count++;
    }

    public abstract void info();

    public abstract void running();

    public abstract void swimming();

    public static int getCount() {
        return count;
    }
}

//*1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
// плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
//**
