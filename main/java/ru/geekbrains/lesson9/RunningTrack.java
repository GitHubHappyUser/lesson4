package ru.geekbrains.lesson9;

public class RunningTrack implements Obstacle{
    public final int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("Running track with length: %d", length);
    }
}
