package com.school.faang.hashmap.задача_2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Solution {
    private Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        Solution example = new Solution();
        example.addUser("petrov", new User(1, "petrov", LocalDate.now().toString()));
        example.addUser("af_pp", new User(2, "afonia", LocalDate.now().plusDays(1).toString()));
        example.addUser("iiii", new User(31, "ivanov ivan", LocalDate.now().minusDays(20).toString()));

        Map<String, User> db = example.users;
        for (Map.Entry<String, User> user : db.entrySet()) {
            System.out.println("Пользователь @" + user.getKey() + " полное имя: " + user.getValue().getFullName());
        }
    }

    public void addUser(String username, User user) {
        users.put(username, user);
    }
}
