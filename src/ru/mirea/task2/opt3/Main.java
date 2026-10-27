package ru.mirea.task2.opt3;

public class Main {

    public static void main(String[] args) {
        Tester tester = new Tester(5);

        tester.add(new Circle(0, 0, 3));
        tester.add(new Circle(2.5, -1, 7.2));
        tester.add(new Circle(-4, 8, 1.5));

        System.out.println("Всего окружностей: " + tester.getCount());
        tester.printAll();
    }
}
