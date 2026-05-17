package module1;

import java.util.Scanner;

public class GradeStats {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int TOTAL_GRADES = 10;

        double grade;
        double sum = 0;
        double highest = Double.NEGATIVE_INFINITY;
        double lowest = Double.POSITIVE_INFINITY;

        int count = 0;

        System.out.println("=== Student Grade Analyzer ===\n");

        while (count < TOTAL_GRADES) {

            System.out.print("Enter grade #" + (count + 1) + ": ");

            // Prevents endless loop from invalid input
            if (input.hasNextDouble()) {

                grade = input.nextDouble();

                // Checks for valid grade range
                if (grade < 0 || grade > 100) {
                    System.out.println("Please enter a grade between 0 and 100.\n");
                    continue;
                }

                sum += grade;

                if (grade > highest) {
                    highest = grade;
                }

                if (grade < lowest) {
                    lowest = grade;
                }

                count++;

            } else {

                System.out.println("Invalid input. Numeric values only.\n");
                input.next(); // Clears invalid input
            }
        }

        double average = sum / TOTAL_GRADES;

        System.out.println("\n===== Grade Summary =====");
        System.out.printf("Average Grade: %.2f%n", average);
        System.out.printf("Highest Grade: %.2f%n", highest);
        System.out.printf("Lowest Grade: %.2f%n", lowest);

        input.close();
    }
}