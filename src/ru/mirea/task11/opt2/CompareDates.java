package ru.mirea.task11.opt2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareDates {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        format.setLenient(false);

        System.out.print("Введите дату и время (дд.мм.гггг чч:мм): ");
        String line = new Scanner(System.in).nextLine().trim();

        Date entered;
        try {
            entered = format.parse(line);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты: " + line);
            return;
        }

        Date now = new Date();
        System.out.println("Сейчас:  " + format.format(now));
        System.out.println("Введено: " + format.format(entered));
        if (entered.before(now)) {
            System.out.println("Введённая дата раньше текущей");
        } else if (entered.after(now)) {
            System.out.println("Введённая дата позже текущей");
        } else {
            System.out.println("Даты совпадают");
        }
        long days = Math.abs(entered.getTime() - now.getTime()) / (24L * 60 * 60 * 1000);
        System.out.println("Разница: " + days + " дн.");
    }
}
