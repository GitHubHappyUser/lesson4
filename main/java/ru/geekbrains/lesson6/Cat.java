package ru.geekbrains.lesson6;

public class Cat extends Animal {
    private static int count = 0;
    public static final int RUN = 500;
    public static final int SWIM = 50;
    private final int runCat = 700;
    private final int swimCat = 0;

    public Cat(String name, String colour, int age, int run, int swim) {
        super(name, colour, age, run, swim);
        count++;
        }

    @Override
    public void info() {
        System.out.println("Cat name: " + name);
    }

    @Override
    public void running() {
        System.out.println("Cat should run: " + run + " meter");
        this.run = runCat;
        System.out.println("Cat could run: " + runCat + " meter");
        if (runCat < RUN) {
            System.out.println("Lazy Cat!\n");
        } else {
            System.out.println("Super Cat!\n");
        }
    }

    @Override
    public void swimming() {
        System.out.println("Cat should swim " +  swim + " meter");
        this.swim = swimCat;
        System.out.println("Cat could swim: " +  swimCat + " meter");
        if (swimCat < SWIM) {
            System.out.println("Lazy Cat!\n");
        } else {
            System.out.println("Super Cat!\n");
        }
    }

    public static int getCount() {
        return count;
    }
}
