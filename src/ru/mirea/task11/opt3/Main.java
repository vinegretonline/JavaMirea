package ru.mirea.task11.opt3;

import java.text.DateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar birth = Calendar.getInstance();
        birth.set(2005, Calendar.MARCH, 14, 0, 0, 0);
        Student student = new Student("Иван", "Иванов", birth.getTime());

        System.out.println(student);
        System.out.println("Короткий формат:  " + student.formatBirthDate(DateFormat.SHORT));
        System.out.println("Средний формат:   " + student.formatBirthDate(DateFormat.MEDIUM));
        System.out.println("Полный формат:    " + student.formatBirthDate(DateFormat.FULL));
        System.out.println("Свой шаблон:      " + student.formatBirthDate("dd/MM/yyyy"));
    }
}
