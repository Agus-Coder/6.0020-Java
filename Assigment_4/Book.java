package Assigment_4;
public class Book {
    String title;
    boolean borrowed = false;

    public Book(String bookName) {
        title = bookName;
    }

    void rent() {
        borrowed = true;
    }

    void returned() {
        borrowed = false;
    }

    boolean isBorrowed() {
        if (borrowed) {
            return true;
        } else {
            return false;
        }
    }

    String getTitle(){
        return title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rent();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}