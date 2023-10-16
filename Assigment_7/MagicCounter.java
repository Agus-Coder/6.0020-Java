import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class MagicCounter extends IOException {

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> ColumnNumbers = new ArrayList<Integer>();
        ArrayList<Integer> negativeDiagonal = new ArrayList<Integer>();
        ArrayList<Integer> positiveDiagonal = new ArrayList<Integer>();
        negativeDiagonal.add(0);
        positiveDiagonal.add(0);

        // ArrayList<String> letters = new ArrayList<String>();
        FileReader fr = new FileReader("Mercury.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        int lineCounter = 1;
        int rowFollower = 0;

        System.out.println("Sums of each row:");

        while ((line = br.readLine()) != null) {
            int rowAccumulator = 0;
            int columnFollower = 0;

            if (lineCounter % 2 != 0) {

                numbers.clear();

                String[] letters = line.split("\t");

                // the size of strings tells you the number of columns
                if (lineCounter == 1) {
                    int columns = letters.length;

                    for (int i = 0; i < columns; i++) {
                        ColumnNumbers.add(0);
                    }
                }

                for (String word : letters) {
                    int number = Integer.valueOf(word);
                    numbers.add(number);
                }

                for (int numb : numbers) {
                    int totalInThisColumn = ColumnNumbers.get(columnFollower);
                    totalInThisColumn += numb;
                    ColumnNumbers.remove(columnFollower);
                    ColumnNumbers.add(columnFollower, totalInThisColumn);

                    if (columnFollower == rowFollower) {
                        int totalInThisdiag = negativeDiagonal.get(0);
                        totalInThisdiag += numb;
                        negativeDiagonal.remove(0);
                        negativeDiagonal.add(0, totalInThisdiag);
                    }
                    // System.out.println("total " + rowFollower + columnFollower + letters.length);

                    if (columnFollower + rowFollower == letters.length - 1) {
                        int totalInThisdiag = positiveDiagonal.get(0);
                        totalInThisdiag += numb;
                        positiveDiagonal.remove(0);
                        positiveDiagonal.add(0, totalInThisdiag);

                    }

                    columnFollower += 1;
                    rowAccumulator += numb;
                }
                rowFollower += 1;

                // System.out.println(columnFollower);
                columnFollower = 0;
                System.out.println(rowAccumulator);
            }
            lineCounter += 1;

        }
        System.out.println("Sums of each column");
        System.out.println(ColumnNumbers);
        System.out.println("Sum of negative diagonal");
        System.out.println(negativeDiagonal);
        System.out.println("Sum of positive diagonal");
        System.out.println(positiveDiagonal);

        br.close();
    }

}
