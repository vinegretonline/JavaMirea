package ru.mirea.task11.opt4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateAndCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Год Месяц(1-12) Число: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        System.out.print("Часы Минуты: ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        Calendar calendar = new GregorianCalendar(year, month - 1, day, hours, minutes);
        Date date = calendar.getTime();

        SimpleDateFormat format = new SimpleDateFormat("EEEE, d MMMM yyyy, HH:mm");
        System.out.println("Date:     " + date);
        System.out.println("Calendar: " + format.format(calendar.getTime()));
        System.out.printf("Поля календаря: %04d-%02d-%02d %02d:%02d%n",
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE));
    }
}
