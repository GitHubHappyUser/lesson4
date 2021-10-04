package ru.geekbrains.lesson9;

public class NinthHomework {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new RunningTrack(250),
                new Wall(3),
                new RunningTrack(400),
                new Wall(5),
                new RunningTrack(600),
                new Wall(7),
        };
    // above - class which contains the data terms and conditions (sizes/length/heights)
    // below - class which contains the actual data with the limits (person/length/heights)

        Participant[] participants = {
                new Human(500, 3),
                new Human(700, 5),
                new Cat(300, 4),
                new Cat(400, 2),
                new Robot(700, 10),
                new Robot(1000, 10)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!participant.getStatus()) {
                    participant.overcomeObstacle(obstacle);
                }
            }
            System.out.print("\n");
        }
    }
}

/**
 * 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
 * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
 *
 * 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
 * участники должны выполнять соответствующие действия (бежать или прыгать),
 * результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
 *
 * 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот
 * набор препятствий.
 *
 * 4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 *
 * 5. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */