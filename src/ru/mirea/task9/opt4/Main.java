package ru.mirea.task9.opt4;

import java.util.Arrays;
import ru.mirea.task9.opt1.Sorting;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Клавиатура", 3490.0),
                new Product("Мышь", 1290.5),
                new Product("Монитор", 15990.0),
                new Product("Наушники", 3490.0),
                new Product("Кабель HDMI", 390.0)
        };
        Sorting.insertionSort(products);

        System.out.println("Товары по возрастанию цены:");
        Arrays.stream(products).forEach(System.out::println);
    }
}
