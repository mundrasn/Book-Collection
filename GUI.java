import ecs100.*;
/**
 * Adding buttons to the interface
 *
 * @author Snigdha Mundra
 * @version 27/05/2021
 */
public class GUI
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        Books bk = new Books(); 
        UI.initialise(); 
        UI.addButton("Find Book", bk::findBook);
        UI.addButton("Show All Books", bk::printAll);
        UI.addButton("Add New Book", bk::addBook);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
