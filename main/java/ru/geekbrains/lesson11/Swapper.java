package ru.geekbrains.lesson11;

public class Swapper<T> {
    public void swap(T[] array, int first, int second, int third, int fourth) {
        T buffer;

        buffer = array[first];
        array[first] = array[second];
        array[second] = buffer;

        buffer = array[third];
        array[third] = array[fourth];
        array[fourth] = buffer;
    }
}

/**
 * <T> - generic Type
 */
