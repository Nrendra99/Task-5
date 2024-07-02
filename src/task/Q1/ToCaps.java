package task.Q1;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class ToCaps {
    public static void main(String[] args) {
        // Given list of strings in a Stream
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Using map() method to convert each string in the stream to upper-case
        List<String> upperCaseNames = names
            .map(String::toUpperCase) // Convert each string to upper-case
            .collect(Collectors.toList()); // Collect the results into a List

        // Print the resulting list
        upperCaseNames.forEach(System.out::println); // Output each string in the list
    }
} 