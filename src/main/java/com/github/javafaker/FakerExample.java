package com.github.javafaker;

public class FakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker(); // Создаем экземпляр Faker
        String name = faker.name().fullName(); // Генерируем случайное имя
        String address = faker.address().fullAddress(); // Генерируем случайный адрес

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
