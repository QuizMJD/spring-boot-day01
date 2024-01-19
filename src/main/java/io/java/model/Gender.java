package io.java.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");


    Gender(String gender) {
        this.gender = gender;
    }

    private final String gender;

    @JsonValue
    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + gender + '\'' +
                '}';
    }
}

