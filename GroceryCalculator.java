package module1;
import java.util.Scanner;

public class GroceryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double couponRate;

        double week1, week2, week3, week4;

        double monthlyTotal, weeklyAverage;

        double discountedMonthlyTotal, discountedWeeklyAverage;

        // Prompt for coupon
        System.out.print("Enter coupon rate (e.g., 0.10 for 10%): ");
        couponRate = input.nextDouble();

        // Validate coupon
        if (couponRate <= 0 || couponRate > 1) {
            couponRate = 0.10;
            System.out.println("Invalid coupon rate. Defaulting to 10%.");
        }

        // Weekly inputs
        System.out.println("Please enter your grocery bills for the following weeks");

        System.out.print("Grocery Bill - Week 1: ");
        week1 = input.nextDouble();

        System.out.print("Grocery Bill - Week 2: ");
        week2 = input.nextDouble();

        System.out.print("Grocery Bill - Week 3: ");
        week3 = input.nextDouble();

        System.out.print("Grocery Bill - Week 4: ");
        week4 = input.nextDouble();

        // Calculations
        monthlyTotal = week1 + week2 + week3 + week4;
        weeklyAverage = monthlyTotal / 4;

        discountedMonthlyTotal = monthlyTotal - (monthlyTotal * couponRate);
        discountedWeeklyAverage = discountedMonthlyTotal / 4;

        // Output
        System.out.println("\n===== RESULTS =====");

        System.out.println("Monthly Total (No Coupon): $" + monthlyTotal);
        System.out.println("Weekly Average (No Coupon): $" + weeklyAverage);

        System.out.println("Monthly Total (With Coupon): $" + discountedMonthlyTotal);
        System.out.println("Weekly Average (With Coupon): $" + discountedWeeklyAverage);

        input.close();
    }
}