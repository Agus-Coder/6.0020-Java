public class Assigment_2_improved {

    public static void pay(int hours, double basePay) {
        if (hours > 60) {
            System.out.println("Worker can't work more than 60 hours per week");
        } else if (basePay < 8.00) {
            System.out.println("Minimum base pay must be greater than 8.00");
        } else {
            double wage;
            if (hours > 40 && hours < 60) {
                wage = basePay * (40 + (hours - 40) * 1.5);
            } else {
                wage = hours * basePay;
            }
            System.out.println("Pay: $" + wage);
        }
    }

    public static void main(String[] arguments) {
        pay(55, 10);
        pay(72, 8.2);
        pay(41, 2.7);
    }
}
