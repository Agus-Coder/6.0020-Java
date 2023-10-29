public class Assigment_3_Marathon {
    static int[] Times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
    static String[] Names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

    public static void Results(int[] times, String[] names) {
        int bestTime = 0;
        int firstPosition = 0;
        for (int i = 0; i < times.length; i++) {
            if (i == 0 || times[i] < bestTime) {
                bestTime = times[i];
                firstPosition = i;
            }
        }

        int secondBestTime = 0;
        int secondPosition = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] == bestTime) {
                continue;
            }
            if (i == 0 || times[i] < secondBestTime) {
                secondBestTime = times[i];
                secondPosition = i;
            }
        }

        System.out.println("The first position goes for: " + names[firstPosition] + " who made it in " + bestTime
                + " minutes");
        System.out.println("The second position goes for: " + names[secondPosition] + " who made it in "
                + secondBestTime + " minutes");

    }

    public static void main(String[] arguments) {
        Results(Times, Names);
    }
}
