package ru.mirea.task11.opt1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AssignmentDates {
    public static void main(String[] args) {
        String developer;
        if (args.length > 0) {
            developer = args[0];
        } else {
            System.out.print("Фамилия разработчика: ");
            developer = new Scanner(System.in).nextLine();
        }

        Calendar received = Calendar.getInstance();
        received.set(2026, Calendar.OCTOBER, 27, 9, 0, 0);
        Date receivedDate = received.getTime();
        Date handedInDate = new Date();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Разработчик: " + developer);
        System.out.println("Задание получено: " + format.format(receivedDate));
        System.out.println("Задание сдано:    " + format.format(handedInDate));
    }
}
