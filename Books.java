import java.util.HashMap;
import ecs100.*;
/**
 * Holds a collection of books in a hashmap
 * Allows user to add, find, print all, and edit from a menu
 * maybe delete if we have time
 * prevent the user from adding a duplicate?
 *
 * @author Snigdha
 * @version 27/05/2021
 */
public class Books
{
    // instance variables - replace the example below with your own
    private HashMap<Integer, Book>booksMap;
    private int currBookId;

    /**
     * Constructor for objects of class Books
     */
    public Books()
    {
        // initialise instance variables
        booksMap = new HashMap<Integer, Book>();    // initialise hashmap
        
        // Creating Books
        Book b1 = new Book(1, "Pet Semetary", "Stephen King", 76);
        Book b2 = new Book(2, "1984", "George Orwell", 66);
        Book b3 = new Book(3, "Assassins Blade", "Sarah J Maas", 22);
        Book b4 = new Book(4, "The Subtle Art of Not Giving a F*ck", "Mark Mason", 99);
        
        booksMap.put(1, b1);
        booksMap.put(2, b2);
        booksMap.put(3, b3);
        booksMap.put(4, b4);
        
        this.currBookId = 4;  // initialise the book id
       
    }
    
    /**
     * Adds a book to the hashmap
     */
    public void addBook(){
        final int MAX_QUANTITY = 99;
        int quantity = - 1; 
        
        // Ask the user for details 
        String name = UI.askString("Title: ");
        String author = UI.askString("Author: ");
        
        //check boundaries for the number of books added to stock]
        do{
            quantity = UI.askInt("Quantity: ");
        } while (0 > quantity || quantity > MAX_QUANTITY);
        
        // add a book image for display in the GUI
        String imgFileName = UIFileChooser.open("Choose Image File: ");
        
        // Increment the book ID counter and add book to hashmap
        currBookId++; 
        booksMap.put(currBookId, new Book(currBookId, name, author, quantity, imgFileName));
    }
    
    /**
     * Finds a book based on Id
     * should refactor to find on name
     */
    //public void findBook(){
        //int bookId = UI.askInt("Id: ");   //Finds book on ID - change to title
        //UI.println(booksMap.get(bookId).getName());  // prints book name
        //booksMap.get(bookId).displayBook();   // shows book cover on canvas
    //}
    
    /**
     * Uses book name to find details
     */
    public void findBook(String bookName){
        //int bookId = UI.askInt("Id: ");   //Finds book on ID - change to title
        //bookName = UI.askString("Name: ");   // Ask user book name // Dont need this since the text field does the asking
        
        // Loop and return values 
        for (int bookId : booksMap.keySet()){
            if (bookName.equalsIgnoreCase(booksMap.get(bookId).getName())){
                UI.drawString("Book ID " + bookId + ": ", 50, 100);
                UI.drawString("Name: " + booksMap.get(bookId).getName(), 50, 120); 
                UI.drawString("Author: " + booksMap.get(bookId).getAuthor(), 50, 140);
                UI.drawString("Quantity in Store: " + booksMap.get(bookId).getQuantity(), 50, 160);
            }
            
            //UI.println(booksMap.get(bookId).getName());  // prints book name
            //booksMap.get(bookId).displayBook();   // shows book cover on canvas
        }
        
        
    }
    
    /**
     * Prints details for all books 
     */
    public void printAll(){
        // Traversing map
        for (int bookId : booksMap.keySet()){
            UI.println(bookId + " Details: ");
            UI.println(booksMap.get(bookId).getName() + " "
                     + booksMap.get(bookId).getAuthor() + " "
                     + booksMap.get(bookId).getQuantity());
        }
    }
    
    /**
     * Menu to print and call appropriate methods
     */
    // public void menu() {
        // // Print menu and force choice
        // String choice; 
        
        // do {
            // UI.println("(A)dd a book");
            // UI.println("(F)ind a book");
            // UI.println("(P)rint all");
            // UI.println("(Q)uit");
            
            // choice = UI.askString("Enter a choice");
            
            // if (choice.equalsIgnoreCase("A")){
                // addBook();
            // } else if (choice.equalsIgnoreCase("F")){
                // findBook();
            // } else if (choice.equalsIgnoreCase("P")){
                // printAll();
            // } else if (choice.equalsIgnoreCase("Q")) {
                // UI.println("Goodbye");
                // UI.quit();
            // } else {
                // UI.println("Thats not a choice idiot");
            // }
        // } while (!choice.equalsIgnoreCase("Q"));
        
        
       
    // }
}
