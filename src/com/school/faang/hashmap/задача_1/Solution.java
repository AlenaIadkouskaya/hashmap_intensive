package com.school.faang.hashmap.задача_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Solution {
    private Map<String, Integer> likes = new HashMap<>();

    public static void main(String[] args) {
        String example1 = UUID.randomUUID().toString();
        String example2 = UUID.randomUUID().toString();
        String example3 = UUID.randomUUID().toString();
        Solution test = new Solution();
        test.likes.put(example1, 0);
        test.likes.put(example2, 0);
        test.likes.put(example3, 0);

        test.likeVideo(example1);
        test.likeVideo(example2);
        test.likeVideo(example1);
        test.likeVideo(example3);
        test.likeVideo(example1);
        test.likeVideo(example3);

        System.out.println("Video number 1: " + test.getLikes(example1));
        System.out.println("Video number 2: " + test.getLikes(example2));
        System.out.println("Video number 3: " + test.getLikes(example3));
    }

    public void likeVideo(String videoId) {

        Integer currentCount = getLikes(videoId);
        currentCount++;
        likes.put(videoId, currentCount);

    }

    public int getLikes(String videoId) {
        if (likes.containsKey(videoId)) {
            return likes.get(videoId);
        }
        return 0;
    }
}
