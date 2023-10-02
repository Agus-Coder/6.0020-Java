public class Baby {

    String name;
    boolean isMale;
    double weight;
    double decibels;
    int numPoops = 0;

    void poop() {
        numPoops += 1;
        System.out.println("Dear mother, " + "I have pooped. Ready the diaper.");
    }
}

