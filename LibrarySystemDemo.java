
class Item {
    private String title;
    private String author;
    private int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Book extends Item {
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class Magazine extends Item {
    private String issueNumber;

    public Magazine(String title, String author, int publicationYear, String issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibrarySystemDemo {
    public static void main(String[] args) {
        System.out.println("Book Details:");
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        book.displayDetails();

        System.out.println("\nMagazine Details:");
        Magazine magazine = new Magazine("National Geographic", "Editorial Team", 2023, "August Edition");
        magazine.displayDetails();
    }
}

