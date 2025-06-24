package com.school.faang.hashmap.задача_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Solution {
    private Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        Solution example = new Solution();
        example.addUser("petrov", new User("petrov", LocalDateTime.now(), "petrov"));
        example.addUser("af_pp", new User("afonia", LocalDateTime.now().plusDays(1), "af_pp"));
        example.addUser("iiii", new User("ivanov ivan", LocalDateTime.now().minusDays(20), "iiii"));
        example.addUser("iiii", new User("ivan ivanov", LocalDateTime.now().minusDays(20), "iiii"));
        example.printUsers(example);
    }

    public void printUsers(Solution example) {
        Map<String, User> db = example.users;
        for (Map.Entry<String, User> user : db.entrySet()) {
            System.out.println("User @" + user.getKey() + " full name: " + user.getValue().getFullName());
        }
    }

    public void addUser(String username, User user) {
        if (!users.containsKey(username)) {
            users.put(username, user);
        } else {
            throw new IllegalStateException("User with username @" + username + " exists");
        }
    }
}
