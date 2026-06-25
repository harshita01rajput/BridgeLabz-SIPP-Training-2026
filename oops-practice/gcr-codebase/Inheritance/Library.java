class Book {
    protected String title;
    protected int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;

    // Constructor Chaining
    public Author(String title, int publicationYear,
                  String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class Library {
    public static void main(String[] args) {

        Author a = new Author(
                "Java Programming",
                2024,
                "Harshita Rajput",
                "Full Stack Developer and B.Tech Student"
        );

        a.displayInfo();
    }
}
