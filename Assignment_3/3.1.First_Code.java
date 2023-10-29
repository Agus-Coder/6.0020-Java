public class LoopArray {

    public static void looping() {
        int[] values = new int[5];
        int i = 0;
        while (i < values.length) {
            values[i] = i;
            int y = values[i] * values[i];
            System.out.println(y);
            i++;
        }
    }

    public static void main(String[] arguments) {
        looping();
    }
}
