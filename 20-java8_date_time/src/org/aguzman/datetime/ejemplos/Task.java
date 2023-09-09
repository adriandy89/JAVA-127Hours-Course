package org.aguzman.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        // Input date of birth as a string
        String dateOfBirthString = "1990-01-01";

        // Convert string to LocalDate
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, DateTimeFormatter.ISO_DATE);

        // Calculate age based on current date
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);

        // Extract years, months, and days from the age period
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        // Print the calculated age
        System.out.println("Age: " + years + " years, " + months + " months, " + days + " days");
    }
}
