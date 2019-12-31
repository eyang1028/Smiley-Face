//© A+ Computer Science  -  www.apluscompsci.com
//Name - Elaine Yang
//Date - 10/2/14
//Class - Period 4
//Lab - 5

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{	
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.lightGray);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.RED);
      window.drawString("SMILEY FACE LAB ", 35, 35 );
	  
	  window.setColor(Color.RED);
	  window.drawString("PIKACHU", 385, 550 );

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
	  
	  window.setColor(Color.RED);
	  window.fillOval( 225, 300, 100, 100 );
	  
	  window.setColor(Color.RED);
	  window.fillOval( 495, 300, 100, 100 );
	  
	  window.setColor(Color.BLACK);
	  window.fillOval( 405, 350, 10, 10 );
	  
	  window.setColor(Color.BLACK);
	  window.fillOval( 305, 265, 20, 20 );
	  
	  window.setColor(Color.BLACK);
	  window.fillOval( 475, 265, 20, 20 );
	  
	  window.setColor(Color.WHITE);
	  window.fillOval( 305, 265, 10, 10 );
	  
	  window.setColor(Color.WHITE);
	  window.fillOval( 475, 265, 10, 10 );
	  
	  window.setColor(Color.BLACK);
	  window.drawArc( 360, 375, 100, 50, -180, 180 );
	  
	  window.setColor(Color.YELLOW);
	  window.fillOval( 260, 5, 50, 250 );
	  
	  window.setColor(Color.YELLOW);
	  window.fillOval( 510, 5, 50, 250 );
	  
	  window.setColor(Color.BLACK);
	  window.fillArc( 268, 5, 35, 75, 180, -180 );
	  
	  window.setColor(Color.BLACK);
	  window.fillArc( 518, 5, 35, 75, 180, -180 );
   }
}