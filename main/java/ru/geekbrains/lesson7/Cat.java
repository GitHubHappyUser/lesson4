package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private final int appetite;
    private boolean satiety;

    public Cat(final String name, final int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(final Plate p) {
        if (!satiety) {
            satiety = p.decreaseFood(appetite);
        }
    }

    public void info() {
        System.out.printf("Cat %s with an appetite %d %s\n", name, appetite, satiety ? "fool" : "hungry");
    }

}
