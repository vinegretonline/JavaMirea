package ru.mirea.task13.opt1;

public class StringMethods {

    static void process(String s) {
        System.out.println("Строка: " + s);
        System.out.println("Последний символ: " + s.charAt(s.length() - 1));
        System.out.println("Заканчивается на \"!!!\": " + s.endsWith("!!!"));
        System.out.println("Начинается с \"I like\": " + s.startsWith("I like"));
        System.out.println("Содержит \"Java\": " + s.contains("Java"));
        System.out.println("Позиция \"Java\": " + s.indexOf("Java"));
        System.out.println("Замена a на o: " + s.replace('a', 'o'));
        System.out.println("Верхний регистр: " + s.toUpperCase());
        System.out.println("Нижний регистр: " + s.toLowerCase());
        int from = s.indexOf("Java");
        System.out.println("Вырезанная подстрока: " + s.substring(from, from + "Java".length()));
        System.out.println("Без \"Java\": " + s.substring(0, from) + s.substring(from + "Java".length()));
    }

    public static void main(String[] args) {
        process("I like Java!!!");
    }
}
