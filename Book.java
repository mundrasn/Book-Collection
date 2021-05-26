
/**
 * Support class of Book 
 * A Book contains an id, name, author, quantity, image
 *
 * @author Snigdha
 * @version May 2021
 */
public class Book
{
    // field
    private int id;
    private String name; 
    private String author; 
    private int quantity; 
    private String image;

    /**
     * Constructor for objects of class Book
     */
    public Book(int id, String nm, String auth, int qty)
    {
        // initialise instance variables
        this.id = id; 
        this.name = nm; 
        this.author = auth;
        this.quantity = qty;
    }

    /**
     * Getter for id
     *
     * @return int the id 
     */
    public int getId()
    {
        return this.id;
    }
    
    /**
     * Getter for name
     *
     * @return String the name 
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Getter for author
     *
     * @return String the author 
     */
    public String getAuthor()
    {
        return this.author; 
    }
    
    /**
     * Getter for quantity
     *
     * @return int the quantity 
     */
    public int getQuantity()
    {
        return this.quantity;
    }
}
