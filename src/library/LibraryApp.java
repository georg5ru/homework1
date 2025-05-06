package library;

public class LibraryApp {

    public static void main(String[] args) {

        Author orwell       = new Author("George",  "Orwell");
        Author dostoevsky   = new Author("Fyodor",  "Dostoevsky");

        Book nineteenEightyFour = new Book("1984",                 orwell,     1949);
        Book crimeAndPunishment = new Book("Crime and Punishment", dostoevsky, 1866);

        String catalogue = "";
        catalogue += nineteenEightyFour + System.lineSeparator();
        catalogue += crimeAndPunishment + System.lineSeparator();
        System.out.println("Справочник:\n" + catalogue);

        nineteenEightyFour.setYearPublished(1950);
        System.out.println("После обновления года:\n" + nineteenEightyFour);
    }
}