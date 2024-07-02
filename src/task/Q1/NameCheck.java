package task.Q1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameCheck {
    public static void main(String[] args) {
        // List of student names
        List<String> studentNames = Arrays.asList("Aditya", "Akash", "Anushka", "Surya", "Deepika", "Lakshanya");

        // Using stream() to filter names starting with 'A' and collect them into a list
        List<String> namesStartingWithA = studentNames.stream()
            .filter(name -> name.startsWith("A")) // Lambda expression to check if name starts with 'A'
            .collect(Collectors.toList()); // Collect the results into a List

        // Print the list of names starting with 'A'
        System.out.println("Students whose names start with 'A':");
        namesStartingWithA.forEach(System.out::println); // Output each name in the list
    }
}