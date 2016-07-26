package edu.ucsb.cs56.drawings.karliyokotake.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Karli YOkotake
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Flower f1 = new Flower(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(f1);
	
		
	Shape f2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	g2.setColor(Color.BLACK); g2.draw(f2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	f2 = ShapeTransforms.scaledCopyOfLL(f2,4,4);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(f2); 
			
	PottedFlower pf1 = new PottedFlower(50,350,40,75);
	PottedFlower pf2 = new PottedFlower(200,350,200,100);
	
	g2.draw(pf1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(pf2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("FLowers by Karli Yokotake", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
		
	Flower f1 = new Flower(100,250,50,75);
	g2.setColor(Color.MAGENTA);
	Shape f = ShapeTransforms.rotatedCopyOf(f1,Math.PI*3/4);
	g2.draw(f);
	
	
	Shape f2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	g2.setColor(new Color(0xE30B5C)); g2.draw(f2);
	
	Shape f3 = ShapeTransforms.rotatedCopyOf(f2, Math.PI);
	f3 = ShapeTransforms.translatedCopyOf(f3, 300, 0);
	g2.draw(f3);
	
	f2 = ShapeTransforms.scaledCopyOfLL(f2,4,4);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(f2); 
	
	// Draw two houses with Windows
	
	PottedFlower pf1 = new PottedFlower(150,350,40,75);
	PottedFlower pf2 = new PottedFlower(300,350,100,100);
	
	g2.draw(pf1);
	g2.setColor(new Color(0x33CC99)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape pf3 = ShapeTransforms.rotatedCopyOf(pf2, Math.PI/2.0);
	
	g2.draw(pf3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Flower Chaos by Karli Yokotake", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Potted Flowers by Karli", 20,20);
	
	
	
	
	PottedFlower f1 = new PottedFlower(100,50,100,200);
	PottedFlower f2 = new PottedFlower(200,50,40,30);
	PottedFlower f3 = new PottedFlower(300,50,60,90);
	PottedFlower f4 = new PottedFlower(100,300,150,250);
	PottedFlower f5 = new PottedFlower(200,300,50,75);
	PottedFlower f6 = new PottedFlower(300,300,200,100);
	
	g2.setColor(Color.RED);     g2.draw(f1);
	g2.setColor(Color.ORANGE);   g2.draw(f2);
	g2.setColor(Color.YELLOW); g2.draw(f3);
	g2.setColor(Color.GREEN); g2.draw(f4);
	g2.setColor(Color.BLUE); g2.draw(f5);
	g2.setColor(Color.MAGENTA); g2.draw(f6);
	
    }       
}
