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

public class Test extends JFrame implements KeyListener, ActionListener {
//opens program

public static int wide = 100;
public static int high = 100;
public static Image Sonic; //Pic is the name
public static int xSonic = 400;//starting position for the image Pic
public static int ySonic = 50;//starting position for the image Pic
public static int wSonic = 110;
public static int hSonic = 165;
public static int wagW = 110;
public static int wagH = 160;
public static int wagAdd = 5;
public static Image Tails; //Pic is the name
public static int xTails = 600;//starting position for the image Pic
public static int yTails = 100;//starting position for the image Pic
public static Image TitleRun;
public static int titlerun = 0;
public static Image Palmtree; //Pic is the name
public static int xPalmtree = 100;//starting position for the image Pic
public static int yPalmtree = 90;//starting position for the image Pic
public static Image TitleTop; //Pic is the name
public static int xTitleTop = 200;//starting position for the image Pic
public static int yTitleTop = 50;//starting position for the image Pic
public static Image TitleBottom; //Pic is the name
public static int xTitleBottom = 267;//starting position for the image Pic
public static int yTitleBottom = 330;//starting position for the image Pic
public static Image Spike; //Pic is the name
public static int xSpike = 250;//starting position for the image Pic
public static int ySpike = 393;//starting position for the image Pic
public static int wSpike = 124;
public static int hSpike = 96;
public static int xSpike2 = 1200;//starting position for the image Pic
public static int ySpike2 = 393;//starting position for the image Pic
public static int spike = 0;
public static int spiketimer = -1;
public static int spikemusic = 0;
public static int notwait = 1;
public static int aniblink = 0;
public static int anijump = 0;
public static int anirun = 0;
public static int aniwag = 0;
public static int waittimer = 0;
public static int gravity = 0;
public static int jumpheight = 0;
public static int jump = 0;
public static int Sw = 20;
public static int Sh = 30;
public static boolean left = false;
public static boolean right = true;
public static boolean duck = false;
public int musicstart = -2;
public int actend = 0;
public int actmusic = 0;
public String filepath = "Memes";
public int Box1X=400;
public static int Box1Y=300;
public int Box1W =300;
public int Box1H =200;
public int Box2X= 700;
public static int Box2Y= 100;
public int Box2W =300;
public int Box2H =500;
public int Box3X= 900;
public static int Box3Y= 350;
public int Box3W =300;
public int Box3H =300;
public int Box4X= 1200;
public static int Box4Y= 400;
public int Box4W =300;
public int Box4H =300;
public static int Box5X = 0;
public static int Box5Y = 600;
public static int Box5W = 300;
public static int Box5H = 300;
public static int test = 0;
public static int Oof;
public static int rightpress = 0;
public static int leftpress = 0;
public static int collisioncheck = 0;
public static boolean collide=false;
public static int change = 0;
public static boolean ground = true;
public static int title = 0;
public static String music;
public static Clip clip;
public static int ring;
public static int score;
public static int lives = 3;
public static int pittrigger = 0;
public static int OofSpikey;
public static int OofSpikex = -1000;


public static Rectangle OofSpike;

public static Rectangle CollisionSonic;
public static Rectangle blackRect;
public static Rectangle Box2;
public static Rectangle Box3;
public static Rectangle Box4;
public static Rectangle Box5;
public static Rectangle SpikeBox;
public static Rectangle SpikeBox2;
/***********************************************************/
    public Test() {//constructor for JPanel
        add(new JP());
        CollisionSonic = new Rectangle(xSonic,ySonic,wSonic,hSonic);
        blackRect = new Rectangle(Box1X,Box1Y,Box1W,Box1H);
        Box2 = new Rectangle(Box2X,Box2Y,Box2W,Box2H);
        Box3 = new Rectangle(Box3X,Box3Y,Box3W,Box3H);
        Box4 = new Rectangle(Box4X,Box4Y,Box4W,Box4H);
        Box5 = new Rectangle(Box5X,Box5Y,Box5W,Box5H);
        SpikeBox = new Rectangle(xSpike,ySpike,wSpike,hSpike);
        OofSpike = new Rectangle(OofSpikex,OofSpikey,wSpike,hSpike);
        SpikeBox2 = new Rectangle(xSpike2,ySpike2,wSpike,hSpike);
    }//close Jpanel Contructor
/***********************************************************/
    public static void main(String[] args) {//start main method

        Test w = new Test();
        w.setTitle("MattWahubTest");
        w.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wide = (int) w.getWidth();//gets the width of the screen
        high = (int) w.getHeight();//gets the height of the screen
        w.setVisible(true);
        w.addKeyListener(w);
        Palmtree = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Palmtree 1.png");
        Spike = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Spike.png");

        
    }//close main
/***********************************************************/
    public class JP extends JPanel {//start JPanel CLass

        public JP() {
            Container c = getContentPane();
            setOpaque(false);//allows for setting a color background in JPanel
            c.setBackground(Color.gray);//background color can be changed
        }

        public void paint(Graphics g) {//opens paint method
            super.paint(g);//allows for painting and repainting
        collisioncheck = 1;
        if(title == 0) {
       TitleScreen(g); 
        titlerun ++;
        if(musicstart == -2) {
        playMusic();
        musicstart = 1;   
        }
        }
        else if (title == 1 && lives > 0) {
        if(pittrigger == 1) {
            pittrigger = 0;
        }
        if(musicstart == -1) {
        playMusic();
        musicstart = 1;
            }
           
        if(musicstart == 0) {
        playMusic();   
        musicstart = 1;
            }
        if(actmusic == 1) {
        actend = 1;
        playMusic();    
        actmusic = 0;
            }
        CollisionSonic = new Rectangle(xSonic,ySonic,wSonic,hSonic);
        if(change == 0) {
        blackBox(g,Box1X, Box1Y);        
        blackRect = new Rectangle(Box1X,Box1Y,Box1W,Box1H);
        Box2(g,Box2X, Box2Y);        
        Box2 = new Rectangle(Box2X,Box2Y,Box2W,Box2H);
        Box3(g,Box3X, Box3Y);        
        Box3 = new Rectangle(Box3X,Box3Y,Box3W,Box3H);  
        Box4(g,Box4X, Box4Y);        
        Box4 = new Rectangle(Box4X,Box4Y,Box4W,Box4H);
        g.fillRect(Box5X,Box5Y,Box5W,Box5H);
        Box5 = new Rectangle(Box5X,Box5Y,Box5W,Box5H);
        OofSpike = new Rectangle(OofSpikex,OofSpikey,wSpike,hSpike);
        SpikeBox = new Rectangle(xSpike,ySpike,wSpike,hSpike);
        SpikeBox2 = new Rectangle(xSpike2+3000,ySpike2,wSpike,hSpike);
        g.drawImage(Spike, xSpike, ySpike, wSpike, hSpike, this); 
        g.drawImage(Spike, xSpike2+3000, ySpike2, wSpike, hSpike, this); 
        }   
        else if (change == 1) {
        blackBox(g,Box1X, Box1Y);        
        blackRect = new Rectangle(Box1X,Box1Y,Box1W,Box1H+5000);
        Box2 = new Rectangle(Box2X-3000,Box2Y-3000,Box2W,Box2H);
        Box3 = new Rectangle(Box3X-300,Box3Y-3000,Box3W,Box3H);
        Box4(g,Box4X-200, Box4Y);        
        Box4 = new Rectangle(Box4X-200,Box4Y,Box4W,Box4H);
        g.fillRect(Box5X-3000,Box5Y,Box5W,Box5H);
        Box5 = new Rectangle(Box5X-3000,Box5Y,Box5W,Box5H);
        OofSpike = new Rectangle(OofSpikex,OofSpikey,wSpike,hSpike);
        SpikeBox = new Rectangle(xSpike+350,ySpike-150,wSpike,hSpike);
        SpikeBox2 = new Rectangle(xSpike2,ySpike2-150,wSpike,hSpike);
        g.drawImage(Spike, xSpike+350, ySpike-150, wSpike, hSpike, this); 
        g.drawImage(Spike, xSpike2, ySpike2-150, wSpike, hSpike, this); 
        }
        else if (change == 2) {        
        blackRect = new Rectangle(Box1X-3000,Box1Y-3000,Box1W-3000,Box1H-3000);
        Box2 = new Rectangle(Box2X-3000,Box2Y-3000,Box2W,Box2H);
        Box3 = new Rectangle(Box3X-3000,Box3Y-3000,Box3W,Box3H);       
        Box4 = new Rectangle(Box4X-3000,Box4Y-3000,Box4W,Box4H);
        Box5 = new Rectangle(Box5X-3000,Box5Y-3000,Box5W,Box5H);
        g.fillRect(Box5X-3000,Box5Y-3000,Box5W,Box5H);
        Box5 = new Rectangle(Box5X-3000,Box5Y-3000,Box5W,Box5H);
        SpikeBox = new Rectangle(xSpike,ySpike,wSpike,hSpike);
        OofSpike = new Rectangle(OofSpikex,OofSpikey,wSpike,hSpike);
        SpikeBox2 = new Rectangle(xSpike2,ySpike2,wSpike,hSpike);
        g.drawImage(Spike, xSpike, ySpike, wSpike, hSpike, this);   
        g.drawImage(Spike, xSpike2, ySpike2, wSpike, hSpike, this);  
        }
        else if (change == 3) {        
        blackRect = new Rectangle(Box1X-3000,Box1Y-3000,Box1W-3000,Box1H-3000);
        Box2 = new Rectangle(Box2X-3000,Box2Y-3000,Box2W,Box2H);
        Box3 = new Rectangle(Box3X-3000,Box3Y-3000,Box3W,Box3H);       
        Box4 = new Rectangle(Box4X-3000,Box4Y-3000,Box4W,Box4H);
        g.fillRect(Box5X,Box5Y,Box5W,Box5H);
        Box5 = new Rectangle(Box5X,Box5Y,Box5W,Box5H);
        SpikeBox = new Rectangle(xSpike-3000,ySpike,wSpike,hSpike);
        OofSpike = new Rectangle(OofSpikex-3000,OofSpikey,wSpike,hSpike);
        SpikeBox2 = new Rectangle(xSpike2-3000,ySpike2,wSpike,hSpike);
        g.drawImage(Spike, xSpike-3000, ySpike, wSpike, hSpike, this);   
        g.drawImage(Spike, xSpike2-3000, ySpike2, wSpike, hSpike, this);  
        }
        collide=collision(g);
         Font font1 = new Font("Comic Sans MS",Font.BOLD,20); //creates a font setting for text on screen
          g.setFont(font1);   
            if(notwait==1 && left == false && right == true && duck == false && jump == 0 && spike == 0) {
                Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Stand 1.png");
            }
            else if(notwait==1 && left == true && right == false && duck == false && jump == 0 && spike == 0) {
                Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Stand 1.png");
            }
            if(waittimer >= 150 && duck == false && jump == 0 && actend == 0 && spike == 0) {
                waittimer = 150;
                notwait = 0;
                if(aniblink <= 2100) {
                Blink(g,aniblink);
                aniblink +=1;
            }
               if(aniblink > 2100 && duck == false && jump == 0) {
                notwait = 0;
                aniblink = 900;    
                }
            }
            waittimer ++;
            if (collide == true && gravity != 0 && collisioncheck == 0)
            {ySonic -= 0;
            collide=false;}
            else {
            if(gravity < 0 && jump ==1 && left == true && duck == false && right == false && collisioncheck == 1) {
                  ySonic-=4;  
                  notwait = 1;
                }
               if(gravity > 0 && gravity <= Math.abs(jumpheight) && jump ==1 && left == true && duck == false && right == false && collisioncheck == 1) {
                  ySonic+=4;
                  notwait = 1;
                }
               if(gravity > 0 && gravity == Math.abs(jumpheight) && jump ==1 && duck == false && collisioncheck == 1) {
                   aniblink = 0;
                   waittimer = 0;
                   notwait = 1;
                   anijump = 0;
                   jump = 0; 
                }
               if(gravity < 0 && jump ==1 && left == false && duck == false && right == true && collisioncheck == 1) {
                  ySonic-=4;  
                  notwait = 1;
                }
               if(gravity >= 0 && gravity <= Math.abs(jumpheight) && jump ==1 && left == false && duck == false && right == true && collisioncheck == 1) {
                  ySonic+=4;
                  notwait = 1;
                }
               if(collide == false) {
                 gravity++; 
               }
                if(gravity > 0 && jump == 0 && ySonic <= 770 && collide == false && spike == 0) {
                    ySonic+=10;
                }
                else if(ySonic > 770 && ySonic != 780 && collide == false) {
                    ySonic = 770;
                }
                if(gravity > 1000) {
                    gravity = 1000;
                }
                if(ySonic == 770 && pittrigger == 0 && lives > 1) {
                    lives--;
                    xSonic = 400;
                    ySonic = 50;
                    spike = 0;
                    pittrigger = 1;
                }
                else if(ySonic == 770 && pittrigger == 0 && lives == 1) {
                    clip.close();
                    lives--;
                    System.exit(0);
                }
                if(collide == true && collisioncheck != 1) {
                    gravity = 0;
                }
                if(jump == 1 && collide == true) {
                   aniblink = 0;
                   waittimer = 0;
                   notwait = 1;
                   anijump = 0;
                   jump = 0; 
                   anirun = 0;
                }
            }
            if(CollisionSonic.intersects(SpikeBox)) {
                if(change == 1) {
                OofSpike = SpikeBox;
                OofSpikey = ySpike-150;
                OofSpikex = xSpike+350;   
                }
                else {
                OofSpike = SpikeBox;
                OofSpikey = ySpike;
                OofSpikex = xSpike;    
                }
                
            }
            else if(CollisionSonic.intersects(SpikeBox2)) {
                if(change == 1) {
                OofSpike = SpikeBox2;
                OofSpikey = ySpike2-150;
                OofSpikex = xSpike2;
                }
                else {
                OofSpike = SpikeBox2;
                OofSpikey = ySpike2;
                OofSpikex = xSpike2;    
                }
            }
            /*if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2)  &&!CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(OofSpike)) {
             Oof = test - ySonic;   
            }*/
            if(CollisionSonic.intersects(Box3)&& CollisionSonic.intersects(Box2)) {
             Oof = test - ySonic;   
            }
            else if(CollisionSonic.intersects(Box3)&& CollisionSonic.intersects(Box4)) {
             Oof = test - ySonic;   
            }
             else if (CollisionSonic.intersects(blackRect) && ySonic+hSonic-50 < test) {
             Oof = (test + ySonic);      
            }
            else if (CollisionSonic.intersects(blackRect) && ySonic+hSonic-50 > test) {
             Oof = (test - ySonic);      
            }
             else if (CollisionSonic.intersects(Box2) && ySonic+hSonic-50 < test) {
             Oof = (test + ySonic);      
            }
            else if (CollisionSonic.intersects(Box2) && ySonic+hSonic-50 > test) {
             Oof = (test - ySonic);      
            }
            else if (CollisionSonic.intersects(Box3) && ySonic+hSonic-50 < test) {
             Oof = (test + ySonic);      
            }
            else if (CollisionSonic.intersects(Box3) && ySonic+hSonic-50 > test) {
             Oof = (test - ySonic);      
            }
            else if (CollisionSonic.intersects(Box4) && ySonic+hSonic-50 < test) {
             Oof = (test + ySonic);      
            }
            else if (CollisionSonic.intersects(Box4) && ySonic+hSonic-50 > test) {
             Oof = (test - ySonic);      
            }
            else if (CollisionSonic.intersects(Box5) && ySonic+hSonic-50 < test) {
             Oof = (test + ySonic);      
            }
            else if (CollisionSonic.intersects(Box5) && ySonic+hSonic-50 > test) {
             Oof = (test - ySonic);      
            }
            else if (CollisionSonic.intersects(OofSpike) && ySonic+hSonic-50 < test && ground == true) {
             Oof = (test + ySonic);      
            }
            else if (CollisionSonic.intersects(OofSpike) && ySonic+hSonic-50 > test && ground == true) {
             Oof = (test - ySonic);      
            }
            else if (CollisionSonic.intersects(OofSpike) && ySonic-hSonic+50 < OofSpikey && ground == false && right == true && left == false) {
                 spike = 1;
                 /*if(spikemusic == 0) {
                   playMusic(); 
                   spikemusic = 1;
                 }*/
                 gravity = 0;
                 spiketimer = 0;
             }
            else if (CollisionSonic.intersects(OofSpike) && ySonic-hSonic+50 < OofSpikey && ground == false && right == false && left == true) {
                 spike = 1;
                 /*if(spikemusic == 0) {
                   playMusic(); 
                   spikemusic = 1;
                 }*/
                 gravity = 0;
                 spiketimer = 0;
             }

            if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(Box5) && ySonic != 780 && spike == 0) {
                ground = false;
            }
            else if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box5) && ySonic == 780) {
                spike = 0;
                ground = true;
            }
            else if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box5) && ySonic == 770 && spike == 1) {
                spike = 0;
                ground = true;
            }
            else if(CollisionSonic.intersects(blackRect)&& ySonic < Oof) {
               spike = 0;
               ground = true;
            }
            else if(CollisionSonic.intersects(Box2)&& ySonic < Oof) {
                spike = 0;
                ground = true;
            }
            else if(CollisionSonic.intersects(Box3)&& ySonic < Oof) {
                spike = 0;
                ground = true;
            }           
             else if(CollisionSonic.intersects(Box4)&& ySonic < Oof) {
                spike = 0;
                ground = true;
            }
             else if(CollisionSonic.intersects(Box5)&& ySonic < Oof) {
               spike = 0;
               ground = true;
            }
            if(spiketimer > -1 && spiketimer < 1000 && spike == 1) {
                spiketimer ++;
            }
            if(spike == 1 && ground == false && right == true && left == false && ySonic < 770 && collide == false && spiketimer < 1000) {
                xSonic -=1;
                if(spiketimer > -1 && spiketimer < 40) {
                ySonic -= 3;   
                }
                else if (spiketimer > 40 && spiketimer < 1000) {
                ySonic += 5;       
                }
            }
            else if(spike == 1 && ground == false && right == false && left == true && ySonic < 770 && collide == false && spiketimer < 1000) {
                xSonic +=1;
                if(spiketimer > -1 && spiketimer < 40) {
                ySonic -= 3;   
                }
                else if (spiketimer > 40 && spiketimer < 1000) {
                ySonic += 5;       
                }
            }
            if(ground == true && spike == 1) {
                spike = 0;
            }
            if (CollisionSonic.intersects(blackRect) && spike == 1 && left == true || CollisionSonic.intersects(Box2) && spike == 1 && left == true|| CollisionSonic.intersects(Box3) && spike == 1 && left == true|| CollisionSonic.intersects(Box4) && spike == 1 && left == true || CollisionSonic.intersects(Box5) && spike == 1 && left == true)
            {xSonic -= 25;
            collide=false;}
            else if (CollisionSonic.intersects(blackRect) && spike == 1 && right == true || CollisionSonic.intersects(Box2) && spike == 1 && right == true || CollisionSonic.intersects(Box3) && spike == 1 && right == true || CollisionSonic.intersects(Box4) && spike == 1 && right == true || CollisionSonic.intersects(Box5) && spike == 1 && right == true)
            {xSonic += 25;
            collide=false;}
            if(spike == 0) {
                spiketimer = -1;
                spikemusic = 0;
                OofSpikex = -1000;
                OofSpikey = 0;
            }

               g.setColor(Color.black); 
               //g.fillRect(0,490,1900,500);
               g.setColor(Color.red);
               g.fillRect(xSonic,ySonic,wSonic,hSonic);
               g.setColor(Color.green);
               g.fillRect(OofSpikex,OofSpikey,wSpike,hSpike);
               g.drawImage(Palmtree, xPalmtree, yPalmtree, 200, 400, this);   
               g.drawImage(Palmtree, xPalmtree+1150, yPalmtree-91, 200, 400, this);   
               g.setColor(Color.white);
               g.drawString("gravity"+gravity,500,400);
               g.drawString("jumpheight"+jumpheight,700,400);
               g.drawString("jump"+jump,875,400);
               g.drawString("aniblink"+aniblink,500, 740);
               g.drawString("waittimer"+waittimer,700, 740);
               g.drawString("notwait"+notwait,850, 740);
               g.drawString("left "+left,950, 400);
               g.drawString("right "+right,950, 740);
               g.drawString("duck "+duck,1100, 740);
               g.drawString("anijump "+anijump,1100, 400);
               g.drawString("collide "+collide,1250, 100);
               g.drawString("collisioncheck "+collisioncheck,100, 100);
               g.drawString("ySonic "+ySonic,1350, 400);
               g.drawString("xSonic "+xSonic,1350, 200);
               g.drawString("Test "+test,1000, 50);
               g.drawString("Oof "+Oof,400, 50);
               g.drawString("Change "+change,200, 50);
               g.drawString("rightpress "+rightpress,600, 50);
               g.drawString("leftpress "+leftpress,850, 50);
               g.drawString("ground "+ground,600, 150);
               g.drawString("anirun "+anirun,400, 150);
               g.drawString("aniwag "+aniwag,200, 150);
               g.drawString("spike "+spike,100, 150);
               g.drawString("spiketimer "+spiketimer,50, 50);
               g.drawString("globalSpikeY "+OofSpikey,50, 300);
               g.drawString("SpikeBox "+SpikeBox,50, 500);
               g.drawString("OofSpike "+OofSpike,50, 550);
               g.drawString("Lives: "+lives,25, 750);
               g.drawString("ySonic+hSonic = "+(ySonic+hSonic),25, 200);
               g.setColor(Color.red);
               g.fillRect(0,ySonic+hSonic,2000,1);
               g.setColor(Color.blue);
               g.fillRect(0,Oof,2000,1);
               g.setColor(Color.green);
               g.fillRect(0,test,2000,1);
            if (duck == true && spike == 0) {
                Duck(g);
            }
            if (jump == 1 && spike == 0) {
                waittimer = 0;
                Jump(g,anijump);
                anijump++;
            }     
            if ((rightpress == 1 && jump == 0 && duck == false && spike == 0) || (leftpress == 1 && jump == 0 && duck == false && spike == 0) ){
                Run(g);
                anirun++;
               if(anirun > 60) {
                   anirun = 0;
               }
            }
            if(actend == 1 && ground == true && spike == 0) {
                notwait = 1;
                aniblink = 0;
                waittimer = 0;
                duck = false;      
                Wag(g);
                aniwag++;  
                if(aniwag > 200) {
                aniwag = 0;     
                 }            
            }
            if(spike == 1) {
                Hit(g);
            }
            if(rightpress == 1 && spike == 0) {
            collisioncheck = 1;
            waittimer = 0;
            leftpress = 0;
            notwait = 1;
            aniblink = 0;
            if(duck == false) {
            right = true;
            left = false;  
            }
            if (collide && ySonic > (Oof) && spike == 0)
            {xSonic -= 25;
            collide=false;}
            if (duck == true) {
             xSonic-=0;      
           }
            else{
             xSonic+=4;      
           }          
            }
           else if (leftpress == 1 && spike == 0) {
            waittimer = 0;
            notwait = 1;
            aniblink = 0;
            rightpress = 0;
            if(duck == false) {
            right = false;
            left = true;   
            }
            if (collide && ySonic > (Oof) && spike == 0)
            {xSonic += 25;
            collide=false;}
            if (duck == true) {
             xSonic-=0;      
           }
            else{
             xSonic-=4;      
           }          
            }
            if(duck == false && anijump == 0 && rightpress == 0 && leftpress == 0 && actend == 0 && spike == 0) {
               g.drawImage(Sonic, xSonic, ySonic, 110, 160, this);    
            }     
        }
        
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
public void TitleScreen(Graphics g) {
       TitleTop = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic 2 Title Sprite Top.png");
       TitleBottom = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic 2 Title Sprite Base Custom.png");
       Tails = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Tails Celebrate 1.png");
        g.drawImage(TitleTop, xTitleTop, yTitleTop, 1024, 280, this);  
        g.drawImage(Tails, xTails, yTails, 319, 297, this);  
        xSonic = 425;
        ySonic = 110;
        wagW = 220;
        wagH = 320;
        wagAdd = 5;
        Wag(g);
        aniwag++;  
        if(aniwag > 200) {
        aniwag = 0;     
                 }
    if(titlerun >= 0 && titlerun <= 15) {
        TitleRun = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Run 1.png");
        g.drawImage(TitleRun, 700, 600, 130, 160, this);
    }
    else if(titlerun > 15 && titlerun <= 30) {
        TitleRun = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Run 2.png");
        g.drawImage(TitleRun, 700, 600, 130, 160, this);
    }
    else if(titlerun > 30 && titlerun <= 45) {
        TitleRun = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Run 3.png");
        g.drawImage(TitleRun, 700, 600, 131, 160, this);
    }
    else if(titlerun > 45 && titlerun <= 60) {
        TitleRun = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Run 4.png");
        g.drawImage(TitleRun, 700, 600, 130, 160, this);
    }
        if(titlerun > 60) {
            titlerun = 0;
        }
        g.drawString("titlerun "+titlerun,25, 700);
        g.drawImage(TitleBottom, xTitleBottom, yTitleBottom, 888, 300, this);   
        
}
public void Hit(Graphics g) {
    if(duck == false && left == false && right == true && jump == 0 && spike == 1) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Hit.png"); 
        g.drawImage(Sonic, xSonic, ySonic+60, 160, 120, this);
    }
    if(duck == false && left == true && right == false && jump == 0 && spike == 1) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Hit.png");
        g.drawImage(Sonic, xSonic, ySonic+60, 160, 120, this);
    }
}
public void Wag(Graphics g) {
    if(duck == false && left == false && right == true && jump == 0 && aniwag > 0 && aniwag < 100) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Wag 1.png");
        g.drawImage(Sonic, xSonic, ySonic, wagW, wagH, this);    
    }
    else if(duck == false && left == false && right == true && jump == 0 && aniwag >= 100 && aniwag <= 200) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Wag 2.png");
        g.drawImage(Sonic, xSonic-5, ySonic, wagW+wagAdd, wagH, this);
    }
    if(duck == false && left == true && right == false && jump == 0 && aniwag > 0 && aniwag < 100) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Wag 1.png");
        g.drawImage(Sonic, xSonic, ySonic, wagW, wagH, this);    
    }
    else if(duck == false && left == true && right == false && jump == 0 && aniwag >= 100 && aniwag <= 200) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Wag 2.png");
        g.drawImage(Sonic, xSonic, ySonic, wagW+wagAdd, wagH, this);
    }
}
public void Run(Graphics g) {
    if(duck == false && left == false && right == true && jump == 0 && leftpress == 0 && rightpress == 1 && anirun <= 15) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Run 1.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == false && right == true && jump == 0 && leftpress == 0 && rightpress == 1 && anirun > 15 && anirun <= 30) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Run 2.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == false && right == true && jump == 0 && rightpress == 1 && leftpress == 0 && anirun > 30 && anirun <= 45) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Run 3.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == false && right == true && jump == 0 && rightpress == 1 && leftpress == 0 && anirun > 45 && anirun <= 60) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Run 4.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    if(duck == false && left == true && right == false && jump == 0 && leftpress == 1 && rightpress == 0 && anirun <= 15) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Run 1.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == true && right == false && jump == 0 && leftpress == 1 && rightpress == 0 && anirun > 15 && anirun <= 30) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Run 2.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == true && right == false && jump == 0 && leftpress == 1 && rightpress == 0 && anirun > 30 && anirun <= 45) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Run 3.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == true && right == false && jump == 0 && leftpress == 1 && rightpress == 0 && anirun > 45 && anirun <= 60) {
        Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Run 4.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
}
public void Duck(Graphics g) {
    if(duck == true && left == false && right == true) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Duck 1.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    if(duck == true && left == true && right == false) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Duck 1.png");
         g.drawImage(Sonic, xSonic-12, ySonic+60, 120, 100, this);
    }
}
public void Jump(Graphics g, int anijump) {
    if(duck == false && left == false && right == true && anijump%10 == 0) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 1.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 1) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 2.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 2) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 3.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 3) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 4.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 4) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 5.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 5) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 1.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 6) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 2.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 7) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 3.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 8) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 4.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 9) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Jump 5.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    if(duck == false && left == true && right == false && anijump%10 == 0) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 1.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 1) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 2.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 2) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 3.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 3) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 4.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 4) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 5.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 5) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 1.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 6) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 2.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 7) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 3.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 8) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 4.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 9) {
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Jump 5.png");
         g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
}
public void Blink(Graphics g, int aniblink) {
    if (right == true && left == false && duck == false){
     if (aniblink == 800){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Stand 2.png");
       }
        else if (aniblink == 850){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Stand 3.png");
       }
        else if (aniblink%100 == 0 && aniblink  >= 900 && aniblink < 2000){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Stand 4.png");
       }
        else if (aniblink%100 == 50 && aniblink  >= 900 && aniblink < 2000){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Stand 5.png");
       }   
      else if (aniblink >= 2000 && aniblink < 2100){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\Neo Sonic Wrist 1.png");
       }
    }
    if (right == false && left == true && duck == false){
     if (aniblink == 800){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Stand 2.png");
       }
        else if (aniblink == 850){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Stand 3.png");
       }
        else if (aniblink%100 == 0 && aniblink  >= 900 && aniblink < 2000){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Stand 4.png");
       }
        else if (aniblink%100 == 50 && aniblink  >= 900 && aniblink < 2000){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Stand 5.png");
       }   
       else if (aniblink >= 2000 && aniblink < 2100){
         Sonic = Toolkit.getDefaultToolkit().getImage("C:\\Users\\mattj\\Pictures\\Saved Pictures\\LNeo Sonic Wrist 1.png");
       }
    }     
}
public static boolean collision(Graphics g)
    {
    boolean collide=false;    
    if(CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3)&& !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(SpikeBox)&& !CollisionSonic.intersects(Box5)) {
         test = Box1Y;
         collide=true;         
    }  
    else if(CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box3)&& !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(SpikeBox)&& !CollisionSonic.intersects(Box5)) {
        test = Box2Y;
         collide=true;         
    }  
    else if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(SpikeBox)&& !CollisionSonic.intersects(Box5)) {
        test = Box3Y;
         collide=true;         
    }
    else if(CollisionSonic.intersects(blackRect) && CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(SpikeBox)&& !CollisionSonic.intersects(Box5)) {
         test = Box2Y;
         collide=true;         
    }
    else if(!CollisionSonic.intersects(blackRect) && CollisionSonic.intersects(Box2) && CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(SpikeBox)&& !CollisionSonic.intersects(Box5)) {
         test = Box3Y;
         collide=true;         
    }
    else if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(SpikeBox) && !CollisionSonic.intersects(Box5)) {
         test = Box4Y;
         collide=true;         
    }
    else if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && CollisionSonic.intersects(Box3) && CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(SpikeBox) && !CollisionSonic.intersects(Box5)) {
         test = Box4Y;
         collide=true;         
    }
    else if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3)&& !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(SpikeBox) && CollisionSonic.intersects(Box5)) {
         test = Box5Y;
         collide=true;         
    }  
    else if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && CollisionSonic.intersects(SpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(SpikeBox2) && spike == 0 && ySonic-hSonic+50 < ySpike) {
         collide=true;
    }
    else if(!CollisionSonic.intersects(blackRect) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(SpikeBox) && !CollisionSonic.intersects(Box5) && CollisionSonic.intersects(SpikeBox2) && spike == 0 && ySonic-hSonic+50 < ySpike2) {
         collide=true;
    }
    return collide;    
    }

public void blackBox(Graphics g, int x, int y)
    
    {
        if(change == 1) {
    g.setColor(Color.black);
    g.fillRect(Box1X, Box1Y, Box1W, Box1H+5000);   
        }
        else {
    g.setColor(Color.black);
    g.fillRect(Box1X, Box1Y, Box1W, Box1H);  
        }
    }
public void Box2(Graphics g, int x, int y)
    
    {
    g.setColor(Color.black);
    g.fillRect(Box2X, Box2Y, Box2W, Box2H);
    }
public void Box3(Graphics g, int x, int y)
    
    {
    g.setColor(Color.black);
    g.fillRect(Box3X, Box3Y, Box3W, Box3H);
    }
public void Box4(Graphics g, int x, int y)
    
    {
    g.setColor(Color.black);   
    if(change == 1) {
      g.fillRect(Box4X-200, Box4Y, Box4W, Box4H);  
    }
    else{
       g.fillRect(Box4X, Box4Y, Box4W, Box4H);
    }
    }

    public void actionPerformed(ActionEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
      if (e.getKeyCode() == e.VK_DOWN && jump == 0) {        
         notwait = 1;
         aniblink = 0;
         waittimer = 0;
         duck = false;        
      }
      if (e.getKeyCode() == e.VK_RIGHT && jump == 0) {        
         rightpress = 0;
         anirun = 0;
      }
       if (e.getKeyCode() == e.VK_RIGHT && jump == 1) {        
         rightpress = 0;
         anirun = 0;
      }
      if (e.getKeyCode() == e.VK_LEFT && jump == 0) {        
         leftpress = 0;
         anirun = 0;
      }
        if (e.getKeyCode() == e.VK_LEFT && jump == 1) {        
         leftpress = 0;
         anirun = 0;
      }
    }
      
    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_RIGHT && actend == 0 && spike == 0) {
            rightpress=1;
            leftpress = 0;
        }
        if (e.getKeyCode() == e.VK_LEFT && actend == 0 && spike == 0) {    
            leftpress = 1;  
            rightpress = 0;
        }
           
        if (e.getKeyCode() == e.VK_UP && actend == 0 && spike == 0) {
             ySonic-=100;
        }
        if (e.getKeyCode() == e.VK_DOWN && jump == 0 && actend == 0 && spike == 0) {
             duck = true;
        }
        if (e.getKeyCode() == e.VK_Z ) {
            collisioncheck = 1;
            if (collide)
            {ySonic -= 20;
            collide=false;}
            if(jump==0 && duck == false && ground == true && actend == 0 && spike ==  0){
            gravity = -30;
            jumpheight = -30;
            jump = 1; 
            }

        }
          if (e.getKeyCode() == e.VK_X ) {
            collisioncheck = 1;
            if (collide)
            {ySonic -= 20;
            collide=false;}
            if(jump==0 && duck == false && ground == true && actend == 0 && spike == 0){
            gravity = -55;
            jumpheight = -55;
            jump = 1; 
            }
          }
          if (e.getKeyCode() == e.VK_C) {
              aniwag = 0;
              change = 0;
              musicstart = -1;
              actend = 0;
            }
          if (e.getKeyCode() == e.VK_V) {
              aniwag = 0;
              change = 1;
              musicstart = 0;
              actend = 0;
            }
          if (e.getKeyCode() == e.VK_B) {
              change = 2;
            }      
          if (e.getKeyCode() == e.VK_N) {
              aniwag = 0;
              actmusic = 1;
            }  
          if (e.getKeyCode() == e.VK_M) {
              change = 3;
            }  
          if (e.getKeyCode() == e.VK_ENTER && title == 0) {
              title = 1;
              musicstart = -1;
            }    
    }//end keypressed
    void playMusic() {
        if(musicstart == -2 && actend == 0 && spike == 0) {
            music = "Title Screen.wav";
        }
        else if(musicstart == -1 && actend == 0) {
           music = "Green Grove Zone.wav";
        }
        else if(musicstart == 0 && actend == 0) {
           music = "Open Your Heart Crush 40 vs BJ.wav";
        }
        /*else if(spike == 1 && actend == 0) {
           music = "Extra Life Sound.wav";
        }*/
        else if(actend == 1) {
           music = "Act Clear SPA.wav";
        }
        try {
            if (musicstart == -2 && actend == 0) {
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
            else if (musicstart == -1 && actend == 0) {
                File musicPath = new File(music);//creates File object which has path of musicLocation
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
                //for bringing the music from the music file to our Java application (gets that from the musicPath object)
                clip = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
                clip.open(audioInput);//opens music
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);//loops the file continuously forever
                //FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN); //allows for changing the volume of the music
                //gainControl.setValue(-30.0f); // Reduce volume by 30 decibels.﻿
                Thread.sleep(300);//stops thread (that is created by the clip class)
                //from killing its self (and the music) as it immediately starts 
            }
            else if (musicstart == 0 && actend == 0) {
                clip.close();
                File musicPath = new File(music);//creates File object which has path of musicLocation
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
                //for bringing the music from the music file to our Java application (gets that from the musicPath object)
                clip = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
                clip.open(audioInput);//opens music
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);//loops the file continuously forever
                FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN); //allows for changing the volume of the music
                //gainControl.setValue(-30.0f); // Reduce volume by 30 decibels.﻿
                Thread.sleep(300);//stops thread (that is created by the clip class)
                //from killing its self (and the music) as it immediately starts 
            }
            /*else if(spike == 1) {
                File musicPath = new File(music);//creates File object which has path of musicLocation
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
                //for bringing the music from the music file to our Java application (gets that from the musicPath object)
                clip = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
                clip.open(audioInput);//opens music
                clip.start();
                //FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN); //allows for changing the volume of the music
                //gainControl.setValue(-30.0f); // Reduce volume by 30 decibels.﻿
                Thread.sleep(300);//stops thread (that is created by the clip class)
                spikemusic = 1;
            }*/
            else if(actend == 1) {
                clip.close();
                File musicPath = new File(music);//creates File object which has path of musicLocation
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
                //for bringing the music from the music file to our Java application (gets that from the musicPath object)
                clip = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
                clip.open(audioInput);//opens music
                clip.start();
                Thread.sleep(300);//stops thread (that is created by the clip class)
            }
            else {
                JOptionPane.showMessageDialog(null,"The file was not found");//doesn't play if it cant find the file 
            }
        } catch (Exception ex) {
            ex.printStackTrace();// /printStackTrace prints out error message
        }
    }
/***********************************************************/
    
}//close program


