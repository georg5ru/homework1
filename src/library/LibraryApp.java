package library;

public class LibraryApp {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", 1965);
        Author author2 = new Author("J.K. Rowling", 1965); // тот же автор

        Book book1 = new Book("Harry Potter", author1, 1997);
        Book book2 = new Book("Harry Potter", author2, 1997);
        System.out.println("Author1: " + author1);
        System.out.println("Author2: " + author2);
        System.out.println("\nBook1: " + book1);
        System.out.println("Book2: " + book2);

        System.out.println("\nauthor1.equals(author2): " + author1.equals(author2));
        System.out.println("book1.equals(book2): " + book1.equals(book2));

        System.out.println("\nauthor1.hashCode(): " + author1.hashCode());
        System.out.println("author2.hashCode(): " + author2.hashCode());

        System.out.println("\nbook1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book2.hashCode());
    }
}