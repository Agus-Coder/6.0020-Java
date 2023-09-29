class Square2 {
    public static void printSquare(int x) {
        System.out.println(x * x);
    }

    public static void main(String[] arguments) {
        // printSquare("hello");
        // printSquare(5.5);
        // Both won't work because neither are integers
    }
}

class Square3 {
    public static void printSquare(double x) {
        System.out.println(x * x);
    }

    public static void main(String[] arguments) {
        printSquare(5);
    }
}
