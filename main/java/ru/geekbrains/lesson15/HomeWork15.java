package ru.geekbrains.lesson15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class HomeWork15 {
    public static void main(String[] args) throws IOException {
        Car car = new Car("white", "audi", "Q2");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("src/main/java/ru/geekbrains/lesson15/car.json"), car);

//        String carString = objectMapper.writeValueAsString(car);
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.writeValue(new File("src/main/java/ru/geekbrains/lesson15/car.json"), car);
        String carString = "{\"color\":\"white\",\"type\":\"audi\",\"model\":\"Q2\",\"country\":\"germany\"}";
        System.out.println(carString);

        Car carFromFile = objectMapper.readValue(
                new File("src/main/java/ru/geekbrains/lesson15/car.json"), Car.class);

        Car carFromString = objectMapper.readValue(carString, Car.class);
        System.out.println(carFromFile);
    }
}

/**
 * 1. Реализовать корректный вывод информации о текущей погоде.
 *    Создать класс WeatherResponse и десериализовать ответ сервера.
 *    Выводить пользователю только текстовое описание погоды и температуру в градусах Цельсия.
 *
 * 2. Реализовать корректный выход из программы
 *
 * 3. Реализовать вывод погоды на следующие 5 дней в формате:
 *    В городе CITY на дату DATE ожидается WEATHER_TEXT, температура - TEMPERATURE
 *    где CITY, DATE, WEATHER_TEXT и TEMPERATURE - уникальные значения для каждого дня.
 */