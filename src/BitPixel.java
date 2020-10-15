/*This is the code that will get a program set for graphics
Name:
Date:
Project:
Teacher:
*/

import java.awt.*;//needed for graphics
import javax.swing.*;//needed for JFrame window

public class BitPixel extends JFrame //need this to make a graphics window

{ //open program

  public BitPixel()    {//start constructor
 
  Container c = getContentPane();//c is the name...can be changed
  c.setBackground (Color.white);//makes the background white...color can be changed
 
}//end constructor
public static void main(String[] args) {//open main method 
  
	BitPixel w = new BitPixel (); //w is the variable that will define this graphics class
   w.setTitle("MAKE THIS THE TITLE OF YOUR WINDOW");//makes a header for the window
   //w.setSize(Toolkit.getDefaultToolkit().getScreenSize());
   w.setSize(300,300);   
   w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//stops program from running when X out
   w.setVisible(true);//allows window to open
 }//end main method

  public void paint (Graphics g)
  //allows for painting and drawing to take place in the frame we have created.  g is a variable
  //In this method we will make the drawings and graphics
  
  {//open paint method
   super.paint(g);//another command for painting and drawing to take place in the frame we have created
   
   Font font1 = new Font("Serif",Font.BOLD,50); //creates a font setting for text on screen
   g.setFont(font1); 
   Sonic(60, 50, g);

  
  }//close paint method
  public static void Sonic ( int x, int y, Graphics g)
  {
  Color SonicBlue = new Color(80, 80, 240);
  Color SonicYellow = new Color(240, 192, 32);
  Color SonicRed = new Color(240, 0, 0);
  Color SonicGreen = new Color(0, 128, 0);
  //Outline
  g.setColor(Color.black);
  g.fillRect(x, y, 32, 4);
  g.fillRect(x+40, y, 8, 4);
  g.fillRect(x-4,y+4,4,4);
  g.fillRect(x+32, y+4, 8, 4);
  g.fillRect(x+44, y+4, 4, 4);
  g.fillRect(x,y+8,4,4);
  g.fillRect(x+16,y+8,4,12);
  g.fillRect(x+44, y+8, 4, 4);
  g.fillRect(x+4,y+12,4,4);
  g.fillRect(x+44, y+12, 4, 4);
  g.fillRect(x+8,y+16,4,4);
  g.fillRect(x+48, y+16, 4, 4);
  g.fillRect(x+4,y+20,4,4);
  g.fillRect(x,y+24,4,4);
  g.fillRect(x-4,y+28,4,4);
  g.fillRect(x-8,y+32,20,4);
  g.fillRect(x+36,y+32,4,4);
  g.fillRect(x+48,y+32,4,4);
  g.fillRect(x+4,y+36,4,4);
  g.fillRect(x+44,y+36,12,4);
  g.fillRect(x,y+40,4,4);
  g.fillRect(x+48,y+40,4,4);
  g.fillRect(x-4,y+44,4,4);
  g.fillRect(x+44,y+44,4,4);
  g.fillRect(x-8,y+48,32,4);
  g.fillRect(x+40,y+48,4,4);
  g.fillRect(x+16,y+52,4,4);
  g.fillRect(x+24,y+52,16,4);
  g.fillRect(x+12,y+56,4,4);  
  g.fillRect(x+20,y+56,8,4);  
  g.fillRect(x+40,y+56,8,4);  
  g.fillRect(x+8,y+60,4,4);
  g.fillRect(x+16,y+60,4,4);
  g.fillRect(x+28,y+60,4,4);
  g.fillRect(x+40,y+60,4,4);
  g.fillRect(x+48,y+60,4,4);
  g.fillRect(x+8,y+64,8,4);
  g.fillRect(x+32,y+64,4,4);
  g.fillRect(x+40,y+64,4,4);
  g.fillRect(x+48,y+64,4,4);
  g.fillRect(x+12,y+68,4,4);
  g.fillRect(x+32,y+68,8,4);
  g.fillRect(x+44,y+68,4,4);
  g.fillRect(x+16,y+72,4,4);
  g.fillRect(x+28,y+72,4,4);
  g.fillRect(x+36,y+72,8,4);
  g.fillRect(x+20,y+76,16,4);
  g.fillRect(x+20,y+80,4,4);
  g.fillRect(x+28,y+80,8,4);
  g.fillRect(x+16,y+84,8,4);
  g.fillRect(x+28,y+84,16,4);
  g.fillRect(x+12,y+88,4,4);
  g.fillRect(x+28,y+88,4,4);
  g.fillRect(x+40,y+88,4,4);
  g.fillRect(x+12,y+92,4,4);
  g.fillRect(x+28,y+92,8,4);
  g.fillRect(x+44,y+92,8,4);
  g.fillRect(x+8,y+96,4,4);
  g.fillRect(x+36,y+96,8,4);
  g.fillRect(x+52,y+96,4,4);
  g.fillRect(x+8,y+100,4,4);
  g.fillRect(x+44,y+100,4,4);
  g.fillRect(x+56,y+100,4,4);
  g.fillRect(x+8,y+104,52,4);
  //Head
  g.setColor(SonicBlue);
  g.fillRect(x,y+4,4,4);
  g.fillRect(x+4,y+4,4,8);
  g.fillRect(x+8,y+4,8,12);
  g.fillRect(x+16,y+4,16,4);
  g.fillRect(x+40,y+4,4,32);
  g.fillRect(x+24,y+8,4,4);
  g.fillRect(x+28,y+8,12,12);
  g.fillRect(x+12,y+16,4,4);
  g.fillRect(x+24,y+16,4,8);
  g.fillRect(x+44,y+16,4,12);
  g.fillRect(x+36,y+20,4,4);
  g.fillRect(x+8, y+20, 16, 12);
  g.fillRect(x+12, y+32, 12, 4);
  g.fillRect(x,y+28,4,4);
  g.fillRect(x+4,y+24,4,8);
  g.fillRect(x+8, y+36, 20, 4);
  g.fillRect(x+4, y+40, 16, 8);
  g.fillRect(x, y+44, 4, 4);
  g.setColor(SonicYellow);
  g.fillRect(x+20, y+40, 8, 8);
  g.fillRect(x+28, y+44, 12, 8);
  g.fillRect(x+40, y+44, 4, 4);
  g.fillRect(x+40, y+40, 8, 4);
  g.fillRect(x+24, y+48, 4, 4);
  g.fillRect(x+20, y+8, 4, 12);
  g.fillRect(x+24, y+12, 4, 4);
  g.fillRect(x+20, y+52, 4, 4);
  g.fillRect(x+16, y+56, 4, 4);
  g.fillRect(x+12, y+60, 4, 4);
  g.fillRect(x+32, y+56, 8, 4);
  g.fillRect(x+32, y+60, 8, 4);
  g.fillRect(x+36, y+64, 4, 4);
  g.setColor(SonicBlue);
  g.fillRect(x+28, y+56, 4, 4);
  g.fillRect(x+40, y+68, 4, 4);
  g.fillRect(x+24, y+80, 4, 8);
  //Shoes
  g.setColor(SonicRed);
  g.fillRect(x+12, y+96, 12, 8);
  g.fillRect(x+24, y+96, 4, 4);
  g.fillRect(x+28, y+100, 16, 4);
  g.fillRect(x+36, y+92, 8, 4);
  g.fillRect(x+44, y+96, 8, 4);
  g.fillRect(x+48, y+100, 8, 4);
  //Eyes
  g.setColor(SonicGreen);
  g.fillRect(x+36, y+28, 4, 4);
  g.fillRect(x+48, y+28, 4, 4);
  g.fillRect(x+36, y+36, 4, 4);
  }

}//close program
