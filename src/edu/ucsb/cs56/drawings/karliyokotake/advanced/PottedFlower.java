package edu.ucsb.cs56.drawings.karliyokotake.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A House
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class PottedFlower extends Flower implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public PottedFlower(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height*4/5);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
		
	Rectangle2D.Double pot =
	    new Rectangle2D.Double(x,y+height*4/5, width, height/5);
	
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(pot, false);
        
    }    
}
