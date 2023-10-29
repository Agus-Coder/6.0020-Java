import java.util.Scanner;

public class Assigment_2_FooCompany {

    public static boolean lessThanSixty(int hours) {
        if (hours > 60) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean moreThan8(double base) {
        if (base < 8.00) {
            return false;
        } else {
            return true;
        }
    }

    public static double WageCalculator(int hours, double basePay) {
        double wage;
        if (hours > 40 && hours < 60) {
            wage = basePay * (40 + (hours - 40) * 1.5);
        } else {
            wage = hours * basePay;
        }
        return wage;
    }

    public static void main(String[] arguments) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Insert worked hours last week");
            int hours = reader.nextInt();

            if (lessThanSixty(hours)) {

                System.out.println("Insert base pay");
                double basePay = reader.nextDouble();

                if (moreThan8(basePay)) {
                    double wage = WageCalculator(hours, basePay);
                    System.out.println("This week's salary is: $" + wage);
                } else {
                    System.out.println("Minimum base pay must be greater than 8.00");
                }

            } else {
                System.out.println("Worker can't work more than 60 hours per week");
            }

        }
    }
}
