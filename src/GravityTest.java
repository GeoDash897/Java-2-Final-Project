import java.awt.*;//needed for graphics
import javax.swing.*;//needed for JFrame window
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GravityTest extends JFrame implements KeyListener, ActionListener {
//opens program

public static int wide = 100;
public static int high = 100;
public static Image Sonic; //Pic is the name
public static int xSonic = 100;//starting position for the image Pic
public static int ySonic = 150;//starting position for the image Pic
public static int gravity = 0;
public static int jumpheight = 0;
public static int jump = 0;


    
/***********************************************************/
    public GravityTest() {//constructor for JPanel
        add(new JP());
    }//close Jpanel Contructor
/***********************************************************/
    public static void main(String[] args) {//start main method

        GravityTest w = new GravityTest();
        w.setTitle("logicCollision");
        w.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wide = (int) w.getWidth();//gets the width of the screen
        high = (int) w.getHeight();//gets the height of the screen
        w.setVisible(true);
        w.addKeyListener(w);
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Stand 1.png"); 
        
    }//close main
/***********************************************************/
    public class JP extends JPanel {//start JPanel CLass

        public JP() {
            Container c = getContentPane();
            setOpaque(false);//allows for setting a color background in JPanel
            c.setBackground(Color.gray);//background color can be changed
        }

        public void paint(Graphics g) {//opens paint method
        Font font1 = new Font("Comic Sans MS",Font.BOLD,20); //creates a font setting for text on screen
          g.setFont(font1); 
            super.paint(g);//allows for painting and repainting
            if(gravity < 0 && jump ==1) {
                  ySonic-=1;  
                }
               if(gravity > 0 && gravity <= Math.abs(jumpheight) && jump ==1) {
                  ySonic+=1;
                }
               if(gravity > 0 && gravity == Math.abs(jumpheight) && jump ==1) {
                  jump = 0;  
                }
                gravity++;
                if(gravity > 0 && jump == 0 && ySonic <= 320) {
                    ySonic+=1;
                }
               g.drawString("gravity"+gravity,500,400);
               g.drawString("jumpheight"+jumpheight,700,400);
                g.drawString("jump"+jump,850,400);
               g.drawImage(Sonic, xSonic, ySonic, 120, 160, this);
                repaint();

        }//close paint method

    }//close JPanel Class
/***********************************************************/
public static void pause(int time) {

        try //opens an exception handling statement
        {
            Thread.sleep(time);
        } catch (InterruptedException e) {
        }  //captures the exception

    }//close pause method


    public void actionPerformed(ActionEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_RIGHT ) {
            xSonic+=10;
            
        }
        if (e.getKeyCode() == e.VK_LEFT ) {
            xSonic-=10;
        }
           
        if (e.getKeyCode() == e.VK_UP ) {
        ySonic-=10;
        }
        if (e.getKeyCode() == e.VK_DOWN ) {
        ySonic+=10;
        }
        if (e.getKeyCode() == e.VK_Z ) {
            if(jump == 0) {
            gravity = -30;
            jumpheight = -30;
            jump = 1;   
            }
        }
       
    }//end keypressed
/***********************************************************/
   
    
}//close program


