package ru.mirea.task4.opt4;

public class Main {

    public static void main(String[] args) {
        Computer c1 = new Computer(Brand.ASUS,
                new Processor("Intel Core i5", 6, 3.2),
                new Memory(16, "DDR4"),
                new Monitor(24, 1920, 1080),
                72000);

        Computer c2 = new Computer(Brand.APPLE,
                new Processor("Apple M3", 8, 4.0),
                new Memory(8, "LPDDR5"),
                new Monitor(13.6, 2560, 1664),
                124000);

        c1.printInfo();
        System.out.println();
        c2.printInfo();
    }
}
