package ru.mirea.task14.opt7;

import java.util.regex.Pattern;

public class PasswordCheck {
    static final Pattern PASSWORD = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)\\w{8,}$");

    public static void main(String[] args) {
        String[] samples = {"F032_Password", "TrySpy1", "smart_pass", "A007", "Abcdefg1", "ПарольПароль1"};
        for (String sample : samples) {
            System.out.println(sample + " -> " + (PASSWORD.matcher(sample).matches() ? "надёжный" : "ненадёжный"));
        }
    }
}
