package ru.mirea.task11.opt3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private final String name;
    private final String surname;
    private final Date birthDate;

    public Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String formatBirthDate(String pattern) {
        return new SimpleDateFormat(pattern, new Locale("ru")).format(birthDate);
    }

    public String formatBirthDate(int style) {
        return DateFormat.getDateInstance(style, new Locale("ru")).format(birthDate);
    }

    @Override
    public String toString() {
        return surname + " " + name + ", дата рождения: " + formatBirthDate(DateFormat.LONG);
    }
}
