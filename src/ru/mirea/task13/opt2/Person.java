package ru.mirea.task13.opt2;

public class Person {
    private final String surname;
    private final String name;
    private final String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getShortName() {
        StringBuilder result = new StringBuilder(surname);
        if (name != null && !name.isEmpty()) {
            result.append(' ').append(name.charAt(0)).append('.');
            if (patronymic != null && !patronymic.isEmpty()) {
                result.append(patronymic.charAt(0)).append('.');
            }
        } else if (patronymic != null && !patronymic.isEmpty()) {
            result.append(' ').append(patronymic.charAt(0)).append('.');
        }
        return result.toString();
    }
}
