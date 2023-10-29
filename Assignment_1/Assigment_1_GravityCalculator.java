import java.util.Scanner;

public class Assigment_1_GravityCalculator {
    public static void main(String[] arguments) {
        try (Scanner reader = new Scanner(System.in)) {
            double aceleration = -9.8;
            System.out.println("Set time");
            double time = reader.nextFloat();
            System.out.println("Set initial speed");
            double initialV = reader.nextFloat();
            System.out.println("Set initial position");
            double initialX = reader.nextFloat();
            double finalX = 0.5 * aceleration * time * time + initialV * time + initialX;
            System.out.println("Aceleration: " + aceleration);
            System.out.println("Time: " + time);
            System.out.println("Initial Speed: " + initialV);
            System.out.println("Initial Position: " + initialX);
            System.out.println("The final position is: " + finalX);
        }
    }
}
