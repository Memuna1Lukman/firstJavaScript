import java.util.Scanner;

public class Library {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      Book[] inventory = new Book[3];
      inventory[0] = new Book("Java OOP","Mr. Castrol");
      inventory[1] = new Book("Electronics","Mr. Prince");
      inventory[2] = new Book("Algebra","Mr Gabriel");

      boolean running = true;

      while(running){
         System.out.println("\n--- Library Menu ---");
         System.out.println("1. View All Books");
         System.out.println("2. Rent a Book");
         System.out.println("3. Exit");
         System.out.print("Choose an option (1-3): ");

         int choice = scanner.nextInt();
            
         if(choice == 1){
            System.out.println("\n--- Library Inventory ---");
            for(int i=0; i<inventory.length; i++){
               System.out.print((i + 1) + ". "); 
               inventory[i].displayInfo();
               }
            } 
         else if(choice == 2){
            System.out.print("Enter the number of the book you want to rent (1-" + inventory.length + "): ");
            int bookIndex = scanner.nextInt() - 1;
               
            if(bookIndex >= 0 && bookIndex < inventory.length){
               if (inventory[bookIndex].isAvailable) {
                  inventory[bookIndex].isAvailable = false; 
                  System.out.println("Success! You have rented: " + inventory[bookIndex].title);
               } else {
                  System.out.println("Sorry, that book is already rented out!");
                  }
               } else {
                  System.out.println("Invalid book number.");
               }
            }
         else if (choice == 3) {
               // Exit
            running = false;
            System.out.println("Thank you for using the Library System. Goodbye!");
         } 
         else {
               // This catches any invalid choices like 4, 5, or 0
            System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
         }
         
         scanner.close();
   }

  
   
} 

   