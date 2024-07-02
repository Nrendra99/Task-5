package task.Q1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckStr {
    public static void main(String[] args) {
        // Given list of strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Using filter() method to retain only non-empty strings
        List<String> nonEmptyStrings = strings.stream()
            .filter(s -> !s.isEmpty()) // Filter out empty strings
            .collect(Collectors.toList()); // Collect the results into a List

        // Print the resulting list of non-empty strings
        nonEmptyStrings.forEach(System.out::println); // Output each string in the list
    }
}