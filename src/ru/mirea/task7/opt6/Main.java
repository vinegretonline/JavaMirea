package ru.mirea.task7.opt6;

import java.util.Scanner;
import ru.mirea.task7.opt5.StringProcessable;

public class Main {

    public static void main(String[] args) {
        StringProcessable processor = new ProcessStrings();

        String[] tests = {"Программирование", "abcdefg", "Java"};

        for (int i = 0; i < tests.length; i++) {
            String s = tests[i];
            System.out.println("Строка: " + s);
            System.out.println("  символов: " + processor.countChars(s));
            System.out.println("  нечётные позиции: " + processor.oddPositions(s));
            System.out.println("  перевёрнутая: " + processor.invert(s));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свою строку: ");
        String line = scanner.nextLine();

        System.out.println("Символов: " + processor.countChars(line));
        System.out.println("Нечётные позиции: " + processor.oddPositions(line));
        System.out.println("Перевёрнутая: " + processor.invert(line));

        scanner.close();
    }
}
