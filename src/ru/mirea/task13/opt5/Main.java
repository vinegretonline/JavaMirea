package ru.mirea.task13.opt5;

public class Main {
    public static void main(String[] args) {
        String[] numbers = {"+79175655655", "+104289652211", "89175655655", "+442071838750", "12345"};
        for (String number : numbers) {
            try {
                System.out.println(number + " -> " + PhoneNumber.format(number));
            } catch (IllegalArgumentException e) {
                System.out.println(number + " -> ошибка: " + e.getMessage());
            }
        }
    }
}
