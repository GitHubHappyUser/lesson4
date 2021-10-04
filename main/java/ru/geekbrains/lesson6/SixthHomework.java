package ru.geekbrains.lesson6;

import java.util.Arrays;

public class SixthHomework {

    public static void main(String[] args) {
        Cat firstCat = new Cat("Vasily\n","Black", 3, Cat.RUN, Cat.SWIM);
        Cat secondCat = new Cat("Barsik\n","Black", 4, Cat.RUN, Cat.SWIM);
        Dog dog = new Dog("Billy\n", "White", 5, Dog.RUN, Dog.SWIM);
        Pig pig = new Pig("Svin\n","Rose",10, Pig.RUN, Pig.SWIM);

        firstCat.info();
        firstCat.running();
        firstCat.swimming();
        secondCat.info();
        secondCat.running();
        secondCat.swimming();
        dog.info();
        dog.running();
        dog.swimming();
        pig.info();
        pig.running();
        pig.swimming();

        System.out.println("Cats = " + Cat.getCount());
        System.out.println("Dogs = " + Dog.getCount());
        System.out.println("Pigs = " + Pig.getCount());
        System.out.println("Animals = " + Animal.getCount());
    }

}
