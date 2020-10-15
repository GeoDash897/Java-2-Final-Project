import java.awt.*;//needed for graphics
import javax.swing.*;//needed for JFrame window
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class FireLaunchHit 
        extends JFrame implements 
        KeyListener, ActionListener {//opens program

public static int x1=150;
public static int y1=150;
public static int x2=900;
public static int y2=120;
public static int w=50;
public static int h=50;
public static int w2=100;
public static int h2=100;
public static int healthx = 251;
public static int healthy = 576;
public static int healthw = 250;
public static int healthh = 49;
public static int bx;
public static int by;
public static int bw = 10;
public static int bh = 10;
public static int powerx = 400;
public static int powery = 200;
public static int powerw = 100;
public static int powerh = 100;

public static int ammosize = 5;
public static int ammo = ammosize;
public static int direction = 1;
public static int lives = 3;

public static int hit = 0;

public static int wide;
public static int high;
public static String music;
public static Clip clip;

public static boolean fire = false;
public static boolean reload = false;
boolean collide=false;
public static boolean bulletCollide = false;
public static int powerCollide = 0;

public static boolean left = false;

public static Rectangle redRect; //creating a rectangle variable called redRect
public static Rectangle blackRect; //creating a rectangle variable called blackRect
public static Rectangle bulletBox; //creating a rectangle variable called blackRect
public static Rectangle powerUp; //creating a rectangle variable called blackRect

public FireLaunchHit (){//constructor for JPanel

    add(new JP());
    redRect = new Rectangle(x1,y1,w,h); //creating a rectangle object called redRect
    blackRect = new Rectangle(x2,y2,w2,h2); //creating a rectangle object called blackRect


}//close Jpanel Constructor

public static void main(String[] args){//start main method


	FireLaunchHit  w=new FireLaunchHit ();
	w.setTitle("boxCollisionwObjects ");
	//w.setSize(500,500);
        w.setSize(Toolkit.getDefaultToolkit().getScreenSize());
	w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	w.setVisible(true);
        w.addKeyListener(w);
        wide = (int) w.getWidth();	//gets the width of the screen
        high = (int) w.getHeight();	//gets the height of the screen
        
}//end main

public class JP extends JPanel{//start JPanel CLass
	
    public JP(){
	Container c = getContentPane();
	setOpaque(false);//allows for setting a color background in JPanel
        c.setBackground(Color.gray);  
	}

	public void paint(Graphics g) {//opens paint method

	super.paint(g);//allows for painting and   
        Font font1 = new Font("Comic Sans MS",Font.BOLD,25);
        Font gover = new Font("Comic Sans MS",Font.BOLD,75);
         g.setFont(font1);
         if(lives > 0) {
        g.setColor(Color.red);      
        redBox(g);
        redRect = new Rectangle(x1,y1,w,h);
        if(powerCollide == 0) {
        g.setColor(Color.green); 
        g.fillRect(powerx,powery,powerw,powerh);
        powerUp = new Rectangle(powerx,powery,powerw,powerh);    
        }
        if(healthw > 0) {
        blackBox(g);
        blackRect = new Rectangle(x2,y2,w2,h2);    
        }
        else if(healthw <= 0) {
        blackRect = new Rectangle(x2-10000,y2,w2,h2);    
        }
        bulletBox = new Rectangle(bx,by,bw,bh);
        collide=collision(g);
        bulletCollide = bulletCollision(g);
        if(fire == false && ammo > 0) {
         g.setColor(Color.blue);
         g.fillRect(bx,by,bw,bh);
           bx = x1+20;
           by = y1+20;
        }
        else if(fire == true && direction == 1 && ammo > 0  && bulletCollide == false) {
         g.setColor(Color.blue);
         g.fillRect(bx,by,bw,bh);
            bx+=5;           
        }
         else if(fire == true && direction == 2 && ammo > 0 && bulletCollide == false) {
         g.setColor(Color.blue);
         g.fillRect(bx,by,bw,bh);
            bx-=5;           
        }
         else if(fire == true && direction == 3 && ammo > 0 && bulletCollide == false) {
         g.setColor(Color.blue);
         g.fillRect(bx,by,bw,bh);
            by-=5;           
        }
         else if(fire == true && direction == 4 && ammo > 0 && bulletCollide == false) {
         g.setColor(Color.blue);
         g.fillRect(bx,by,bw,bh);
            by+=5;           
        }
        if(bx > wide && direction == 1 && ammo > 0 && bulletCollide == false && fire == true) {
              ammo--;
            fire = false;
        }
        else if(bx < 0 && direction == 2 && ammo > 0 && bulletCollide == false && fire == true) {
              ammo--;
            fire = false;
        }
        else if(by < 0 && direction == 3 && ammo > 0 && bulletCollide == false && fire == true) {
               ammo--;
            fire = false;
        }
        else if(by > high && direction == 4 && ammo > 0 && bulletCollide == false && fire == true) {
              ammo--;
            fire = false;
        }
        else if (bulletCollide == true && fire == true) {
            ammo--;
            healthw-=50;
            hit++;
            fire = false;
            bulletCollide = false;
        }
        if(redRect.intersects(powerUp)) {
            powerCollide = 1;
        }
        if(powerCollide == 1) {
            playMusic();
            ammo = 10;
            ammosize = 10;
            powerCollide = 2;
            
        }
        if(powerCollide == 1 || powerCollide == 2) {
        g.fillRect(powerx-1000,powery,powerw,powerh);
        powerUp = new Rectangle(powerx-1000,powery,powerw,powerh);  
        }
        if(reload == true) {
            ammo = ammosize;
            reload = false;
        }
        if(collide == true) {
            x1=150;
            y1=150;
            ammo = 5;
            ammosize = 5;
            powerCollide = 0;
            lives --;
        }
        g.setColor(Color.blue);
        g.drawString(""+left, 400, 500);
        g.drawString("direction "+direction, 350, 300);
        g.drawString("bulletCollide "+bulletCollide, 350, 450);
        g.drawString("powerCollide "+powerCollide, 350, 50);
        g.drawString("wide "+wide, 350, 550);
        if(ammo > 0) {
        g.setColor(Color.blue);
        g.drawString("Ammo "+ammo, 50, 100);    
        }
        else if(ammo == 0) {
        g.setColor(Color.red);
        g.drawString("Ammo "+ammo, 50, 100);    
        }
        if(ammo > 0) {
          g.setColor(Color.red);   
        }
        else if(ammo == 0) {
         g.setColor(Color.blue);   
        }
         g.drawString("Exit: N ", 1200, 600);
         g.setColor(Color.blue);
         g.drawString("Hit "+hit, 1200, 500); 
         g.setColor(Color.black);
         g.drawString("Boss HP: ", 100, 600);
         g.setColor(Color.blue);
         g.drawString("Lives: "+lives,1200,100);
         g.setColor(Color.black);
         g.drawRect(250,575, 251, 50);
         BossHP(g);
if (y2 < high-h2-40 && left == false && healthw > 0) {
    y2+=1;
    blackBox(g);
if(y2 == high-h2-40 && left == false && healthw > 0) {
    left = true;
}
}
else if (y2 > 0 && left == true && healthw > 0) {
    y2-=1;
    blackBox(g);
if(y2 == 0 && left == true && healthw > 0) {
    left = false;
}
}    
         }
         else if (lives == 0) {
         g.setFont(gover);
         g.setColor(Color.black);
         g.drawString("Game Over! ", 300, 100);   
         g.drawString("Want to try again?", 300, 200);  
         g.drawString("Y for Yes, N for No", 300, 300);
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
        if (e.getKeyCode() == e.VK_RIGHT && x1 >= 0 && x1 < wide-100) {          
           if(fire == false || ammo == 0) {
              direction = 1;
           }           
            if (collide)
            {x1 -= 20;
            collide=false;}
            
            else x1 += 10;
            
        }
        if (e.getKeyCode() == e.VK_LEFT && x1 > 0) {
            if(fire == false || ammo == 0) {
           direction = 2;   
           }      
            if (collide)
            {x1 += 20;
            collide=false;}
            
            else x1 -= 10;
            
        }
        if (e.getKeyCode() == e.VK_UP && y1 > 0) {
            if(fire == false || ammo == 0) {
          direction = 3;  
           }      
            if(collide)
            {y1+=20;
            collide=false;}
            
            else  y1 -= 10;
            
        }
        if (e.getKeyCode() == e.VK_DOWN && y1 < high-125) {
            if(fire == false || ammo == 0) {
           direction = 4;  
           }      
            if(collide)
            {y1-=20;
            collide=false;}
            
            else y1 += 10;
            
            
        }
        if (e.getKeyCode() == e.VK_Z) {
          if(fire == false) {
            
          }
            fire = true;
        }
        if (e.getKeyCode() == e.VK_R && ammo == 0) {  
            reload = true;
        }
        if (e.getKeyCode() == e.VK_N && ammo == 0) {  
            System.exit(0);
        }
        if (e.getKeyCode() == e.VK_N && lives == 0) {  
            System.exit(0);
        }
        if (e.getKeyCode() == e.VK_Q && lives > 0) {  
            lives = 0;
        }
        if (e.getKeyCode() == e.VK_Y && lives == 0) { 
            x1=150;
            y1=150;
            ammo = 5;
            ammosize = 5;
            hit = 0;
            healthw = 250;
            powerCollide = 0;  
            lives = 3;
        }

    }
    
    public void redBox(Graphics g)
    
    {
    if(ammo > 0) {
         g.setColor(Color.red);   
    }
    else if(ammo == 0) {
         g.setColor(Color.green);   
    }
    g.fillRect(x1, y1, w, h);
    }
    
    public void blackBox(Graphics g)
    
    {
      if(healthw > 100){
       g.setColor(Color.black);  
    }
      else if(healthw <= 100){
       g.setColor(Color.red);  
    }
    g.fillRect(x2, y2, w2, h2);
    }
    
    public static boolean collision(Graphics g)
    {
    boolean collide=false;    
    if(redRect.intersects(blackRect)){collide=true;}
    return collide;    
    }
public static boolean bulletCollision(Graphics g)
    {
    boolean collide=false;    
    if(bulletBox.intersects(blackRect)){collide=true;}
    return collide;    
    }
public static void BossHP(Graphics g) {
    if(healthw > 100) {
        g.setColor(Color.green);    
    }
    else if(healthw <= 100) {
        g.setColor(Color.red);    
    }
    g.fillRect(healthx, healthy, healthw, healthh);
}
void playMusic() {
       try {
           if(powerCollide == 1) {
               music = "Ok.wav";
           }
            if (powerCollide == 1) {
                File musicPath = new File(music);//creates File object which has path of musicLocation
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
                //for bringing the music from the music file to our Java application (gets that from the musicPath object)
                clip = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
                clip.open(audioInput);//opens music
                clip.start();
                //FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN); //allows for changing the volume of the music
                //gainControl.setValue(-30.0f); // Reduce volume by 30 decibels.﻿
                Thread.sleep(300);//stops thread (that is created by the clip class)
                //from killing its self (and the music) as it immediately starts 
            }
            else {
                JOptionPane.showMessageDialog(null,"The file was not found");//doesn't play if it cant find the file 
            }
        } catch (Exception ex) {
            ex.printStackTrace();// /printStackTrace prints out error message
        }
    }

}//close program

