package ru.geekbrains.lesson7;

public class SeventhHomework {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[] {
                new Cat("Barsik", 25),
                new Cat("Fedya", 15),
                new Cat("Vasily", 20),
                new Cat("Vasilisa", 50),
        };

        feedCats(cats, plate);
        plate.refill(10);
        feedCats(cats, plate);
    }

    public static void feedCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        System.out.println();
    }

}

/**
* 1 Расширить задачу про котов и тарелки с едой
* 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 * (например, в миске 10 еды, а кот пытается покушать 15-20).
* 3. Каждому коту нужно добавить поле сытость "satiety" (когда создаем котов, они голодны).
 * Если коту удалось покушать (хватило еды), сытость = true.
* 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
 * то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
* 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
 * и потом вывести информацию о сытости котов в консоль.
* 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/