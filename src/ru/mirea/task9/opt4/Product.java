package ru.mirea.task9.opt4;

public class Product implements Comparable<Product> {
    private final String title;
    private final double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        int byPrice = Double.compare(price, other.price);
        return byPrice != 0 ? byPrice : title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f руб.", title, price);
    }
}
