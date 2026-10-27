package ru.mirea.task4.opt4;

public class Computer {

    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private int price;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor, int price) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public int getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println("Компьютер " + brand);
        System.out.println("  Процессор: " + processor);
        System.out.println("  Память:    " + memory);
        System.out.println("  Монитор:   " + monitor);
        System.out.println("  Цена:      " + price + " руб.");
    }
}
