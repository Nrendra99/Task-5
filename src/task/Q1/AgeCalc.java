package task.Q1;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        // Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter their birth-date in yyyy-mm-dd format
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();

        // Parse the input string to a LocalDate object
        LocalDate birthDate = LocalDate.parse(input);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age in years, months, and days manually
        int years = currentDate.getYear() - birthDate.getYear();
        int months = currentDate.getMonthValue() - birthDate.getMonthValue();
        int days = currentDate.getDayOfMonth() - birthDate.getDayOfMonth();

        // Adjust if the current day is before the birth day in the month
        if (days < 0) {
            months -= 1;
            days += currentDate.minusMonths(1).lengthOfMonth();
        }

        // Adjust if the current month is before the birth month in the year
        if (months < 0) {
            years -= 1;
            months += 12;
        }

        // Print the age in years, months, and days
        System.out.println("Your age is: " + years + " years, " +
                months + " months, and " + days + " days.");
        
        scanner.close();
    }
}