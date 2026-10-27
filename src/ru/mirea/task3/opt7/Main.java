package ru.mirea.task3.opt7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(81.50, 95.20, 11.40);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в рублях: ");
        double rubles = scanner.nextDouble();

        converter.printTable(rubles);

        scanner.close();
    }
}
