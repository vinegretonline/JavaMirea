package ru.mirea.task13.opt2;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Person("Иванов", "Иван", "Иванович").getShortName());
        System.out.println(new Person("Петров", "Пётр", null).getShortName());
        System.out.println(new Person("Сидоров", "", "").getShortName());
        System.out.println(new Person("Кузнецова", null, "Олеговна").getShortName());
    }
}
