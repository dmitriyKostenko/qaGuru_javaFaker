package com.demoqa.tests;

import com.github.javafaker.Faker;

import static com.demoqa.utils.RandomUtils.*;

public class TestData {
    static Faker faker = new Faker();

    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = faker.demographic().sex(),
            mobile = faker.phoneNumber().subscriberNumber(10),
            monthOfBirth = getRandomMonth(),
            yearOfBirth = getRandomYear(),
            dayOfBirth = getRandomDay(),
            subject = getRandomSubject(),
            hobby = getRandomHobby(),
            picturePath = "src/test/resources/mem.jpeg",
            picture = "mem.jpeg",
            currentAddress = faker.address().streetAddress(),
            state = "Haryana",
            city = "Panipat",
            stateAndCity = String.format("%s %s", state, city);
}
