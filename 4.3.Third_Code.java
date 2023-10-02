public class Baby {
    double weight = 5.0;

    void eat(double foodWeight) {
        if (foodWeight >= 0 &&
                foodWeight < weight) {
            weight = weight + foodWeight;
        }
    }
}

