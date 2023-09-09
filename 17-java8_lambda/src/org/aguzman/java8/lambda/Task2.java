package org.aguzman.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        String sentence = "Hello hello hello this is a test sentence to count word repetitions.";

        Map<String, Integer> result = countWordRepetitions(sentence);
        System.out.println(result);

        // Iterating the map
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

        // Getting the first element with get()
        Map.Entry<String, Integer> firstEntry = result.entrySet().iterator().next();
        System.out.println("Most repeated word: " + firstEntry.getKey() + ", Frequency: " + firstEntry.getValue());
    }

    public static Map<String, Integer> countWordRepetitions(String sentence) {
        String[] words = sentence.split("\\s+");

        return Arrays.stream(words)
                .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
    }
}