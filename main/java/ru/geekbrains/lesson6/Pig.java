package ru.geekbrains.lesson6;

public class Pig extends Animal {
    private static int count = 0;
    public static final int RUN = 100;
    public static final int SWIM = 10;
    public final int runPig = 9;
    public final int swimPig = 5;

    public Pig(String name, String colour, int age, int run, int swim){
        super(name, colour, age, run, swim);
        count++;
    }

    @Override
    public void info() {
        System.out.println("Pig name: " + name);
    }

    @Override
    public void running() {
        System.out.println("Pig should run: " + run + " meter");
        this.run = runPig;
        System.out.println("Pig could run: " + runPig + " meter");
        if (runPig < RUN) {
            System.out.println("Lazy Pig!\n");
        } else {
            System.out.println("Super Pig!\n");
        }
    }

    @Override
    public void swimming() {
        System.out.println("Pig should swim: " +  swim + " meter");
        this.swim = swimPig;
        System.out.println("Pig could swim: " +  swimPig + " meter");
        if (swimPig < SWIM) {
            System.out.println("Lazy Pig!\n");
        } else {
            System.out.println("Super Pig!\n");
        }
    }

    public static int getCount() {
        return count;
    }

}
