import ecs100.*;
/**
 * Adding buttons to the interface
 *
 * @author Snigdha Mundra
 * @version 27/05/2021
 */
public class GUI
{

    /**
     * Constructor for objects of class GUI
     */
    public GUI(){
        // initialise instance variables
        Books bk = new Books(); 
        UI.initialise(); 
        
        UI.addButton("Show All Books", bk::printAll);
        UI.addButton("Add New Book", bk::addBook);
        UI.addTextField("Find Book", bk::findBook);
    }
}
