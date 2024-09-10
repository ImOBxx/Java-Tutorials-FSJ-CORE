
// Define the Printable interface
interface Printable {
    // Default method with a default implementation
    default void print() {
        System.out.println("Printing from Printable interface");
    }
}

// Implement the Printable interface in a class Book
class Book implements Printable {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Override the default print method with a custom implementation
    @Override
    public void print() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}

// Main class to test the implementation
public class DefaultMethod {
    public static void main(String[] args) {
        // Create an instance of Book
        Book book = new Book("1984", "George Orwell");
        
        // Call the print method on the Book instance
        book.print();
        
        Printable printable = new Printable() {
            // No custom implementation provided, will use default method
        };

        // Call the print method on the anonymous instance
        printable.print(); // This will use the default method from Printable interface
    
    }
}
