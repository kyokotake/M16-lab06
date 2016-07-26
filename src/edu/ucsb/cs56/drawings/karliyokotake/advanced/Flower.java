package edu.ucsb.cs56.drawings.karliyokotake.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Ellipse2D; //ellipses

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Coffee Cup (wrapper around a General Path, implements Shape)

   This provides an example of how you can start with the coordinates
   of a hard coded object, and end up with an object that can be
   drawn anywhere, with any width or height.   
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class Flower extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class CoffeeCup
     */
    public Flower(double x, double y, double width, double height)
    {
	
        // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* coffee cup
        
        final double ORIG_ULX = 100.0; 
        final double ORIG_ULY = 75.0; 
        final double ORIG_HEIGHT = 310.0; 
        final double ORIG_WIDTH = 200.0;
	        
        GeneralPath stem = new GeneralPath();
	stem.moveTo(200,400);
	stem.lineTo(200,200);

	//center of flower
	Ellipse2D.Double centerOfFlower =
	    new Ellipse2D.Double(175,150,50,50);

	GeneralPath leftside = new GeneralPath();

	leftside.moveTo(175,150);
	leftside.lineTo(125,100);
	
	leftside.moveTo(165,175);
	leftside.lineTo(100,175);
	
	leftside.moveTo(175,200);
	leftside.lineTo(150,250);
	
	leftside.moveTo(200,140);
	leftside.lineTo(200,75);
	
		       
        Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftside);
	
        // after flipping around the upper left hand corner of the
        // bounding box, we move this over to the right by 400 pixels
       
	 rightSide = ShapeTransforms.translatedCopyOf(rightSide, 200.0, 0.0);
       
        // now we put the whole thing together ino a single path.
       
        GeneralPath wholeFlower = new GeneralPath ();
        wholeFlower.append(stem, false);
	wholeFlower.append(centerOfFlower,false);
	 wholeFlower.append(leftside, false);
        wholeFlower.append(rightSide, false);

        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
        
	     Shape s = ShapeTransforms.translatedCopyOf(wholeFlower, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
	 s =  ShapeTransforms.scaledCopyOf(s,
						  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable cup
        
	this.set(new GeneralPath(s));
	
    }

}
