package ru.mirea.task14.opt5;

import java.util.regex.Pattern;

public class DateCheck {
    private static final String DAY_MONTH_ANY_YEAR =
            "(?:(?:0[1-9]|1\\d|2[0-8])/(?:0[1-9]|1[0-2])"
                    + "|(?:29|30)/(?:0[13-9]|1[0-2])"
                    + "|31/(?:0[13578]|1[02]))"
                    + "/(?:19|[2-9]\\d)\\d{2}";
    private static final String LEAP_DAY =
            "29/02/(?:(?:19|[2-9]\\d)(?:0[48]|[2468][048]|[13579][26])"
                    + "|(?:[2468][048]|[3579][26])00)";
    static final Pattern DATE = Pattern.compile("^(?:" + DAY_MONTH_ANY_YEAR + "|" + LEAP_DAY + ")$");

    public static void main(String[] args) {
        String[] samples = {"29/02/2000", "30/04/2003", "01/01/2003",
                "29/02/2001", "30-04-2003", "1/1/1899", "31/04/2020", "29/02/1900"};
        for (String sample : samples) {
            System.out.println(sample + " -> " + DATE.matcher(sample).matches());
        }
    }
}
