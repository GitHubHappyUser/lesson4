package ru.geekbrains.lesson13;

public class HomeWork {

    public static final String PATH = "src/main/java/ru/geekbrains/lesson13/demo.csv";
    public static final String OTHER_PATH = "src/main/java/ru/geekbrains/lesson13/other_demo.csv";

    public static void main(String[] args) {
        String[] headers = {"A1", "B1", "C1", "D1", "E1"};
        int[][] data = {
                {10, 20, 30, 40, 50},
                {30, 20, 10, 40, 50},
                {10, 40, 30, 20, 20},
                {10, 90, 30, 30, 30},
                {50, 20, 30, 70, 80}
        };
        AppData appData = new AppData(headers, data);

        String[] otherHeaders = {"A2", "B2", "C2", "D2", "E2"};
        int[][] otherData = {
                {11, 20, 30, 80, 80},
                {10, 20, 30, 40, 50},
                {30, 20, 80, 40, 50},
                {30, 20, 80, 40, 20},
                {30, 20, 10, 22, 33}
        };
        AppData otherAppData = new AppData(otherHeaders, otherData);

        appData.writeToFile(PATH);
        AppData receivedAppData = AppData.readFromFile(PATH);
        System.out.println(receivedAppData);

        otherAppData.writeToFile(PATH);
        AppData otherReceivedAppData = AppData.readFromFile(PATH);
        System.out.println(otherReceivedAppData);

        otherAppData.writeToFile(OTHER_PATH);
        AppData receivedFromOtherAppData = AppData.readFromFile(OTHER_PATH);
        System.out.println(receivedFromOtherAppData);

        System.out.println("Java is the best!");
    }
}