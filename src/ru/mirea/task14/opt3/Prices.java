package ru.mirea.task14.opt3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prices {
    static final Pattern PRICE = Pattern.compile("(?<![\\d.])\\d+(\\.\\d{1,2})?\\s(USD|RUB|EU)\\b");

    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 0.004 EU, 100 RUB, 7.5 EU, 1500 USD и 3.999 RUB.";
        System.out.println("Текст: " + text);
        Matcher matcher = PRICE.matcher(text);
        while (matcher.find()) {
            System.out.println("Найдено: " + matcher.group());
        }
    }
}
