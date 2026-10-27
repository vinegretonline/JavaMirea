package ru.mirea.task4.opt4;

public class Monitor {

    private double diagonal;
    private int width;
    private int height;

    public Monitor(double diagonal, int width, int height) {
        this.diagonal = diagonal;
        this.width = width;
        this.height = height;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getResolution() {
        return width + "x" + height;
    }

    public String toString() {
        return diagonal + " дюймов, разрешение " + getResolution();
    }
}
