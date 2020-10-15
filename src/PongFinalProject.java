import java.awt.*;//needed for graphics
import javax.swing.*;//needed for JFrame window
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongFinalProject 
        extends JFrame implements 
        KeyListener, ActionListener,Runnable {//opens program

public int x1=115;
public int y1=400;
public int x2=1200;
public int y2=400;
public int w=25;
public int h=100;
public static int bx = 600;
public static int by = 500;
public int blackscore = 0;
public int redscore = 0;
public static int wide;
public static int high;
int ballright = 0;
int ballleft = 1;
int balltop = 0;
int balldown = 0;
int gameover = 0;
public static boolean collideblackend = false;
public static boolean collideredend = false;
public static int gametime = 0;
public static int seconds; 
public static int cut = 0; 
public static int numbercut = 0;
public static Color BlackColor;
public static Color RedColor;

public static Rectangle redRect; //creating a rectangle variable called redRect
public static Rectangle blackRect; //creating a rectangle variable called blackRect
public static Rectangle redRectEnd; //creating a rectangle variable called redRect
public static Rectangle blackRectEnd; //creating a rectangle variable called blackRect
public static Rectangle ball; //creating a rectangle variable called blackRect


public PongFinalProject (){//constructor for JPanel

    add(new JP());
    redRect = new Rectangle(x1,y1,w,h); //creating a rectangle object called redRect
    blackRect = new Rectangle(x2,y2,w,h); //creating a rectangle object called blackRect
    redRectEnd = new Rectangle(0,0,50,1000); //creating a rectangle object called redRect
    blackRectEnd = new Rectangle(1300,0,50,1000); //creating a rectangle object called blackRect
    ball = new Rectangle(bx,by,15,15); //creating a rectangle object called blackRect

}//close Jpanel Constructor

public static void main(String[] args){//start main method

        System.setProperty("sun.java2d.opengl", "True");
	PongFinalProject  w=new PongFinalProject ();
	w.setTitle("Ping");
	//w.setSize(500,500);
        w.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	w.setVisible(true);
        w.addKeyListener(w);
        wide = (int) w.getWidth();	//gets the width of the screen
        high = (int) w.getHeight();	//gets the height of the screen        
        Thread t1 = new Thread(new PongFinalProject());
        t1.start();
        
}//end main

public class JP extends JPanel{//start JPanel CLass
	
    public JP(){
	Container c = getContentPane();
	setOpaque(false);//allows for setting a color background in JPanel
        c.setBackground(Color.gray);  
	}

	public void paint(Graphics g) {//opens paint method

	super.paint(g);//allows for painting and
	g.setColor(Color.red);
        Font vars = new Font("Comic Sans MS",Font.BOLD,10);
        Font score = new Font("Comic Sans MS",Font.BOLD,30);
        Font gameovertext = new Font("Comic Sans MS",Font.BOLD,50);
        g.setFont(vars);
        if(gameover == 0) {
        gametime++;
        seconds = gametime/200;
        if(seconds%60 == 0 && seconds != 0 && cut == 0) {
           h-=10; 
           numbercut++;
           cut = 1;
        }
        else if(seconds%60 != 0 && seconds != 0 && cut == 1) {
           cut = 0;
        }
        g.setColor(Color.red);
        g.setColor(RedColor);
        g.fillRect(x1, y1, w, h);
        g.setColor(Color.black);
        g.setColor(BlackColor);
        g.fillRect(x2, y2, w, h);
        redRect = new Rectangle(x1,y1,w,h);
        blackRect = new Rectangle(x2,y2,w,h);
        redRectEnd = new Rectangle(0,0,50,1000);
        blackRectEnd = new Rectangle(1300,0,50,1000);
        ball = new Rectangle(bx,by,15,15);
        g.setColor(Color.blue);
        g.fillRect(bx, by, 15, 15);
        g.setColor(Color.red);
        g.fillRect(0, 0, 50, 1000);
        g.setColor(Color.black);
        g.fillRect(1300, 0, 50, 1000);
        if(ball.intersects(blackRectEnd)){collideblackend=true;}   
        else if (ball.intersects(redRectEnd)){collideredend=true;}   
        if(ballright == 1 && collideblackend == false && collideredend == false && by == 0) {
            balldown = 0;
            balltop = 1;
        }
        else if(ballright == 1 && collideblackend == false && collideredend == false && by == high-75) {
            balltop = 0;
            balldown = 1;
        }
        else if(ballleft == 1 && collideblackend == false && collideredend == false && by == 0) {
            balldown = 0;
            balltop = 1;
        }
        else if(ballleft == 1 && collideblackend == false && collideredend == false && by == high-75) {
            balltop = 0;
            balldown = 1;
        }
        if(ballright == 1 && balltop == 0 && ballleft == 0 && balldown == 0 && collideblackend == false && collideredend == false && by != 0) {
            bx +=1;
            by +=1;
        }
        else if(ballright == 0 && balltop == 0 && ballleft == 1 && balldown == 0 && collideblackend == false && collideredend == false && by != 0) {
            bx -=1;
            by +=1;
        }
        else if(ballright == 1 && balltop == 1 && ballleft == 0 && balldown == 0 && collideblackend == false && collideredend == false) {
            bx +=1;
            by +=1;
        }
        else if(ballleft == 1 && balltop == 1 && ballright == 0 && balldown == 0 && collideblackend == false && collideredend == false) {
            bx -=1;
            by +=1;
        }
        else if(ballright == 1 && balltop == 0 && ballleft == 0 && balldown == 1 && collideblackend == false && collideredend == false) {
            bx +=1;
            by -=1;
        }
        else if(ballleft == 1 && balltop == 0 && ballright == 0 && balldown == 1 && collideblackend == false && collideredend == false) {
            bx -=1;
            by -=1;
        }
        if (ball.intersects(blackRect) && ballright == 1 && ballleft == 0) {
            ballright = 0;
            ballleft = 1;
            BlackPaddleColor(g);
        }
        else if (ball.intersects(redRect) && ballright == 0 && ballleft == 1) {
            ballright = 1;
            ballleft = 0;
            RedPaddleColor(g);
        } 
        if(collideblackend == true && collideredend == false) {
            bx = 600;
            by = 500;
            redscore++;
            ballright = 0;
            ballleft = 1;
            balltop = 1;
            balldown = 0;
            collideblackend = false;
        }
        if(collideredend == true && collideblackend == false) {
            bx = 600;
            by = 500;
            blackscore++;
            ballright = 1;
            ballleft = 0;
            balltop = 1;
            balldown = 0;
            collideredend = false;
        }
        g.drawString("ballright "+ballright, 600, 500);
        g.drawString("ballleft "+ballleft, 600, 400);
        g.drawString("balltop "+balltop, 600, 300);
        g.drawString("balldown "+balldown, 600, 200);
        g.drawString("collideblackend "+collideblackend, 600, 600);
        g.drawString("collideredend "+collideredend, 600, 650);
        g.setFont(score);
        g.drawString("Timer: "+seconds,500,50);
        g.setColor(BlackColor);
        g.drawString("Black: "+blackscore, 850, 50);
        g.setColor(Color.red);
        g.setColor(RedColor);
        g.drawString("Red: "+redscore, 300, 50);
        }
        else if(gameover == 1) {
            g.setFont(gameovertext);
            g.drawString("Game Over!", 500, 200);
            g.drawString("Scores", 500, 275);
            g.setColor(Color.red);
            g.setColor(RedColor);
            g.drawString("Red: "+redscore, 400, 350);
            g.setColor(Color.black);
            g.setColor(BlackColor);
            g.drawString("Black: "+blackscore, 625, 350);
            g.setColor(Color.red);
            g.drawString("Want to play again? Y for Yes, N for No",200,450);
        }
        else if(gameover == 2) {
            g.setFont(gameovertext);
            g.drawString("Game Over!", 500, 200);
            g.drawString("Scores", 500, 275);
            g.setColor(Color.red);
            g.setColor(RedColor);
            g.drawString("Red: "+redscore, 400, 350);
            g.setColor(Color.black);
            g.setColor(BlackColor);
            g.drawString("Black: "+blackscore, 625, 350);
            g.setColor(Color.red);
            g.drawString("Want to play again? Y for Yes, N for No",200,450);
            g.drawString("Nice!, one of the players got higher than 5! :D",150,550);
        }
        repaint();//allows for repainting to look normal
        
	}//close paint method

}//close JPanel Class
public void actionPerformed(ActionEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        /*if (e.getKeyCode() == e.VK_RIGHT) {
            
            
            if (collide)
            {x1 -= 20;
            counter++;
            collide=false;}
            
            else x1 += 10;
            
        }
        if (e.getKeyCode() == e.VK_LEFT) {
            if (collide)
            {x1 += 20;
            counter++;
            collide=false;}
            
            else x1 -= 10;
            
        }*/
        if (e.getKeyCode() == e.VK_UP && y2 > 0 ) {
             y2 -= 15;            
        }
        if (e.getKeyCode() == e.VK_DOWN && y2 < high-175+(numbercut*10)) {
             y2 += 15;
        }
        /*if (e.getKeyCode() == e.VK_D) {
            
            
            if (collide)
            {x2 -= 20;
            counter++;
            collide=false;}
            
            else x2 += 10;
            
        }
        if (e.getKeyCode() == e.VK_A) {
            if (collide)
            {x2 += 20;
            counter++;
            collide=false;}
            
            else x2 -= 10;
            
        }*/
        if (e.getKeyCode() == e.VK_W && y1 > 0 ) {           
            y1 -= 15;
            
        }
        if (e.getKeyCode() == e.VK_S && y1 < high-175+(numbercut*10)) {
            y1 += 15;                   
        }
        if (e.getKeyCode() == e.VK_Q && redscore < 5 && blackscore < 5) {
            gameover = 1;                  
        }
        else if ((e.getKeyCode() == e.VK_Q && redscore > 5) || (e.getKeyCode() == e.VK_Q && blackscore > 5)) {
            gameover = 2;                  
        }
        if(e.getKeyCode() == e.VK_Y && gameover != 0) {
            redscore = 0;
            blackscore = 0;
            bx = 600;
            by = 500;
            ballright = 0;
            ballleft = 1;
            balltop = 1;
            balldown = 0;
            gameover = 0;
            x1=115;
            y1=400;
            x2=1200;
            y2=400;
            gametime = 0;
            cut = 0;
            numbercut = 0;
            h =100;
            BlackColor = Color.black;
            RedColor = Color.red;
        }
        if(e.getKeyCode() == e.VK_N && gameover != 0) {
            System.exit(0);
        }
        if(e.getKeyCode() == e.VK_N) {
            gametime =60000;
        }
        if(e.getKeyCode() == e.VK_H) {
            gametime =120000;
        }
        if(e.getKeyCode() == e.VK_M) {
            cut = 0;
        }

    }
    
    public void redBox(Graphics g)
    
    {
    g.setColor(Color.red);

    }
    
    public void blackBox(Graphics g)
    
    {
    
    }
    public static void BlackPaddleColor(Graphics g) {
     for(int i = 0;i < 1000; i++) {
       int R = (int) (Math.random() * 256);
       int G = (int) (Math.random() * 256);
       int B = (int) (Math.random() * 256);
       BlackColor = new Color (R,G,B);
       g.setColor(BlackColor);
     }
 }
     public static void RedPaddleColor(Graphics g) {
     for(int i = 0;i < 1000; i++) {
       int R = (int) (Math.random() * 256);
       int G = (int) (Math.random() * 256);
       int B = (int) (Math.random() * 256);
       RedColor = new Color (R,G,B);
       g.setColor(RedColor);
     }
 }
  public void run( ) {
System.out.println("Defeuq is this?");   
  }
}//close program
