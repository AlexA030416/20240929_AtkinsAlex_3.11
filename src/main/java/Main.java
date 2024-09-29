import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter month and year
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
        } else {
            // Get the number of days in the month
            int numDays = daysInMonth(month, year);
            System.out.println("The number of days in month " + month + " of year " + year + " is " + numDays + ".");
        }

        input.close();
    }

    public static boolean isLeapYear(int year) {
        // Check if the year is a leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int daysInMonth(int month, int year) {
        // List of days in each month
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Adjust for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }
}
