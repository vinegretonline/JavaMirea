package ru.mirea.task11.opt5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int SIZE = 50_000;

    static long measure(List<Integer> list, Operation operation) {
        long start = System.nanoTime();
        operation.run(list);
        return (System.nanoTime() - start) / 1_000;
    }

    static List<Integer> filled(List<Integer> list) {
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
        return list;
    }

    static void compare(String title, Operation operation) {
        long arrayList = measure(filled(new ArrayList<>()), operation);
        long linkedList = measure(filled(new LinkedList<>()), operation);
        System.out.printf("%-34s ArrayList: %8d мкс   LinkedList: %8d мкс%n", title, arrayList, linkedList);
    }

    public static void main(String[] args) {
        System.out.println("Размер списка: " + SIZE);
        compare("Добавление в конец (10000)", l -> {
            for (int i = 0; i < 10_000; i++) {
                l.add(i);
            }
        });
        compare("Вставка в начало (10000)", l -> {
            for (int i = 0; i < 10_000; i++) {
                l.add(0, i);
            }
        });
        compare("Вставка в середину (1000)", l -> {
            for (int i = 0; i < 1_000; i++) {
                l.add(l.size() / 2, i);
            }
        });
        compare("Удаление с начала (10000)", l -> {
            for (int i = 0; i < 10_000; i++) {
                l.remove(0);
            }
        });
        compare("Удаление из середины (1000)", l -> {
            for (int i = 0; i < 1_000; i++) {
                l.remove(l.size() / 2);
            }
        });
        compare("Поиск по образцу (200 раз)", l -> {
            for (int i = 0; i < 200; i++) {
                l.indexOf(SIZE - 1 - i);
            }
        });
    }
}
