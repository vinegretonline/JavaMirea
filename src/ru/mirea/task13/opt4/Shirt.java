package ru.mirea.task13.opt4;

public class Shirt {
    private final String id;
    private final String description;
    private final String color;
    private final String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public static Shirt parse(String line) {
        String[] fields = line.split(",");
        return new Shirt(fields[0].trim(), fields[1].trim(), fields[2].trim(), fields[3].trim());
    }

    @Override
    public String toString() {
        return "Артикул: " + id + System.lineSeparator()
                + "Описание: " + description + System.lineSeparator()
                + "Цвет: " + color + System.lineSeparator()
                + "Размер: " + size + System.lineSeparator();
    }
}
