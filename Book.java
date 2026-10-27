public class Book{
    String title;
    String author;
    boolean isAvailable;

    public Book(String bookTitle,String bookAuthor){
        title=bookTitle;
        author=bookAuthor;
        isAvailable=true;
    }
    public void displayInfo() {
        String status = isAvailable ? "Available" : "Rented Out";
        System.out.println("Title: " + title + " | Author: " + author + " | Status: [" + status + "]");
    }
}

