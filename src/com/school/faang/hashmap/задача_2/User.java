package com.school.faang.hashmap.задача_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    private long userId;
    private String fullName;
    private LocalDateTime registrationDate;
    private String userName;
    private static long lastUserId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public User(String fullName, LocalDateTime registrationDate, String userName) {
        this.userId = ++lastUserId;
        this.fullName = fullName;
        this.registrationDate = registrationDate;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
