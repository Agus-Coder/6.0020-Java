package Assigment_4;
public class Library {
    String address;
    int newBookDirection;
    static String openingHours = "9 AM to 5 PM";

    Book[] collection = new Book[4];

    public Library(String newAddress) {
        newBookDirection = 0;
        address = newAddress;
    }

    void addBook(Book newBook) {
        collection[newBookDirection] = newBook;
        newBookDirection++;
    }

    static void printOpeningHours() {
        System.out.println(openingHours);
    }

    void printAddress() {
        System.out.println(address);
    }

    void borrowBook(String bookToBorrow) {

        boolean bookInCatalogue = false;

        for (int i = 0; i < collection.length; i++) {
            if (collection[i] != null) {
                if (bookToBorrow.equals(collection[i].title)) {
                    bookInCatalogue = true;

                    if (!collection[i].isBorrowed()) {
                        System.out.println("You successfully borrowed The Lord of the Rings");
                        collection[i].rent();
                        return;
                    }

                    if (collection[i].isBorrowed()) {
                        System.out.println("Sorry, this book is already borrowed");
                        return;
                    }
                } else {
                    bookInCatalogue = false;
                }
            }
        }

        if (!bookInCatalogue) {
            System.out.println("Sorry, this book is not in out catalog");
        }
    }

    void printAvailableBooks() {
        int totalBooks = 0;

        for (int i = 0; i < collection.length; i++) {
            if (collection[i] != null) {
                totalBooks++;
                if (!collection[i].isBorrowed()) {
                    System.out.println(collection[i].title);
                }
            }
        }
        if (totalBooks == 0) {
            System.out.println("No book in catalog");
        }

    }

    void returnBook(String bookToReturn) {
        for (int i = 0; i < collection.length; i++) {
            if (collection[i] != null) {
                if (bookToReturn.equals(collection[i].title)) {
                    collection[i].returned();
                    System.out.println("You successfully returned " + collection[i].title);
                    break;
                }
            }
        }
    }

    // Add the missing implementation to this class
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");
        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }

}
