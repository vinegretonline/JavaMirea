package ru.mirea.task13.opt3;

public class Main {
    public static void main(String[] args) {
        String[] commaLines = {
                "Россия, Московская область, Москва, Вернадского, 78, 1, 25",
                "Россия,Санкт-Петербург,Санкт-Петербург,Невский проспект,10,2,7",
                " Беларусь , Минская область , Минск , Независимости , 5 , 3 , 41 ",
                "Россия, Татарстан, Казань, Баумана, 12, 1, 3"
        };
        System.out.println("split(\",\"):");
        for (String line : commaLines) {
            System.out.println(Address.parseBySplit(line));
        }

        String[] mixedLines = {
                "Россия; Московская область, Москва; Вернадского, 78; 1; 25",
                "Россия. Ленинградская область; Гатчина, Соборная. 4, 2; 16",
                "Казахстан, Алматинская область; Алматы. Абая, 150; 1, 9",
                "Россия; Свердловская область; Екатеринбург; Ленина; 24; 2; 17"
        };
        System.out.println("StringTokenizer(\",.;\"):");
        for (String line : mixedLines) {
            System.out.println(Address.parseByTokenizer(line));
        }
    }
}
