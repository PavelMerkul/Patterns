package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateDate(int shift) {
        String date = LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }

    public static String generateCity(String locale) {
        var cities = new String[] {
                "Москва", "Санкт-Петербург", "Иркутск", "Новосибирск", "Омск", "Кемерово", "Барнаул", "Томск", "Красноярск"
        };
        return cities[new Random().nextInt(cities.length)];

    }

    public static String generateName(String locale) {
        var faker = new Faker(new Locale(locale));
        return  faker.name().lastName() + " " + faker.name().firstName();
    }

    public static String generatePhone(String locale) {
        var faker = new Faker(new Locale(locale));
        return faker.phoneNumber().phoneNumber();
    }

    public static class Registration {
        private Registration() {
        }

        public static UserInfo generateUser(String locale) {
            UserInfo userInfo;
            userInfo = new UserInfo(generateCity(locale), generateName(locale), generatePhone(locale));
            return userInfo;

        }
    }

    @Value
    public static class UserInfo {
        String city;
        String name;
        String phone;

    }

}