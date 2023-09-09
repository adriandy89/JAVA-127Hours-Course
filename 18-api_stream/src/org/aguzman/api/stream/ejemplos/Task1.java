package org.aguzman.api.stream.ejemplos;

import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        int[] arreglo = IntStream.rangeClosed(1, 100)
                .filter(num -> num % 10 != 0)
                .toArray();

        double suma = IntStream.of(arreglo)
                .mapToDouble(num -> (double) num / 2)
                .reduce(0, Double::sum);

        System.out.println(suma);
    }
}
