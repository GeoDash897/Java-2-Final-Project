import java.awt.*;//needed for graphics
import javax.swing.*;//needed for JFrame window
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Collision extends JFrame implements KeyListener, ActionListener {
//opens program

public static int wide = 100;
public static int high = 100;
public static int xR = 100;//the x coord of the red moving box
public static int yR = 100;//the y coord of the red moving box
public static int w = 100;//width of both boxes
public static int h = 100;//height of both boxes
public static int xB = 300;//the x coord of the black static box
public static int yB = 300;//the y coord of the black static box

    
/***********************************************************/
    public Collision() {//constructor for JPanel
        add(new JP());
    }//close Jpanel Contructor
/***********************************************************/
    public static void main(String[] args) {//start main method

        Collision w = new Collision();
        w.setTitle("logicCollision");
        w.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wide = (int) w.getWidth();//gets the width of the screen
        high = (int) w.getHeight();//gets the height of the screen
        w.setVisible(true);
        w.addKeyListener(w);
        
        
    }//close main
/***********************************************************/
    public class JP extends JPanel {//start JPanel CLass

        public JP() {
            Container c = getContentPane();
            setOpaque(false);//allows for setting a color background in JPanel
            c.setBackground(Color.gray);//background color can be changed
        }

        public void paint(Graphics g) {//opens paint method

            super.paint(g);//allows for painting and
                g.setColor(Color.red);
                g.fillRect(xR,yR,w,h);
                g.setColor(Color.black);
                g.fillRect(xB,yB,w,h);
                repaint();
              
        }//close paint method

    }//close JPanel Class
/***********************************************************/

    public void actionPerformed(ActionEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_RIGHT ) {
         if(xR+w > xB && yR<=yB+h && yR+h >= yB && xR <= xB) {
             xR +=0;       } 
         else{
             xR+=3;
         }
        }
        if (e.getKeyCode() == e.VK_LEFT ) {
        if(xR<=xB+w && yR<=yB+h && yR+h >= yB && xR >= xB)  {
             xR +=0;       } 
         else{
             xR-=3;
         }
        }
           
        if (e.getKeyCode() == e.VK_UP ) {
         if(yR <= yB+h && xR<=xB+w && xR+w >= xB && yR >= yB) {
             yR +=0;       } 
         else{
             yR-=3;
         }  
        }
        if (e.getKeyCode() == e.VK_DOWN ) {
        if(yR+h > yB && xR<=xB+w && xR+w >= xB && yR <= yB) {
             yR +=0;       } 
         else{
             yR+=3;
         }
        }
       
    }//end keypressed
/***********************************************************/
   
    
}//close program


