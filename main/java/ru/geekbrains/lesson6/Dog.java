package ru.geekbrains.lesson6;

public class Dog extends Animal {
    private static int count = 0;
    public static final int RUN = 1000;
    public static final int SWIM = 100;
    public final int runDog = 900;
    public final int swimDog = 550;

    public Dog(String name, String colour, int age, int run, int swim) {
        super(name, colour, age, run, swim);
        count++;
    }

    @Override
    public void info() {
        System.out.println("Dog name: " + name);
    }

    @Override
    public void running() {
        System.out.println("Dog should run: " + run + " meter");
        this.run = runDog;
        System.out.println("Dog could run: " + runDog + " meter");
        if (runDog < RUN) {
            System.out.println("Lazy Dog!\n");
        } else {
            System.out.println("Super Dog!\n");
        }
    }

    @Override
    public void swimming() {
        System.out.println("Dog should swim: " +  swim + " meter");
        this.swim = swimDog;
        System.out.println("Dog could swim: " +  swimDog + " meter");
        if (swimDog < SWIM) {
            System.out.println("Lazy Dog!\n");
        } else {
            System.out.println("Super Dog!\n");
        }
    }

    public static int getCount() {
        return count;
    }

}
