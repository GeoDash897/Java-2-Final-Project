import java.awt.*;//needed for graphics
import javax.swing.*;//needed for JFrame window
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CollisionRemastered 
        extends JFrame implements 
        KeyListener, ActionListener {//opens program

public int x1=50;
public int y1=50;
public int x2=120;
public int y2=120;
public int w=50;
public int h=50;

boolean collide=false;

public static Rectangle CollisionSonic; //creating a rectangle variable called redRect
public static Rectangle blackRect; //creating a rectangle variable called blackRect

public CollisionRemastered (){//constructor for JPanel

    add(new JP());
    CollisionSonic = new Rectangle(x1,y1,w,h); //creating a rectangle object called redRect
    blackRect = new Rectangle(x2,y2,w,h); //creating a rectangle object called blackRect


}//close Jpanel Constructor

public static void main(String[] args){//start main method


	CollisionRemastered  w=new CollisionRemastered ();
	w.setTitle("boxCollisionwObjects ");
	//w.setSize(500,500);
        w.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	w.setVisible(true);
        w.addKeyListener(w);
        
}//end main

public class JP extends JPanel{//start JPanel CLass
	
    public JP(){
	Container c = getContentPane();
	setOpaque(false);//allows for setting a color background in JPanel
        c.setBackground(Color.blue);  
	}

	public void paint(Graphics g) {//opens paint method

	super.paint(g);//allows for painting and
	g.setColor(Color.red);
        
        redBox(g,x1, y1);
        blackBox(g,x2, y2);
        CollisionSonic = new Rectangle(x1,y1,w,h);
        blackRect = new Rectangle(x2,y2,w,h);
        collide=collision(g);
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
        if (e.getKeyCode() == e.VK_RIGHT) {
            
            
            if (collide)
            {x1 -= 20;
            collide=false;}
            
            else x1 += 2;
            
        }
        if (e.getKeyCode() == e.VK_LEFT) {
            if (collide)
            {x1 += 20;
            collide=false;}
            
            else x1 -= 2;
            
        }
        if (e.getKeyCode() == e.VK_UP) {
            if(collide)
            {y1+=20;
            collide=false;}
            
            else  y1 -= 2;
            
        }
        if (e.getKeyCode() == e.VK_DOWN) {
            if(collide)
            {y1-=20;
            collide=false;}
            
            else y1 += 2;
            
            
        }

    }
    
    public void redBox(Graphics g, int x, int y)
    
    {
    g.setColor(Color.red);
    g.fillRect(x1, y1, w, h);
    }
    
    public void blackBox(Graphics g, int x, int y)
    
    {
    g.setColor(Color.black);
    g.fillRect(x2, y2, w, h);
    }
    
    public static boolean collision(Graphics g)
    {
    boolean collide=false;    
    if(CollisionSonic.intersects(blackRect)){collide=true;}
    return collide;    
    }
}//close program




