package ru.mirea.task13.opt5;

public class PhoneNumber {

    public static String format(String raw) {
        String digits = raw.replaceAll("[^0-9]", "");
        String countryCode;
        String number;
        if (raw.startsWith("+")) {
            if (digits.length() < 11 || digits.length() > 13) {
                throw new IllegalArgumentException("Неверная длина номера: " + raw);
            }
            countryCode = digits.substring(0, digits.length() - 10);
            number = digits.substring(digits.length() - 10);
        } else if (digits.length() == 11 && digits.startsWith("8")) {
            countryCode = "7";
            number = digits.substring(1);
        } else {
            throw new IllegalArgumentException("Неизвестный формат номера: " + raw);
        }
        return "+" + countryCode + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
    }
}
