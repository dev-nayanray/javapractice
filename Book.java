class Book {

    // Instance variables
    String title;
    String author;
    int year;

    // Constructor 1: Initializes only the title
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";  // Default value
        this.year = 0;            // Default value
    }

    // Constructor 2: Initializes title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;  // Default value
    }

    // Constructor 3: Initializes title, author, and year
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display the book's details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Data Structures", "John Smith");
        Book book3 = new Book("Algorithms", "Jane Doe", 2021);

        // Displaying details of each book
        System.out.println("Book 1:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Book 2:");
        book2.displayDetails();
        System.out.println();

        System.out.println("Book 3:");
        book3.displayDetails();
    }
}
