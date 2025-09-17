import java.util.ArrayList;
class Book {
    String title;
    String author;
    String ISBN;
    Book(String t, String a, String i) {
        title = t;
        author = a;
        ISBN = i;
    }
    void display() {
        System.out.println(title + " by " + author + " (ISBN: " + ISBN + ")");
    }
    public static void main(String[] args) {
        ArrayList<Book> collection = new ArrayList<>();
        Book b1 = new Book("Java Basics", "James", "123");
        Book b2 = new Book("Object Oriented Programming Concepts", "Tom", "456");
        collection.add(b1);
        collection.add(b2);

        System.out.println("Books  collection:");
        for (Book b : collection) {
            b.display();
        }
        collection.remove(b1);
        System.out.println("\nAfter removing one book:");
        for (Book b : collection) {
            b.display();
        }
    }
}
