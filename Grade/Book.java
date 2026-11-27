public class Book{
    // Attributes for each book
    String title;
    String author;
    boolean isAvailable;
    
    // Constructor: This sets up a new book when we create it
    public Book(String bookTitle,String bookAuthor){
        title=bookTitle;
        author=bookAuthor;
        isAvailable=true;
    }
    // A method to display info about this specific book
    public void displayInfo() {
        String status = isAvailable ? "Available" : "Rented Out";
        System.out.println("Title: " + title + " | Author: " + author + " | Status: [" + status + "]");
    }
}

