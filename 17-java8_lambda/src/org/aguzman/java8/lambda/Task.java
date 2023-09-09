package org.aguzman.java8.lambda;

import java.util.function.Function;

public class Task {
    public static void main(String[] args) {
        String frase = "Hola, esto es una frase. Con espacios y puntos.";

        Function<String, String> eliminarEspaciosComasPuntos = (str) -> str.replaceAll("[\\s,.]", "").toUpperCase();

        String fraseConvertida = eliminarEspaciosComasPuntos.apply(frase);
        System.out.println(fraseConvertida);
    }
}