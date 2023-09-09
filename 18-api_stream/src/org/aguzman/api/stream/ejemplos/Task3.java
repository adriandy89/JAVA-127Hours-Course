package org.aguzman.api.stream.ejemplos;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        String[] flattenedArray = Arrays.stream(lenguajes)
                .flatMap(Arrays::stream)
                .distinct()
                .toArray(String[]::new);

        System.out.println(Arrays.toString(flattenedArray));
    }
}