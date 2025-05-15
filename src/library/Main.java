package library;

public class Main {
    private String firstName;
    private String lastName;

    public Main(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /* -------- геттеры -------- */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}