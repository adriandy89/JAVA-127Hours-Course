package org.aguzman.api.stream.ejemplos;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Task2 {
    public static void main(String[] args) {
        Integer[] arreglo = {10, 5, 20, 50, 25, 30};

        Integer maximo = Arrays.stream(arreglo)
                .reduce(Integer.MIN_VALUE, BinaryOperator.maxBy(Integer::compareTo));

        System.out.println("El número mayor es: " + maximo);
    }
}
