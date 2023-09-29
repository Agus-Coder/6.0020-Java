class SquareChange {
    public static void printSquare(int x) {
        System.out.println("printSquare x = " + x);
        x = x * x;
        System.out.println("printSquare x = " + x);
    }

    public static void main(String[] arguments) {
        int x = 5;
        System.out.println("main x = " + x);
        printSquare(x); // x is in another scope in here, does not return x
        System.out.println("main x = " + x);
    }
}

class Scope {
    public static void main(String[] arguments) {
        int x = 5;
        if (x == 5) {
            x = 6;

            int y = 72;

            System.out.println("x = " + x + " y = " + y);

        }
        System.out.println("x = " + x + " y = out of scope");
    }
}
