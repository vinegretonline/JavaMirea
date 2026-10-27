package ru.mirea.task13.opt3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public static Address parseBySplit(String line) {
        String[] parts = line.split(",");
        Address address = new Address();
        address.fill(parts);
        return address;
    }

    public static Address parseByTokenizer(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line, ",.;");
        String[] parts = new String[tokenizer.countTokens()];
        for (int i = 0; i < parts.length; i++) {
            parts[i] = tokenizer.nextToken();
        }
        Address address = new Address();
        address.fill(parts);
        return address;
    }

    private void fill(String[] parts) {
        country = part(parts, 0);
        region = part(parts, 1);
        city = part(parts, 2);
        street = part(parts, 3);
        house = part(parts, 4);
        building = part(parts, 5);
        apartment = part(parts, 6);
    }

    private static String part(String[] parts, int index) {
        return index < parts.length ? parts[index].trim() : "";
    }

    public String getCountry() { return country; }
    public String getRegion() { return region; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public String getHouse() { return house; }
    public String getBuilding() { return building; }
    public String getApartment() { return apartment; }

    @Override
    public String toString() {
        return String.format("Страна=[%s] Регион=[%s] Город=[%s] Улица=[%s] Дом=[%s] Корпус=[%s] Квартира=[%s]",
                country, region, city, street, house, building, apartment);
    }
}
