//6/11/19
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
import java.util.ArrayList;

public class J2FinalProject extends JFrame implements KeyListener, ActionListener {
//opens program
//here is all of the variables that I used (mainly consists of Images and ints)
//Startup variables
public static int starttimer = 0;
public static int colorswitch = 0;
public static Image Logo;
public static int xLogo = 225;
public static int yLogo = 200;
public static int wLogo = 1024;
public static int hLogo = 280;
public static Image TSonic;
public static int xTSonic = -200;
public static int yTSonic = 300;
public static int wTSonic;
public static int hTSonic;
public static Image ImageColor;
public static int Tanirun = 0;
public static int Taniledge = 0;
public static int Taniwait = 0;
public static int Tanicombo = 0;
public static int Tanilean = 0;
public static int Tanicolor = 0;
public static int startsound  = 0;
public static boolean Tright = true;
public static boolean Tleft = false;

//Title Screen Variables
public static Image Tails; 
public static int xTails = 600;
public static int yTails = 100;
public static Image TitleRun;
public static int titlerun = 0;
public static Image Palmtree; 
public static int xPalmtree = 100;
public static int yPalmtree = 200;
public static Image TitleTop; 
public static int xTitleTop = 200;
public static int yTitleTop = 50;
public static Image TitleBottom; 
public static int xTitleBottom = 267;
public static int yTitleBottom = 330;
public static Image Ground;
public static int xGround = 0;
public static int yGround = 760;
public static int wGround = 580;
public static int hGround = 260;
public static int Groundtimer = 0;
public static int xTTree = 200;
public static int tailsstart = 0;
public static int tailsdelay = 0;
public static Image TBackground;
public static Image Copyright;

//Continue Screen Variables
public static Image CSonic;
public static Image ContinuePic;
public static Image Hand;
public static Image Yes;
public static Image No;
public static int xCSonic = 650;
public static int yCSonic = 0;
public static int wCSonic = 130;
public static int hCSonic = 160;
public static int continueCutsceneTimer;
public static int continueSelect = 0;
public static int continueOptionTimer = 11000;
public static int Canispin;
public static int Canicontinue;
public static int Canirun;
public static int CaniRunChange = 1;
public static int xHand = -100;
public static int yHand = 100;

//Gameplay
public static int wide = 100;
public static int high = 100;
public static Image Sonic; 
public static int xSonic = 0;
public static int ySonic = 430;
public static int wSonic = 110;
public static int hSonic = 165;
public static boolean collide = false;
public static boolean ground = true;
public static boolean left = false;
public static boolean right = true;
public static boolean duck = false;
public static int duckcheck = -2;
public static int rightpress = 0;
public static int leftpress = 0;
public static int xpress = 0;
public static int collisioncheck = 0;
public static int waittimer = 0;
public static int gravity = 0;
public static int jumpheight = 0;
public static int jump = 0;
public static int ringsCollected;
public static int score = 0;
public static int lives = 3;
public static int pittrigger = 0;
public static int actend = 0;
public static int spike = 0;
public static int spiketimer = -1;
public static int spikeinvince = 0;
public static int notwait = 1;
public static int spring = 0;
public static int springtimer = 0;
public static boolean goalPostHit = false;
public static int goalPostTimer = 0;
public static int actFadeTimer = 0;
public static int secondTimer = 0;
public static int minuteTimer = 0;
public static int timeScore = 0;

//Animation
public static int wagW = 110;
public static int wagH = 160;
public static int wagAdd = 5;
public static int wagstart = 0;
public static int aniblink = 0;
public static int anijump = 0;
public static int anirun = 0;
public static int aniwag = 0;

//Images and their associated variables
public static Image Spike;
public static Image Spring;
public static Image HGMMonitor;
public static Image ringPic;
public static Image HUD;
public static Image LivesHUD;
public static Image H;
public static Image S;
public static Image RingMonitor;
public static Image ShotMonitor;
public static Image HMGBullet;
public static Image ShotGunBullet;
public static Image Crabnik;
public static Image Result1;
public static Image Result2;
public static Image Act1;
public static Image ResultsHUD;
public static Image GoalPost;
public static Image BlackFade;
public static Image Cloud;

//Box variables
public int xBox1 = 400;
public static int yBox1 = 300;
public int wBox1 = 300;
public int hBox1 = 200;
public int xBox2 = 700;
public static int yBox2 = 100;
public int wBox2 = 300;
public int hBox2 = 500;
public int xBox3 = 900;
public static int yBox3 = 350;
public int wBox3 = 300;
public int hBox3 = 300;
public int xBox4 = 1200;
public static int yBox4 = 400;
public int wBox4 = 300;
public int hBox4 = 300;
public static int xBox5 = 0;
public static int yBox5 = 600;
public static int wBox5 = 300;
public static int hBox5 = 300;
//Spike variables
public static int wSpike = 124;
public static int hSpike = 96;
//Spring variables
public static int xSpring = 100;
public static int ySpring = 400;
public static int wSpring = 76;
public static int hSpring = 48;
//Ringbox and its variables
public static int wMon = 80;
public static int hMon = 95;
public static int boxSound = 0;

//Plat variables
public static int xPlat1 = 500;
public static int yPlat1 = 400;
public static int wPlat1 = 500;
public static int hPlat1  = 10;
public static int xPlat2 = 500;
public static int yPlat2 = 100;
public static int wPlat2 = 500;
public static int hPlat2  = 10;
public static int xGoalPostBox = 600;
public static int yGoalPostBox = 450;
public static int test = 0;
public static int Oof;
//Global Rectangle variables
public static int xGlobalSpikeBox = -1000;
public static int yGlobalSpikeBox = -1000;
public static int xGlobalEnemyBox = -1000;
public static int yGlobalEnemyBox = -1000;
public static int xGlobalSpringBox = -1000;
public static int yGlobalSpringBox;
public static int xGlobalHMGMon = -1000;
public static int yGlobalHMGMon = 0;
public static int xGlobalShotMon = -1000;
public static int yGlobalShotMon = 0;
public static int xGlobalRingMon = 0;
public static int yGlobalRingMon = 0;
public static int xGlobalPlat = -1000;
public static int yGlobalPlat = -1000;
public static int wGlobalPlat;
public static int hGlobalPlat;


//Weapon
public static int powerUp = 0;
public static int BulletDelay = 0;
public static boolean BulletCollide = false;
public static int BulletDirection = 0;
public static int ammo = 0;

public static int EnemyBulletDelay = 0;
//Music
public int musicstart = -2;
public int actmusic = -1;
public int totalmusic = -1;
public static int spikemusic = 0;
public static int continuemusic = -1;
public String filepath = "Memes";
public static String music;
public static Clip clip;
public static Clip boxEffect;

//Extras
public static int change = 0;
public static int title = -1;
public static int debug = 0;
public static int setHMGMon = 0;
public static int setShotMon = 0;
public static int setRingMon = 0;
public static int setRing = 0;
public static int setSpring = 0;
public static int setSpike = 0;
public static int setEnemy = 0;
public static int setEnemyBullet = 0;

//This is where I keep my global rectangles for spikes and springs (this is so I dont have to check if Sonic is colliding with Spring1, Spring2, etc)
//I set the xvalue, yvalue, and Rectangle for each of these spikes and springs later in the code
//I can just set CollisionSonic.intersects(GlobalSpikeBox) for example to check if Player is colliding with a spike
public static Rectangle GlobalSpikeBox;
public static Rectangle GlobalEnemyBox;
public static Rectangle GlobalSpringBox;
public static Rectangle GlobalHMGMon;
public static Rectangle GlobalShotMon;
public static Rectangle GlobalRingMon;
public static Rectangle GlobalPlat;
//All of the rectangles that I used
public static Rectangle CollisionSonic;
public static Rectangle Box1;
public static Rectangle Box2;
public static Rectangle Box3;
public static Rectangle Box4;
public static Rectangle Box5;
public static Rectangle Plat1;
public static Rectangle Plat2;
public static Rectangle GoalPostBox;

//All of the ArrayLists that I used
public static ArrayList <Rectangle> Bullet = new ArrayList<Rectangle>();
public static ArrayList <Integer> BulletX = new ArrayList<Integer> ();
public static ArrayList <Integer> BulletY = new ArrayList<Integer>();
public static ArrayList <Rectangle> HMGMon = new ArrayList<Rectangle>();
public static ArrayList <Integer> xHMGMon = new ArrayList<Integer> ();
public static ArrayList <Integer> yHMGMon = new ArrayList<Integer>();
public static ArrayList <Rectangle> ShotMon = new ArrayList<Rectangle>();
public static ArrayList <Integer> xShotMon = new ArrayList<Integer> ();
public static ArrayList <Integer> yShotMon = new ArrayList<Integer>();
public static ArrayList <Rectangle> RingMon = new ArrayList<Rectangle>();
public static ArrayList <Integer> xRingMon = new ArrayList<Integer> ();
public static ArrayList <Integer> yRingMon = new ArrayList<Integer>();
public static ArrayList <Integer> BulletDir = new ArrayList<Integer>();
public static ArrayList <Rectangle> SpringBox = new ArrayList<Rectangle>();
public static ArrayList <Integer> xSpringBox = new ArrayList<Integer>();
public static ArrayList <Integer> ySpringBox = new ArrayList<Integer>();
public static ArrayList <Rectangle> SpikeBox = new ArrayList<Rectangle>();
public static ArrayList <Integer> xSpikeBox = new ArrayList<Integer>();
public static ArrayList <Integer> ySpikeBox = new ArrayList<Integer>();
public static ArrayList <Rectangle> EnemyBox = new ArrayList<Rectangle>();
public static ArrayList <Integer> xEnemyBox = new ArrayList<Integer>();
public static ArrayList <Integer> yEnemyBox = new ArrayList<Integer>();
public static ArrayList <Rectangle> EnemyBullet = new ArrayList<Rectangle>();
public static ArrayList <Integer> xEnemyBullet = new ArrayList<Integer>();
public static ArrayList <Integer> yEnemyBullet = new ArrayList<Integer>();
public static ArrayList <Rectangle> Rings = new ArrayList<Rectangle>();

/***********************************************************/
    public J2FinalProject() {//constructor for JPanel
        add(new JP());
        //creates the Rectangles the first time (so they can exist)
        CollisionSonic = new Rectangle(xSonic,ySonic,wSonic,hSonic);
        Box1 = new Rectangle(xBox1,yBox1,wBox1,hBox1);
        Box2 = new Rectangle(xBox2,yBox2,wBox2,hBox2);
        Box3 = new Rectangle(xBox3,yBox3,wBox3,hBox3);
        Box4 = new Rectangle(xBox4,yBox4,wBox4,hBox4);
        Box5 = new Rectangle(xBox5,yBox5,wBox5,hBox5);
        GlobalSpikeBox = new Rectangle(xGlobalSpikeBox,yGlobalSpikeBox,wSpike,hSpike);
        GlobalEnemyBox = new Rectangle(xGlobalEnemyBox,yGlobalEnemyBox,wMon,hMon);
        GlobalSpringBox = new Rectangle(xGlobalSpringBox,yGlobalSpringBox,wSpring,hSpring);
        GlobalHMGMon = new Rectangle(xGlobalHMGMon, yGlobalHMGMon, wMon, hMon);
        GlobalShotMon = new Rectangle(xGlobalShotMon, yGlobalShotMon, wMon, hMon);
        GlobalRingMon = new Rectangle(xGlobalRingMon,yGlobalRingMon,wMon,hMon);
        Plat1 = new Rectangle(xPlat1,yPlat1,wPlat1,hPlat1);
        Plat2 = new Rectangle(xPlat2,yPlat2,wPlat2,hPlat2);
        GoalPostBox = new Rectangle(xGoalPostBox,yGoalPostBox,192,144);
        GlobalPlat = new Rectangle(xGlobalPlat,yGlobalPlat,wGlobalPlat,hGlobalPlat);


        
    }//close Jpanel Contructor
/***********************************************************/
    public static void main(String[] args) {//start main method
    
        J2FinalProject w = new J2FinalProject();
        w.setTitle("Sonic the Hedgehog");
        w.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wide = (int) w.getWidth();//gets the width of the screen
        high = (int) w.getHeight();//gets the height of the screen
        w.setVisible(true);
        w.addKeyListener(w);
        //Sets the images for each of these sprites (that dont change)
        Logo = Toolkit.getDefaultToolkit().getImage("src\\resources\\NeoGeo Pocket Color Logo.png");
        Palmtree = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Palmtree 1.png");
        Spike = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Spike.png");
        Spring = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Spring 1.png");
        HGMMonitor = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo HMG Box.png");
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 1.png");
        TBackground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Background 1.png");
        Copyright = Toolkit.getDefaultToolkit().getImage("src\\resources\\Copyright.png");
        HUD = Toolkit.getDefaultToolkit().getImage("src\\resources\\HUD.png");
        LivesHUD = Toolkit.getDefaultToolkit().getImage("src\\resources\\Lives HUD.png");
        H = Toolkit.getDefaultToolkit().getImage("src\\resources\\H.png");
        S = Toolkit.getDefaultToolkit().getImage("src\\resources\\S.png");
        ringPic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Ring.gif");
        RingMonitor = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Ring Box.png");
        ShotMonitor = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo ShotGun Box.png");
        HMGBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\HMGBullet.png");
        ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 1.png");
        Hand = Toolkit.getDefaultToolkit().getImage("src\\resources\\Hand.png");
        Yes = Toolkit.getDefaultToolkit().getImage("src\\resources\\YforYes.png");
        No = Toolkit.getDefaultToolkit().getImage("src\\resources\\NforNo.png");
        Crabnik = Toolkit.getDefaultToolkit().getImage("src\\resources\\Crabnik 1.png");
        Result1 = Toolkit.getDefaultToolkit().getImage("src\\resources\\Sonic Got.png");
        Result2 = Toolkit.getDefaultToolkit().getImage("src\\resources\\Through.png");     
        Act1 = Toolkit.getDefaultToolkit().getImage("src\\resources\\Act 1.png"); 
        ResultsHUD = Toolkit.getDefaultToolkit().getImage("src\\resources\\Results HUD.png");
        GoalPost = Toolkit.getDefaultToolkit().getImage("src\\resources\\SPA Goal Post 1.png");
        BlackFade = Toolkit.getDefaultToolkit().getImage("src\\resources\\Black Fade 1.png");
        Cloud = Toolkit.getDefaultToolkit().getImage("src\\resources\\Cloud.png");
    }//close main
//***********************************************************
    public class JP extends JPanel {//start JPanel CLass

        public JP() {
            Container c = getContentPane();
            setOpaque(false);//allows for setting a color background in JPanel
            c.setBackground(Color.gray);//background color can be changed
        }

        public void paint(Graphics g) {//opens paint method
            super.paintComponent(g);//allows for painting and repainting
            collisioncheck = 1;
            Font font1 = new Font("Comic Sans MS",Font.BOLD,20); //creates a font setting for text on screen
            Font fontHUD = new Font("Comic Sans MS",Font.BOLD,40);
            Font fontContinue = new Font("Comic Sans MS",Font.PLAIN,80);
            g.setFont(font1);
            //changes the objects on the screen depending on the title value
            if (title == -1) {
                StartUp(g);
                starttimer++;
            }
            else if(title == 0) {
                //creates title screen
                TitleScreen(g);    
                titlerun ++;
                //changes music depending on the starting musicstart value
                if(musicstart == -2) {
                    playMusic();
                    musicstart = 1;   
                }
            }
            else if (title == 1 && lives == 0) {
                continueScreen(g, fontContinue);
            }
            //checks to see if the players lives is greater than 0 and the title value is the right value (makes the game run)
            else if (title == 1 && lives > 0) {
                if(secondTimer < 6000 && actend == 0) {//Timer for seconds, every 100 is equal to 1 second
                    secondTimer++;    
                }
                if(pittrigger == 1) {//If Sonic falls into a pit and respawns, the trigger is reset
                    pittrigger = 0;
                }
                //Controls what music plays and when it does
                if(musicstart == -1) {
                    playMusic();
                    musicstart = 1;
                }          
                if(musicstart == 0) {
                    playMusic();   
                    musicstart = 1;
                }
                if(actmusic == -1 && actend == 1) {
                    playMusic();    
                    actmusic = 0;
                }
                else if(actmusic == 0 && actend == 1) {
                    playMusic();    
                    actmusic = 1;
                }
                //creates player's collision box depending if they are ducking or not
                if(duck == false && duckcheck == -1) {
                    hSonic = 165;
                    ySonic = ySonic-125;
                    duckcheck = -2;   
                } 
                else if(duck == true && duckcheck == 0 && ground == true) {
                    ySonic = ySonic+55;
                    hSonic = 90; 
                    duckcheck = 1;
                }
                CollisionSonic = new Rectangle(xSonic,ySonic,wSonic,hSonic);
                if(change < 7) {//Controls when GoalPost's hitbox appears
                    GoalPostBox = new Rectangle(xGoalPostBox-2000,yGoalPostBox,192,144); 
                }
                else if(change == 7) {//Controls when GoalPost's hitbox appears
                    GoalPostBox = new Rectangle(xGoalPostBox,yGoalPostBox,192,144); 
                }
                //changes the rectangles that are drawn depending on the change value (which changes depending on what screen your on)
                if(change == 0) {
                    if(setRing == 0) {//Draws the rings on screen only 1 time (so when you collect a ring, it disappears and won't be drawn again
                        for(int i = 0;i < 5;i++) {
                            Rings.add(new Rectangle (300+200*i,500,50,50));
                        }
                        setRing = -1;
                    }        
                    Box1 = new Rectangle(xBox1-2000,yBox1,wBox1,hBox1);       
                    Box2 = new Rectangle(xBox2-2000,yBox2,wBox2,hBox2);        
                    Box3 = new Rectangle(xBox3-2000,yBox3,wBox3,hBox3);      
                    Box4 = new Rectangle(xBox4-2000,yBox4,wBox4,hBox4);
                    Box5 = new Rectangle(xBox5,yBox5,wBox5+2000,hBox5);
                    //This is drawn this way so that when Sonic is not colliding with the GlobalBoxes, it won't still be drawn in the same place
                    //where Sonic was just interacting with (same for every other change value)
                    GlobalSpikeBox = new Rectangle(xGlobalSpikeBox-2000,yGlobalSpikeBox,wSpike,hSpike);
                    GlobalSpringBox = new Rectangle(xGlobalSpringBox-2000,yGlobalSpringBox,wSpring,hSpring);
                    GlobalShotMon = new Rectangle(xGlobalShotMon-2000, yGlobalShotMon, wMon, hMon);
                    GlobalHMGMon = new Rectangle(xGlobalHMGMon-2000, yGlobalHMGMon, wMon, hMon);
                    GlobalRingMon = new Rectangle(xGlobalRingMon-2000,yGlobalRingMon,wMon,hMon);
                    Plat1 = new Rectangle(xPlat1-2000,yPlat1,wPlat1,hPlat1);
                    Plat2 = new Rectangle(xPlat2-2000,yPlat2,wPlat2,hPlat2);
                    GlobalPlat = new Rectangle(xGlobalPlat-2000,yGlobalPlat,wGlobalPlat,hGlobalPlat);
                }   
                else if (change == 1) {
                    if(setRing == 0) {//Draws the rings on screen only 1 time (so when you collect a ring, it disappears and won't be drawn again
                        for(int i = 0;i < 10;i++) {
                            if(i < 2) {
                            Rings.add(new Rectangle (200+100*i,500,50,50));    
                            }
                            if(i == 2 || i == 3 || i == 4) {
                            Rings.add(new Rectangle (200+100*i,300,50,50));    
                            }
                            else if(i == 5) {
                                Rings.add(new Rectangle (200+100*i,250,50,50));
                            }
                            else if(i == 6 || i == 7) {
                                Rings.add(new Rectangle (200+100*i,200,50,50));
                            }
                            else if(i >= 8) {
                                Rings.add(new Rectangle (200+100*i,300,50,50));
                            }
                        }
                        setRing = -1;
                    }
                    if(setSpike == 0) {//Draws the Spikes on screen only 1 time (lessen the lag)
                        for(int i = 0;i < 2;i++) {
                            if(i == 0) {
                                xSpikeBox.add(710);
                                ySpikeBox.add(500);      
                            }
                            else if(i == 1) {
                                xSpikeBox.add(834);
                                ySpikeBox.add(500);      
                            }
                            SpikeBox.add(new Rectangle(xSpikeBox.get(i),ySpikeBox.get(i),wSpike,hSpike));
                        }
                        setSpike = -1;
                    }
                    if(setEnemy == 0) {//Draws the enemy on screen only 1 time (so when you destory an enemy, it disappears and won't be drawn again
                        for(int i = 0;i < 2;i++) {
                            if(i == 0) {
                                xEnemyBox.add(450);
                                yEnemyBox.add(350);   
                            }
                            else if(i == 1) {
                                xEnemyBox.add(1075);
                                yEnemyBox.add(300);
                            }
                            else if(i == 2) {
                                xEnemyBox.add(400);
                                yEnemyBox.add(300);
                            }
                            EnemyBox.add(new Rectangle (xEnemyBox.get(i),yEnemyBox.get(i),wSpike,hSpike));
                        }
                        setEnemy = -1;
                    }
                    yBox1 = 450;        
                    Box1 = new Rectangle(xBox1,yBox1,wBox1,hBox1);
                    Box2 = new Rectangle(xBox2-2000,yBox2,wBox2,hBox2);
                    g.fillRect(xBox2, yBox2-2000, wBox2, hBox2);
                    Box3 = new Rectangle(xBox3+400,yBox3-30,wBox3,hBox3);
                    Box4 = new Rectangle(xBox4-200,yBox4,wBox4,hBox4);
                    Box5 = new Rectangle(xBox5,yBox5,wBox5+2000,hBox5);
                    GlobalSpikeBox = new Rectangle(xGlobalSpikeBox-2000,yGlobalSpikeBox,wSpike,hSpike);
                    GlobalEnemyBox = new Rectangle(xGlobalEnemyBox-2000,yGlobalEnemyBox,wMon,hMon);
                    GlobalSpringBox = new Rectangle(xGlobalSpringBox-2000,yGlobalSpringBox,wSpring,hSpring);
                    GlobalShotMon = new Rectangle(xGlobalShotMon-2000, yGlobalShotMon, wMon, hMon);
                    GlobalHMGMon = new Rectangle(xGlobalHMGMon-2000, yGlobalHMGMon, wMon, hMon);
                    GlobalRingMon = new Rectangle(xGlobalRingMon-2000,yGlobalRingMon,wMon,hMon);
                    Plat1 = new Rectangle(xPlat1-2000,yPlat1,wPlat1,hPlat1);
                    Plat2 = new Rectangle(xPlat2-2000,yPlat2,wPlat2,hPlat2);
                    GlobalPlat = new Rectangle(xGlobalPlat-2000,yGlobalPlat,wGlobalPlat,hGlobalPlat);
                }
                else if (change == 2) {
                    if(setEnemy == 0) {//Draws the enemy on screen only 1 time (so when you destory an enemy, it disappears and won't be drawn again
                        for(int i = 0;i < 1;i++) {
                            if(i == 0) {
                                xEnemyBox.add(1060);
                                yEnemyBox.add(500);   
                            }
                            EnemyBox.add(new Rectangle (xEnemyBox.get(i),yEnemyBox.get(i),wSpike,hSpike));
                        }
                        setEnemy = -1;
                    }
                    if(setRing == 0) {//Draws the rings on screen only 1 time (so when you collect a ring, it disappears and won't be drawn again
                        for(int i = 0;i < 9;i++) {
                            if(i  == 0) {
                                Rings.add(new Rectangle (200+100*i,500,50,50));    
                            }
                            else if(i == 1) {
                                Rings.add(new Rectangle (400,450,50,50));
                            }
                            else if(i == 2) {
                                Rings.add(new Rectangle (500,400,50,50));
                            }
                            else if(i == 3) {
                                Rings.add(new Rectangle (600,450,50,50));
                            }
                            else if(i == 4) {
                                Rings.add(new Rectangle (1000,450,50,50));
                            }
                            else if(i == 5) {
                                Rings.add(new Rectangle (1100,400,50,50));
                            }
                            else if(i == 6) {
                                Rings.add(new Rectangle (1200,450,50,50));
                            }
                            else if(i == 7) {
                                Rings.add(new Rectangle (1325,200,50,50));
                            }
                            else if(i == 8) {
                                Rings.add(new Rectangle (1325,100,50,50));
                            }
                        }
                        setRing = -1;
                    }                    
                    if(setRingMon == 0) {//Draws the Ring Monitors on screen only 1 time (so when you destroy a monitor, it disappears and won't be drawn again
                        for(int i = 0;i < 1;i++) {
                            if(i == 0) {
                                xRingMon.add(725);
                                yRingMon.add(505);   
                            }
                            else if(i == 1) {
                                xHMGMon.add(900);
                                yHMGMon.add(505);
                            }
                            else if(i == 2) {
                                xHMGMon.add(400);
                                yHMGMon.add(300);
                            }
                            RingMon.add(new Rectangle (xRingMon.get(i),yRingMon.get(i),wMon,hMon));
                        }
                        setRingMon = -1;
                    }                  
                    if(setSpring == 0) {//Draws the Spring on screen only 1 time (lessen the lag)
                        for(int i = 0; i < 1;i++) {
                            xSpringBox.add(1325);
                            ySpringBox.add(550);
                            SpringBox.add(new Rectangle (xSpringBox.get(i),ySpringBox.get(i),wSpring,hSpring));
                        }
                        setSpring = -1;
                    }
                    g.setColor(Color.black);
                    Box1 = new Rectangle(xBox1+200,yBox1+150,wBox1,hBox1);
                    Box2 = new Rectangle(xBox2+700,yBox2,wBox2,hBox2+500);
                    Box3 = new Rectangle(xBox3+200,yBox3+250,wBox3,hBox3+500);       
                    Box4 = new Rectangle(xBox4-3000,yBox4-3000,wBox4,hBox4);
                    Box5 = new Rectangle(xBox5,yBox5,wBox5,hBox5);
                    GlobalSpikeBox = new Rectangle(xGlobalSpikeBox-2000,yGlobalSpikeBox,wSpike,hSpike);
                    GlobalEnemyBox = new Rectangle(xGlobalEnemyBox-2000,yGlobalEnemyBox,wMon,hMon);
                    GlobalSpringBox = new Rectangle(xGlobalSpringBox-2000,yGlobalSpringBox,wSpring,hSpring);
                    GlobalShotMon = new Rectangle(xGlobalShotMon-2000, yGlobalShotMon, wMon, hMon);
                    GlobalHMGMon = new Rectangle(xGlobalHMGMon-2000, yGlobalHMGMon, wMon, hMon);
                    GlobalRingMon = new Rectangle(xGlobalRingMon-2000,yGlobalRingMon,wMon,hMon);
                    Plat1 = new Rectangle(xPlat1-2000,yPlat1,wPlat1,hPlat1);
                    Plat2 = new Rectangle(xPlat2-2000,yPlat2,wPlat2,hPlat2);
                    GlobalPlat = new Rectangle(xGlobalPlat-2000,yGlobalPlat,wGlobalPlat,hGlobalPlat);
                }
                else if (change == 3) {
                    if(setRing == 0) {//Draws the rings on screen only 1 time (so when you collect a ring, it disappears and won't be drawn again
                        for(int i = 0;i < 7;i++) {
                            if(i  == 0 || i == 1) {
                                Rings.add(new Rectangle (200+100*i,500,50,50));    
                            }
                            else if(i > 1 && i <= 3) {
                                Rings.add(new Rectangle (225+100*i,300,50,50));    
                            }
                            else if(i == 4) {
                                Rings.add(new Rectangle (1100,500,50,50));    
                            }
                            else if(i == 5) {
                                Rings.add(new Rectangle (1200,500,50,50));    
                            }
                            else if(i == 6) {
                                Rings.add(new Rectangle (1300,500,50,50));    
                            }
                        }
                        setRing = -1;                        
                    }
                    if(setEnemy == 0) {//Draws the enemy on screen only 1 time (so when you destory an enemy, it disappears and won't be drawn again
                        for(int i = 0;i < 1;i++) {
                            if(i == 0) {
                                xEnemyBox.add(800);
                                yEnemyBox.add(300);   
                            }
                            EnemyBox.add(new Rectangle (xEnemyBox.get(i),yEnemyBox.get(i),wSpike,hSpike));
                        }
                        setEnemy = -1;
                    }
                    if(setShotMon == 0) {//Draws the ShotGun Monitors on screen only 1 time (so when you destroy a monitor, it 
                        //disappears and won't be drawn again
                        for(int i = 0;i < 1;i++) {
                            if(i == 0) {
                                xShotMon.add(600);
                                yShotMon.add(300);   
                            }
                            ShotMon.add(new Rectangle (xShotMon.get(i),yShotMon.get(i),wMon,hMon));
                        }
                        setShotMon = -1;
                    }
                    g.setColor(Color.pink);
                    g.fillRect(xPlat1,yPlat1+hPlat1,wPlat1,300);
                    g.setColor(Color.black);
                    Box1 = new Rectangle(xBox1-2000,yBox1+150,wBox1,hBox1);
                    Box2 = new Rectangle(xBox2-2000,yBox2,wBox2,hBox2+500);
                    Box3 = new Rectangle(xBox3-2000,yBox3+250,wBox3,hBox3+500);       
                    Box4 = new Rectangle(xBox4-3000,yBox4-3000,wBox4,hBox4);
                    Box5 = new Rectangle(xBox5,yBox5,wBox5+2000,hBox5);
                    GlobalSpikeBox = new Rectangle(xGlobalSpikeBox-2000,yGlobalSpikeBox,wSpike,hSpike);
                    GlobalEnemyBox = new Rectangle(xGlobalEnemyBox-2000,yGlobalEnemyBox,wMon,hMon);
                    GlobalSpringBox = new Rectangle(xGlobalSpringBox-2000,yGlobalSpringBox,wSpring,hSpring);
                    GlobalShotMon = new Rectangle(xGlobalShotMon-2000, yGlobalShotMon, wMon, hMon);
                    GlobalHMGMon = new Rectangle(xGlobalHMGMon-2000, yGlobalHMGMon, wMon, hMon);
                    GlobalRingMon = new Rectangle(xGlobalRingMon-2000,yGlobalRingMon,wMon,hMon);
                    g.setColor(Color.magenta);
                    g.fillRect(xPlat1,yPlat1,wPlat1,hPlat1);
                    Plat1 = new Rectangle(xPlat1,yPlat1,wPlat1,hPlat1);
                    Plat2 = new Rectangle(xPlat2-2000,yPlat2,wPlat2,hPlat2);
                    GlobalPlat = new Rectangle(xGlobalPlat-2000,yGlobalPlat,wGlobalPlat,hGlobalPlat);
                }
                else if (change == 4) {
                    if(setRing == 0) {//Draws the rings on screen only 1 time (so when you collect a ring, it disappears and won't be drawn again
                        for(int i = 0;i < 10;i++) {
                            if(i == 0) {
                                Rings.add(new Rectangle (100,100,50,50));    
                            }
                            else if(i == 1) {
                                Rings.add(new Rectangle (200,100,50,50));    
                            }
                            else if(i == 2) {
                                Rings.add(new Rectangle (300,100,50,50));    
                            }
                            else if(i == 3) {
                                Rings.add(new Rectangle (500,300,50,50));    
                            }
                            else if(i == 4) {
                                Rings.add(new Rectangle (700,400,50,50));    
                            }
                            else if(i == 5) {
                                Rings.add(new Rectangle (800,400,50,50));    
                            }
                            else if(i == 6) {
                                Rings.add(new Rectangle (900,400,50,50));    
                            }
                            else if(i == 7) {
                                Rings.add(new Rectangle (1100,475,50,50));    
                            }
                            else if(i == 8) {
                                Rings.add(new Rectangle (1200,475,50,50));    
                            }
                            else if(i == 9) {
                                Rings.add(new Rectangle (1300,475,50,50));    
                            }
                        }
                        setRing = -1;
                    }
                    if(setEnemy == 0) {//Draws the enemy on screen only 1 time (so when you destory an enemy, it disappears and won't be drawn again
                        for(int i = 0;i < 2;i++) {
                            if(i == 0) {
                                xEnemyBox.add(650);
                                yEnemyBox.add(450);   
                            }
                            else if(i == 1) {
                                xEnemyBox.add(1200);
                                yEnemyBox.add(500);
                            }
                            EnemyBox.add(new Rectangle (xEnemyBox.get(i),yEnemyBox.get(i),wSpike,hSpike));
                        }
                        setEnemy = -1;
                    }
                    Box1 = new Rectangle(xBox1-400,yBox1-200,wBox1,hBox1);
                    Box2 = new Rectangle(xBox2-600, yBox2+200, wBox2, hBox2);
                    Box3 = new Rectangle(xBox3-600,yBox3+50,wBox3,hBox3);       
                    Box4 = new Rectangle(xBox4-600,yBox4+150,wBox4,hBox4);
                    Box5 = new Rectangle(xBox5+900,yBox5,wBox5+2000,hBox5);
                    GlobalSpikeBox = new Rectangle(xGlobalSpikeBox-2000,yGlobalSpikeBox,wSpike,hSpike);
                    GlobalEnemyBox = new Rectangle(xGlobalEnemyBox-2000,yGlobalEnemyBox,wMon,hMon);
                    GlobalSpringBox = new Rectangle(xGlobalSpringBox-2000,yGlobalSpringBox,wSpring,hSpring);
                    GlobalShotMon = new Rectangle(xGlobalShotMon-2000, yGlobalShotMon, wMon, hMon);
                    GlobalHMGMon = new Rectangle(xGlobalHMGMon-2000, yGlobalHMGMon, wMon, hMon);
                    GlobalRingMon = new Rectangle(xGlobalRingMon-2000,yGlobalRingMon,wMon,hMon);
                    Plat1 = new Rectangle(xPlat1-2000,yPlat1,wPlat1,hPlat1);
                    Plat2 = new Rectangle(xPlat2-2000,yPlat2,wPlat2,hPlat2);
                    GlobalPlat = new Rectangle(xGlobalPlat-2000,yGlobalPlat,wGlobalPlat,hGlobalPlat);
                }
                else if (change == 5) {
                    if(setSpike == 0) {//Draws the Spike on screen only 1 time (lessen the lag)
                        for(int i = 0;i < 1;i++) {
                            if(i == 0) {
                                xSpikeBox.add(815);
                                ySpikeBox.add(400);      
                            }
                            SpikeBox.add(new Rectangle(xSpikeBox.get(i),ySpikeBox.get(i),wSpike,hSpike));
                        }
                        setSpike = -1;
                    }
                    if(setHMGMon == 0) {//Draws the HMG Monitors on screen only 1 time (so when you destroy a monitor, it 
                        //disappears and won't be drawn again
                        for(int i = 0;i < 1;i++) {
                            if(i == 0) {
                                xHMGMon.add(1050);
                                yHMGMon.add(260);   
                            }
                            else if(i == 1) {
                                xHMGMon.add(900);
                                yHMGMon.add(505);
                            }
                            else if(i == 2) {
                                xHMGMon.add(400);
                                yHMGMon.add(300);
                            }
                            HMGMon.add(new Rectangle (xHMGMon.get(i),yHMGMon.get(i),wMon,hMon));
                        }
                        setHMGMon = -1;
                    }
                    Box1 = new Rectangle(xBox1+250,yBox1+50,wBox1,hBox1+1000);
                    Box2 = new Rectangle(xBox2+250, yBox2+250, wBox2, hBox2);
                    Box3 = new Rectangle(xBox3+500,yBox3+200,wBox3,hBox3);       
                    Box4 = new Rectangle(xBox4-2000,yBox4+150,wBox4,hBox4);
                    Box5 = new Rectangle(xBox5,yBox5,wBox5+100,hBox5);
                    GlobalSpikeBox = new Rectangle(xGlobalSpikeBox-2000,yGlobalSpikeBox,wSpike,hSpike);
                    GlobalEnemyBox = new Rectangle(xGlobalEnemyBox-2000,yGlobalEnemyBox,wMon,hMon);
                    GlobalSpringBox = new Rectangle(xGlobalSpringBox-2000,yGlobalSpringBox,wSpring,hSpring);
                    GlobalShotMon = new Rectangle(xGlobalShotMon-2000, yGlobalShotMon, wMon, hMon);
                    GlobalHMGMon = new Rectangle(xGlobalHMGMon-2000, yGlobalHMGMon, wMon, hMon);
                    GlobalRingMon = new Rectangle(xGlobalRingMon-2000,yGlobalRingMon,wMon,hMon);
                    Plat1 = new Rectangle(xPlat1-2000,yPlat1,wPlat1,hPlat1);
                    Plat2 = new Rectangle(xPlat2-2000,yPlat2,wPlat2,hPlat2);
                    GlobalPlat = new Rectangle(xGlobalPlat-2000,yGlobalPlat,wGlobalPlat,hGlobalPlat);
                }
                else if (change == 6) {
                    if(setRing == 0) {
                        for(int i = 0;i < 6;i++) {//Draws the rings on screen only 1 time (so when you collect a ring, it disappears and won't be drawn again
                            Rings.add(new Rectangle (300+200*i,500,50,50));
                        }
                        setRing = -1;
                    }
                    EnemyBulletDelay++;
                    for(int i = 0;i < 3;i++) {//Draws the bullets
                        //In a timed loop (everytime the EnemyBulletDelay is = 400
                        if(EnemyBulletDelay == 400 && setEnemyBullet == 0) {
                            xEnemyBullet.add(1600);
                            yEnemyBullet.add(450);
                            EnemyBullet.add(new Rectangle(xEnemyBullet.get(i),yEnemyBullet.get(i),10,10));
                            EnemyBulletDelay = 0;
                        }
                    }
                    if(setEnemy == 0) {//Draws the enemy on screen only 1 time (so when you destory an enemy, it disappears and won't be drawn again
                        for(int i = 0;i < 2;i++) {
                            if(i == 0) {
                                xEnemyBox.add(650);
                                yEnemyBox.add(500);   
                            }
                            else if(i == 1) {
                                xEnemyBox.add(1200);
                                yEnemyBox.add(500);
                            }
                            EnemyBox.add(new Rectangle (xEnemyBox.get(i),yEnemyBox.get(i),wSpike,hSpike));
                        }
                        setEnemy = -1;
                    }
                    Box1 = new Rectangle(xBox1-2000,yBox1-200,wBox1,hBox1);
                    Box2 = new Rectangle(xBox2-2000, yBox2+200, wBox2, hBox2);
                    Box3 = new Rectangle(xBox3-2000,yBox3+50,wBox3,hBox3);       
                    Box4 = new Rectangle(xBox4-2000,yBox4+150,wBox4,hBox4);
                    Box5 = new Rectangle(xBox5,yBox5,wBox5+2000,hBox5);
                    GlobalSpikeBox = new Rectangle(xGlobalSpikeBox-2000,yGlobalSpikeBox,wSpike,hSpike);
                    GlobalEnemyBox = new Rectangle(xGlobalEnemyBox-2000,yGlobalEnemyBox,wMon,hMon);
                    GlobalSpringBox = new Rectangle(xGlobalSpringBox-2000,yGlobalSpringBox,wSpring,hSpring);
                    GlobalShotMon = new Rectangle(xGlobalShotMon-2000, yGlobalShotMon, wMon, hMon);
                    GlobalHMGMon = new Rectangle(xGlobalHMGMon-2000, yGlobalHMGMon, wMon, hMon);
                    GlobalRingMon = new Rectangle(xGlobalRingMon-2000,yGlobalRingMon,wMon,hMon);
                    Plat1 = new Rectangle(xPlat1-2000,yPlat1,wPlat1,hPlat1);
                    Plat2 = new Rectangle(xPlat2-2000,yPlat2,wPlat2,hPlat2);
                    GlobalPlat = new Rectangle(xGlobalPlat-2000,yGlobalPlat,wGlobalPlat,hGlobalPlat);
                }
                else if(change == 7) {
                    Box1 = new Rectangle(xBox1-2000,yBox1-200,wBox1,hBox1);
                    Box2 = new Rectangle(xBox2-2000, yBox2+200, wBox2, hBox2);
                    Box3 = new Rectangle(xBox3-2000,yBox3+50,wBox3,hBox3);       
                    Box4 = new Rectangle(xBox4-2000,yBox4+150,wBox4,hBox4);
                    Box5 = new Rectangle(xBox5,yBox5,wBox5+2000,hBox5);
                    GlobalSpikeBox = new Rectangle(xGlobalSpikeBox-2000,yGlobalSpikeBox,wSpike,hSpike);
                    GlobalEnemyBox = new Rectangle(xGlobalEnemyBox-2000,yGlobalEnemyBox,wMon,hMon);
                    GlobalSpringBox = new Rectangle(xGlobalSpringBox-2000,yGlobalSpringBox,wSpring,hSpring);
                    GlobalShotMon = new Rectangle(xGlobalShotMon-2000, yGlobalShotMon, wMon, hMon);
                    GlobalHMGMon = new Rectangle(xGlobalHMGMon-2000, yGlobalHMGMon, wMon, hMon);
                    GlobalRingMon = new Rectangle(xGlobalRingMon-2000,yGlobalRingMon,wMon,hMon);
                    Plat1 = new Rectangle(xPlat1-2000,yPlat1,wPlat1,hPlat1);
                    Plat2 = new Rectangle(xPlat2-2000,yPlat2,wPlat2,hPlat2);
                    GlobalPlat = new Rectangle(xGlobalPlat-2000,yGlobalPlat,wGlobalPlat,hGlobalPlat);
                    if(goalPostTimer == 0) {//When Sonic is not hitting the goal post, it is drawn in its default position (Frame 1 of Animation)
                        GoalPost = Toolkit.getDefaultToolkit().getImage("src\\resources\\SPA Goal Post 1.png"); 
                    }
                }
                Box1(g);
                Box2(g);
                Box3(g);
                Box4(g);
                g.setColor(Color.orange);
                g.fillRect(Box5.x,Box5.y,Box5.width,Box5.height);
                drawEnvironment(g);
                if(change == 7) {
                    g.drawImage(GoalPost,xGoalPostBox,yGoalPostBox,192,144,this);    
                }
                //For all of these ArrayList.size() > 0 if statements, it is just sending each of the values of the arrayLists
                //to their respective methods that draw each one and check to see if Sonic (or a bullet in some cases) is colliding 
                //with one of the values in the arraylist
                if(Rings.size() > 0) {
                    for(int i = 0;i < Rings.size();i++){
                        ringDraw(g,i,Rings.get(i));
                        ringGet(g,i);
                    }    
                }
                if(HMGMon.size() > 0) {
                    for(int i = 0;i < HMGMon.size();i++){
                        drawHMGMon(g,HMGMon.get(i),i);
                        collideHMGMon(g,HMGMon.get(i),CollisionSonic);
                    }    
                }
                if(ShotMon.size() > 0) {
                    for(int i = 0;i < ShotMon.size();i++){
                        drawShotMon(g,ShotMon.get(i),i);
                        collideShotMon(g,ShotMon.get(i),CollisionSonic);
                    }    
                }
                if(RingMon.size() > 0) {
                    for(int i = 0;i < RingMon.size();i++){
                        drawRingMon(g,RingMon.get(i),i);
                        collideRingMon(g,RingMon.get(i),CollisionSonic);
                    }    
                }
                if(SpringBox.size() > 0) {
                    for(int i = 0;i < SpringBox.size();i++){
                        drawSpring(g,SpringBox.get(i),i);
                        collideSpring(g,SpringBox.get(i),CollisionSonic);
                    }    
                }
                if(SpikeBox.size() > 0) {
                    for(int i = 0;i < SpikeBox.size();i++){
                        drawSpike(g,SpikeBox.get(i),i);
                        collideSpike(g,SpikeBox.get(i),CollisionSonic);
                    }    
                }
                if(EnemyBox.size() > 0) {
                    for(int i = 0;i < EnemyBox.size();i++){
                        drawEnemy(g,EnemyBox.get(i),i);
                        collideEnemy(g,EnemyBox.get(i),CollisionSonic);
                    }    
                }
                if(EnemyBullet.size() > 0) {
                    for(int i = 0;i < EnemyBullet.size();i++){
                        drawEnemyBullet(g,EnemyBullet.get(i),i);
                        EnemyBullet.set(i,new Rectangle(xEnemyBullet.get(i),yEnemyBullet.get(i),10,10));
                        collideEnemyBullet(g,EnemyBullet.get(i),CollisionSonic,i);
                    }    
                }
                collide=collision(g);
                //Changes the position of the Platform depending on the change value
                if(CollisionSonic.intersects(Plat1)) {
                    GlobalPlat = Plat1;  
                    wGlobalPlat = wPlat1;
                    hGlobalPlat = hPlat1;
                    if(change == 3) {
                        xGlobalPlat = xPlat1;
                        yGlobalPlat = yPlat1;    
                    }            
                }
                else if(CollisionSonic.intersects(Plat2)) {
                    GlobalPlat = Plat2;  
                    wGlobalPlat = wPlat2;
                    hGlobalPlat = hPlat2;
                    if(change == 3) {
                        xGlobalPlat = xPlat2;
                        yGlobalPlat = yPlat2;    
                    }            
                }
                //checking if the player is not pressing any keys or is not interacting with something like a spike 
                //and that the timer for the waiting animation has not started yet
                //sets player's sprite to stand
                //This sets the xvalue, yvalue and the Rectangle of the GlobalSpikeBox, depending on the screen
                if(notwait==1 && left == false && right == true && duck == false && jump == 0 && spike == 0 && spring == 0) {
                    Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Stand 1.png");
                }
                else if(notwait==1 && left == true && right == false && duck == false && jump == 0 && spike == 0 && spring == 0) {
                    Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Stand 1.png");
                }
                //checks to see if waittimer(which is constantly increasing by one every loop and is set to 1 when a key is pressed) is above a 
                //certain point and that the player is not hit by something, starts the waiting animation(controlled by Blink method
                if(waittimer >= 150 && duck == false && jump == 0 && actend == 0 && spike == 0 && spring == 0 && xpress == 0) {
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
                if(ground == true) {
                    waittimer ++;    
                }
                if (collide == true && gravity != 0 && collisioncheck == 0) {
                    ySonic -= 0;
                    collide=false;
                }
                //This controls jumping, when the player presses Z or X it sets the gravity to a negative number, when this happens 
                //I programmed it so that the player's yvalue decreases, when the gravity is positive, it causes gravity to start acting again               
                else {
                    if(gravity < 0 && jump ==1 && left == true && duck == false && right == false && collisioncheck == 1 && spike == 0) {
                        ySonic-=4;  
                        notwait = 1;
                    }
                    if(gravity > 0 && gravity <= Math.abs(jumpheight) && jump ==1 && left == true && duck == false && right == false && collisioncheck == 1 && spike == 0) {
                        ySonic+=4;
                        notwait = 1;
                    }
                    if(gravity > 0 && gravity == Math.abs(jumpheight) && jump ==1 && duck == false && collisioncheck == 1 && spike == 0) {
                        aniblink = 0;
                        waittimer = 0;
                        notwait = 1;
                        anijump = 0;
                        jump = 0; 
                    }
                    if(gravity < 0 && jump ==1 && left == false && duck == false && right == true && collisioncheck == 1 && spike == 0) {
                        ySonic-=4;  
                        notwait = 1;
                    }
                    if(gravity >= 0 && gravity <= Math.abs(jumpheight) && jump ==1 && left == false && duck == false && right == true && collisioncheck == 1 && spike == 0) {
                        ySonic+=4;
                        notwait = 1;
                    }
                    //This controls gravity
                    //gravity as a value is constantly increasing, when the value is greater than 0, the player's y value is constantly increased by 1
                    //unless they collide with a spike or something
                    if(collide == false && !CollisionSonic.intersects(GlobalPlat) || collide == true && CollisionSonic.intersects(GlobalPlat)) {
                        gravity++; 
                    }
                    if(gravity > 0 && jump == 0 && ySonic <= 770 && collide == false && spike == 0 && spring == 0) {
                        ySonic+=10;
                    }
                    else if(gravity > 0 && jump == 0 && ySonic <= 770 && collide == true && spike == 0 && spring == 0 && CollisionSonic.intersects(GlobalPlat) && ySonic+hSonic >= test+10 && ySonic > Oof && ground == false) {
                        ySonic+=10;
                    }
                    else if(ySonic > 770 && ySonic != 780 && collide == false) {
                        ySonic = 770;
                    }
                    if(gravity > 1000) {
                        gravity = 1000;
                    }
                    //This checks to see if Sonic is in a pit (the variable pittrigger
                    //If Sonic is in a pit and his lives are greater than 1, it subtracts lives by 1 and resets Sonic's position
                    //If it is 1, Sonic will lose a life and the game will end 
                    if(ySonic == 770 && pittrigger == 0 && lives > 1) {
                        lives--;
                        xSonic = 0;
                        ySonic = 50;
                        spike = 0;
                        ringsCollected = 0;
                        pittrigger = 1;
                    }
                    else if(ySonic == 770 && pittrigger == 0 && lives == 1) {
                        //clip.close();
                        lives--;
                    }
                    //Failsafe if gravity doesnt work
                    if(collide == true && collisioncheck != 1) {
                        gravity = 0;
                    }
                    //This makes sure that the Player's sprite is reset when colliding with a wall (if the player is not intersecting an item box)
                    if(jump == 1 && collide == true && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon) && !CollisionSonic.intersects(GlobalRingMon) && !CollisionSonic.intersects(GlobalPlat)) {
                       aniblink = 0;
                       waittimer = 0;
                       notwait = 1;
                       anijump = 0;
                       jump = 0; 
                       anirun = 0;                   
                    }
                    //allows player to land on a platform, resets the jumping animation and changes it to the normal standing one, returns gravity
                    //to normal
                    else if(collide == true && CollisionSonic.intersects(GlobalPlat) && ySonic+hSonic < test+10 && jump == 1) {
                       aniblink = 0;
                       waittimer = 0;
                       notwait = 1;
                       anijump = 0;
                       jump = 0; 
                       gravity = 1;
                    }                    
                    //This creates the little "bop" the player gets when jumping on an item box, also changes powerUp to 1
                    //Allows player to shoot bullets (HMG power up)
                    else if(jump == 1 && collide == true && CollisionSonic.intersects(GlobalHMGMon)) {
                        for(int i = 0;i < HMGMon.size();i++){
                            removeHMGMon(g,i,CollisionSonic);
                        }
                        gravity = -20;
                        jumpheight = -20;           
                        powerUp = 1;
                        BulletDelay = 0;
                        ammo = 20;
                    }
                    //This creates the little "bop" the player gets when jumping on an item box, also changes powerUp to 2
                    //Allows player to shoot a shotgun blast (ShotGun power up)
                    else if(jump == 1 && collide == true && CollisionSonic.intersects(GlobalShotMon)) {
                        for(int i = 0;i < ShotMon.size();i++){
                            removeShotMon(g,i,CollisionSonic);
                        }
                        gravity = -20;
                        jumpheight = -20;            
                        powerUp = 2;
                        BulletDelay = 0;
                        ammo = 10;
                    }
                    //This creates the little "bop" the player gets when jumping on an item box, also adds to the ringsCollected 
                    else if(jump == 1 && collide == true && CollisionSonic.intersects(GlobalRingMon)) {
                        for(int i = 0;i < RingMon.size();i++){
                            removeRingMon(g,i,CollisionSonic);
                        }
                        gravity = -20;
                        jumpheight = -20; 
                        ringsCollected+=10;
                    }
                    //This creates the little "bop" the player gets when jumping on an enemy, adds to score 
                    else if(jump == 1 && CollisionSonic.intersects(GlobalEnemyBox)) {
                        for(int i = 0;i < EnemyBox.size();i++){
                            removeEnemy(g,i,CollisionSonic);
                        }
                        gravity = -20;
                        jumpheight = -20; 
                    }
                    //Plays sound effect when player intersects a monitor while jumping
                    if(jump == 1 && collide == true && CollisionSonic.intersects(GlobalHMGMon) && boxSound == 0) {
                        playMusic();
                        boxSound = 1;
                    }
                    if(jump == 1 && collide == true && CollisionSonic.intersects(GlobalShotMon) && boxSound == 0) {
                        playMusic();
                        boxSound = 1;
                    }
                    if(jump == 1 && collide == true && CollisionSonic.intersects(GlobalRingMon) && boxSound == 0) {
                        playMusic();
                        boxSound = 1;
                    }
                }
                //Oof is the y-coord of the box that the player is currently colliding into
                //That helps to determine what position the player is depending on how the collide with the box          
                if(CollisionSonic.intersects(Box3)&& CollisionSonic.intersects(Box2)) {
                    Oof = test - hSonic;   
                }
                else if(CollisionSonic.intersects(Box5)&& CollisionSonic.intersects(Box1)) {
                    Oof = test - hSonic;   
                }
                else if(CollisionSonic.intersects(Box5)&& CollisionSonic.intersects(Box4)) {
                    Oof = test - hSonic;   
                }
                else if(CollisionSonic.intersects(Box3)&& CollisionSonic.intersects(Box4) && change == 1) {
                    Oof = test - hSonic;   
                }
               //All of this code (from Box1 to Box5) allows for Sonic to fall on rectangles 
                else if (CollisionSonic.intersects(Box1) && ySonic+hSonic < test) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(Box1) && ySonic+hSonic > test) {
                    Oof = (test - hSonic);      
                }
                else if (CollisionSonic.intersects(Box2) && ySonic+hSonic < test) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(Box2) && ySonic+hSonic > test) {
                    Oof = (test - hSonic);      
                }
                else if (CollisionSonic.intersects(Box3) && ySonic+hSonic < test) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(Box3) && ySonic+hSonic > test) {
                    Oof = (test - hSonic);      
                }
                else if (CollisionSonic.intersects(Box4) && ySonic+hSonic < test) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(Box4) && ySonic+hSonic > test) {
                    Oof = (test - hSonic);      
                }
                else if (CollisionSonic.intersects(Box5) && ySonic+hSonic < test) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(Box5) && ySonic+hSonic > test) {
                    Oof = (test - hSonic);      
                }
                //this controls when Sonic hits a spike (GlobalSpikeBox is used so I dont have to individually check every spike)
                else if (CollisionSonic.intersects(GlobalSpikeBox) && ySonic+hSonic < test && ground == true) {
                    Oof = (test + hSonic);      
                }
                //Changes depending on if the player is colliding with a spring or jumping on a spring
                else if (CollisionSonic.intersects(GlobalSpringBox) && ySonic+hSonic > test && ground == true) {
                    Oof = (test - hSonic);      
                }
                else if (CollisionSonic.intersects(GlobalSpringBox) && ySonic+hSonic <= test && ySonic+hSonic >= test+25) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(GlobalSpringBox) && ySonic+hSonic <= test && ySonic+hSonic >= test+20) {
                    Oof = (test - hSonic);      
                }
                //Same thing with the monitors as with the boxes
                else if (CollisionSonic.intersects(GlobalHMGMon) && ySonic+hSonic < test) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(GlobalHMGMon) && ySonic+hSonic > test) {
                    Oof = (test - hSonic);      
                }
                else if (CollisionSonic.intersects(GlobalShotMon) && ySonic+hSonic < test) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(GlobalShotMon) && ySonic+hSonic > test) {
                    Oof = (test - hSonic);      
                }
                else if (CollisionSonic.intersects(GlobalRingMon) && ySonic+hSonic < test) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(GlobalRingMon) && ySonic+hSonic > test) {
                    Oof = (test - hSonic);      
                }
                else if (CollisionSonic.intersects(GlobalPlat) && ySonic+hSonic < test) {
                    Oof = (test + hSonic);      
                }
                else if (CollisionSonic.intersects(GlobalPlat) && ySonic+hSonic > test) {
                    Oof = (test - hSonic);      
                }
                //when the player collides with a spike from the top, sets spike to 1 (creates the knockback)
                else if (CollisionSonic.intersects(GlobalSpikeBox) && ySonic-hSonic < yGlobalSpikeBox && ringsCollected > 0) {
                    spike = 1;
                    /*if(spikemusic == 0) {
                      playMusic(); 
                      spikemusic = 1;
                    }*/
                    jump = 0;
                    anijump = 0;
                    gravity = 0;
                    spiketimer = 0;
                }
                //checks to see if the player has no rings, if they do not, they lose a life
                else if (CollisionSonic.intersects(GlobalSpikeBox) && ySonic-hSonic < yGlobalSpikeBox && ringsCollected == 0 && spiketimer > 40 && spike == 1) {
                    lives--;
                    spike = 0;
                    spiketimer = 0;
                    xSonic = 0;
                } 
                else if (CollisionSonic.intersects(GlobalSpikeBox) && ySonic-hSonic < yGlobalSpikeBox && ringsCollected == 0 && spike == 0) {
                    lives--;
                    spike = 0;
                    spring = 0;
                    spiketimer = 0;
                    xSonic = 0;
                } 
                //Sets the spring variable to 1, causing the player to enter their spring state (responding to the spring)
                else if (CollisionSonic.intersects(GlobalSpringBox) && ySonic+hSonic >= yGlobalSpringBox && ySonic+hSonic <= yGlobalSpringBox+20 && ground == false) {
                  jump = 0;
                  anijump = 0;
                  spring = 1;
                   /*if(spikemusic == 0) {
                     playMusic(); 
                     spikemusic = 1;
                   }*/
                   gravity = 0;
               }
                //Removes life if player intersects enemy (and their not jumping)
                if (CollisionSonic.intersects(GlobalEnemyBox) && EnemyBox.size() > 0 && jump == 0) {
                    lives--;
                    ringsCollected = 0;
                    xSonic = 0;
                }
                //This is where I determine if the player is on the ground or in the air
                if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(Box5) && ySonic != 780 && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalPlat) && !CollisionSonic.intersects(GlobalShotMon) && !CollisionSonic.intersects(GlobalRingMon)) {
                    ground = false;
                }
                else if(CollisionSonic.intersects(GlobalPlat)&& ySonic+hSonic > test+10) {
                    ground = false;
                }
                else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box5) && ySonic == 780) {
                    ground = true;
                }
                else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box5) && ySonic == 770 && spike == 1) {
                    ground = true;
                }
                else if(CollisionSonic.intersects(Box1)&& ySonic > Oof && ySonic+hSonic < test+10) {
                   ground = true;
                }
                else if(CollisionSonic.intersects(Box2)&& ySonic > Oof && ySonic+hSonic < test+10) {
                    ground = true;
                }
                else if(CollisionSonic.intersects(Box3)&& ySonic > Oof && ySonic+hSonic < test+10) {
                    ground = true;
                }           
                else if(CollisionSonic.intersects(Box4)&& ySonic > Oof && ySonic+hSonic < test+10) {
                    ground = true;
                }
                else if(CollisionSonic.intersects(Box5)&& ySonic > Oof && ySonic+hSonic < test+10) {
                    ground = true;
                }
                else if(CollisionSonic.intersects(GlobalHMGMon)&& ySonic > Oof && ySonic+hSonic < test+10) {
                   ground = true;
                }
                else if(CollisionSonic.intersects(GlobalShotMon)&& ySonic > Oof && ySonic+hSonic < test+10) {
                   ground = true;
                }
                else if(CollisionSonic.intersects(GlobalRingMon)&& ySonic > Oof && ySonic+hSonic < test+10) {
                   ground = true;
                }
                else if(CollisionSonic.intersects(GlobalPlat)&& ySonic > Oof && ySonic+hSonic <= test+10 && jump == 0) {
                   ground = true;
                }
                //Creates the knockback the player gets if they jump on a spring (in both left and right directions)
                if(spiketimer > -1 && spiketimer < 1000 && spike == 1) {
                    spiketimer ++;
                }
                if(spike == 1 && ground == false && right == true && left == false && ySonic < 770 && collide == false && spiketimer < 1000 && spring == 0) {
                    xSonic -=1;
                        if(spiketimer > -1 && spiketimer < 40) {
                            ySonic -= 3; 
                            ringsCollected = 0;
                        }
                        else if (spiketimer > 40 && spiketimer < 1000) {
                            ySonic += 5;
                        }
                }
                else if(spike == 1 && ground == false && right == false && left == true && ySonic < 770 && collide == false && spiketimer < 1000 && spring == 0) {
                    xSonic +=1;
                        if(spiketimer > -1 && spiketimer < 40) {
                            ySonic -= 3;
                            ringsCollected = 0;                           
                        }
                        else if (spiketimer > 40 && spiketimer < 1000) {
                            ySonic += 5; 
                        }
                }
                if(ground == true && boxSound == 1) {
                    boxSound = 0;
                }           
                //This controls when the player jumps on a spring (with a springTimer), increasing for a certain amount of time, then 
                //decreases until the player hits the spring or the ground
                if(spring == 1 && springtimer < 120) {
                   springtimer ++;
                   ySonic -=4;
                }
                if(springtimer >= 120) {
                   ySonic+=4; 
                }
                //Resets springtimer
                if(CollisionSonic.intersects(GlobalSpringBox) && ySonic+hSonic > yGlobalSpringBox && ySonic+hSonic < yGlobalSpringBox+20 && springtimer >= 120 && spring == 1) {
                    springtimer = 0;
                }
                //Resets spike variable, so player is in a normal state
                if((ground == true && spike == 1) || (spring == 1 && spike == 1)) {
                    spike = 0;
                }
                //Resets spring variable, so player is in a normal state
                if(ground == true && spring == 1) {
                    spring  = 0;
                }
                //if the player is in a spring state, it will cause them to feel the knockback of the spike, and resets the spring state
                if(spring == 1 && CollisionSonic.intersects(GlobalSpikeBox) && ySonic-hSonic < yGlobalSpikeBox) {
                    spike = 1;
                    spring = 0;
                } 
                //Pushes player from wall if they are in a spike state (hit a spike and are feeling the knockback)
                if (CollisionSonic.intersects(Box1) && spike == 1 && left == true || CollisionSonic.intersects(Box2) && spike == 1 && left == true|| CollisionSonic.intersects(Box3) && spike == 1 && left == true|| CollisionSonic.intersects(Box4) && spike == 1 && left == true || CollisionSonic.intersects(Box5) && spike == 1 && left == true) {
                    xSonic -= 25;
                    collide=false;
                }
                else if (CollisionSonic.intersects(Box1) && spike == 1 && right == true || CollisionSonic.intersects(Box2) && spike == 1 && right == true || CollisionSonic.intersects(Box3) && spike == 1 && right == true || CollisionSonic.intersects(Box4) && spike == 1 && right == true || CollisionSonic.intersects(Box5) && spike == 1 && right == true) {
                    xSonic += 25;
                    collide=false;
                }
                //resets spike knockback
                if(spike == 0) {
                    spiketimer = -1;
                    spikemusic = 0;
                    xGlobalSpikeBox = -1000;
                    yGlobalSpikeBox = 0;
                }
                //resets spring state
                if(spring == 0) {
                    springtimer = 0;
                }

                //g.setColor(Color.red);
                //g.fillRect(xSonic,ySonic,wSonic,hSonic);
                //g.fillRect(xGlobalSpikeBox,yGlobalSpikeBox,wSpike,hSpike);
                //g.fillRect(xGlobalHMGMon,yGlobalHMGMon,wMon,hMon);                          
                //g.setColor(Color.red);
                //g.fillRect(0,ySonic+hSonic,2000,1);
                //g.setColor(Color.blue);
                //g.fillRect(0,Oof,2000,1);
                //g.setColor(Color.green);
                //g.fillRect(0,test,2000,1);
                //Draws the player ducking
                if (duck == true && spike == 0 && spring == 0) {
                    Duck(g);
                }
                //resets Blink animation and starts Jump Animation
                if (jump == 1 && spike == 0 && spring == 0) {
                    waittimer = 0;
                    Jump(g,anijump);
                    anijump++;
                }           
                //draws the player's spring animation
                if(spring == 1) {
                    Spring(g);
                }
                //Draws the run animation depending on the direction
                if ((rightpress == 1 && jump == 0 && duck == false && spike == 0 && spring == 0 && powerUp != 2) || (leftpress == 1 && jump == 0 && duck == false && spike == 0 && spring == 0 && powerUp != 2) ){
                    Run(g);
                    anirun++;
                    if(anirun > 40) {
                        anirun = 0;
                    }
                }
                else if ((rightpress == 1 && jump == 0 && duck == false && spike == 0 && spring == 0 && powerUp == 2 && Bullet.size() < 1) || (leftpress == 1 && jump == 0 && duck == false && spike == 0 && spring == 0 && powerUp == 2 && Bullet.size() < 1) ){
                    Run(g);
                    anirun++;
                    if(anirun > 40) {
                        anirun = 0;
                    }
                }
                //Changes what key is pressed (left or right)
                else if ((rightpress == 1 && jump == 0 && duck == false && spike == 0 && spring == 0 && powerUp == 2 && Bullet.size() == 1) || (leftpress == 1 && jump == 0 && duck == false && spike == 0 && spring == 0 && powerUp == 2 && Bullet.size() == 1) ){
                    rightpress = 0;
                    leftpress = 0;
                }
                //Plays wag animation when the act ends
                if(actend == 1 && ground == true && spike == 0 && spring == 0) {
                    notwait = 1;
                    aniblink = 0;
                    waittimer = 0;
                    duck = false;      
                    Wag(g);
                    aniwag++;  
                    if(aniwag >= 200) {
                        aniwag = 0;     
                    }            
                }
                //draws the Hit animation when the player is hurt
                if(spike == 1 && spring == 0) {
                    Hit(g);
                }
                //Heavy Machine Gun, Shotgun and the X Key, changes depending on the direction of the player, limits the # of bullets on screen
                //at once
                if(xpress == 1 && Bullet.size() < 20 && powerUp == 1 && ammo > 0 && duck == false) {
                    if(right == true) {
                        BulletDirection = 0;
                    }
                    else if(left == true) {
                        BulletDirection = 1;
                    }
                    BulletDelay++;
                    if(BulletDelay >= 15) {
                        BulletDir.add(BulletDirection);
                        BulletX.add(xSonic+50);
                        BulletY.add(ySonic+80);
                        Bullet.add(new Rectangle (xSonic+50,ySonic+80,10,10));  
                        ammo--;    
                        BulletDelay = 0;
                    }
                }
                //Same thing, but with the shotgun
                else if(xpress == 1 && Bullet.size() < 1 && powerUp == 2 && ammo > 0 && duck == false && jump == 0 && ground == true) {
                    if(right == true) {
                        BulletX.add(xSonic+wSonic);
                        BulletDirection = 0;
                    }
                    else if(left == true) {
                        BulletX.add(xSonic-200);
                        BulletDirection = 1;
                    }
                    if(BulletDelay >= 0 && BulletDelay  < 15) {
                        BulletDir.add(BulletDirection);
                        BulletY.add(ySonic+40);
                        Bullet.add(new Rectangle (xSonic+wSonic,ySonic+40,200,100));  
                        ammo--;   
                        BulletDelay = 0;
                    }
                }
                //Creates the deslay for the shotgun weapon
                if(Bullet.size() == 1 && powerUp == 2) {
                    BulletDelay++;
                }
                //controls the bullets for each HMG bullet
                if(Bullet.size() > 0 && powerUp == 1) {
                    for(int i = 0; i < Bullet.size();i++){
                        Bullet.set(i,new Rectangle(BulletX.get(i),BulletY.get(i),10,10));
                        HMG(g,i);
                    }   
                }
                //samething for the shotgun blast
                if(Bullet.size() > 0 && powerUp == 2) {
                    for(int i = 0; i < Bullet.size();i++){
                        Bullet.set(i,new Rectangle(BulletX.get(i),BulletY.get(i),200,100));
                        ShotGun(g,i);
                    }   
                }
                //removes powerup when you run out of ammo
                if(ammo == 0 && powerUp > 0) {
                        powerUp = 0;
                        BulletCollide = false;
                }
                //Stops Blink animation when the player is shooting
                if(xpress == 1) {
                   waittimer = 0;
                   aniblink = 0;
                }
                //Event that runs when right is pressed
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
                    //Checks if player is not colliding with box, if not they can move forward (if they are the player gets pushed back)
                    if ((collide && ySonic+hSonic > (Oof) && spike == 0 && Oof > 0 && ySonic+hSonic < test && jump == 0) && spike == 0 || (collide && ySonic+hSonic > (Oof) && spike == 0 && Oof < 0 && ySonic+hSonic > test+10 && jump == 0) || (collide && ySonic+hSonic > (Oof) && spike == 0 && Oof > 0 && ySonic+hSonic > test+10 && jump == 0) || (CollisionSonic.intersects(GlobalSpikeBox) && spike == 0)) {
                        xSonic -= 30;
                        gravity = 1;
                        collide=false;
                    }
                    else if(CollisionSonic.intersects(GlobalPlat) && ySonic+hSonic < test && ground == false && xSonic >= xGlobalPlat && xSonic < xGlobalPlat+hGlobalPlat && Oof >= 0) {
                        collide = false;
                    }
                    else if(CollisionSonic.intersects(GlobalPlat) && ySonic+hSonic > test && ground == false && xSonic >= xGlobalPlat && xSonic < xGlobalPlat+hGlobalPlat && Oof < 0) {
                        collide = false;
                    }
                    //Changes the screen when the playre reaches the edge of the screen
                    else if(xSonic > 1450 && change == 0) {
                        wipeScreen();
                        if(Rings.isEmpty() && HMGMon.isEmpty() && ShotMon.isEmpty() && RingMon.isEmpty() && SpringBox.isEmpty() && SpikeBox.isEmpty() && EnemyBox.isEmpty()) {
                            setRing = 0;
                            change = 1;
                            xSonic = 50;
                        }
                    }
                    else if(xSonic > 1450 && change == 1) {
                        wipeScreen();
                        if(Rings.isEmpty() && HMGMon.isEmpty() && ShotMon.isEmpty() && RingMon.isEmpty() && SpringBox.isEmpty() && SpikeBox.isEmpty() && EnemyBox.isEmpty()) {
                            setRing = 0;
                            setSpike = 0;
                            setEnemy = 0;
                            change = 2;
                            xSonic = 50;
                        }
                    }
                    else if(xSonic > 1450 && change == 2 && ySonic > -58) {
                        wipeScreen();
                        if(Rings.isEmpty() && HMGMon.isEmpty() && ShotMon.isEmpty() && RingMon.isEmpty() && SpringBox.isEmpty() && SpikeBox.isEmpty()) {
                            setRing = 0;
                            setHMGMon = 0;
                            setEnemy = 0;
                            change = 3;
                            xSonic = 0;
                            ySonic = 400;
                        }
                    }
                    else if(xSonic > 1450 && change == 3) {
                        wipeScreen();
                        if(Rings.isEmpty() && HMGMon.isEmpty() && ShotMon.isEmpty() && RingMon.isEmpty() && SpringBox.isEmpty() && SpikeBox.isEmpty()) {
                            setRing = 0;
                            setHMGMon = 0;
                            setEnemy = 0;
                            change = 4;
                            xSonic = 0;
                            ySonic = 0;
                        }
                    }
                    else if(xSonic > 1450 && change == 4) {
                        wipeScreen();
                        if(Rings.isEmpty() && HMGMon.isEmpty() && ShotMon.isEmpty() && RingMon.isEmpty() && SpringBox.isEmpty() && SpikeBox.isEmpty()) {
                            setRing = 0;
                            setHMGMon = 0;
                            setSpike = 0;
                            setEnemy = 0;
                            change = 5;
                            xSonic = 0;
                            ySonic = 400;
                        }
                    }      
                    else if(xSonic > 1450 && change == 5) {
                        wipeScreen();
                        if(Rings.isEmpty() && HMGMon.isEmpty() && ShotMon.isEmpty() && RingMon.isEmpty() && SpringBox.isEmpty() && SpikeBox.isEmpty()) {
                            setRing = 0;
                            setHMGMon = 0;
                            setSpike = 0;
                            setEnemy = 0;
                            change = 6;
                            xSonic = 0;
                            ySonic = 400;
                        }
                    }
                    else if(xSonic > 1450 && change == 6) {
                        wipeScreen();
                        if(Rings.isEmpty() && HMGMon.isEmpty() && ShotMon.isEmpty() && RingMon.isEmpty() && SpringBox.isEmpty() && SpikeBox.isEmpty()) {
                            setRing = 0;
                            setHMGMon = 0;
                            setSpike = 0;
                            setEnemy = 0;
                            change = 7;
                            xSonic = 0;
                            ySonic = 400;
                        }
                    }  
                    else if (duck == true) {
                        xSonic-=0;      
                    }
                    //Can't move if firing a shotgun blast
                    else if(powerUp != 2 || powerUp == 2 && Bullet.size() < 1){
                        xSonic+=5;      
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
                    //Checks if player is not colliding with box, if not they can move forward (if they are the player gets pushed back)
                    if ((collide && ySonic+hSonic > (Oof) && spike == 0 && Oof > 0 && ySonic+hSonic < test && jump == 0) && spike == 0 || (collide && ySonic+hSonic > (Oof) && spike == 0 && Oof < 0 && ySonic+hSonic > test+10 && jump == 0) || (collide && ySonic+hSonic > (Oof) && spike == 0 && Oof > 0 && ySonic+hSonic > test+10 && jump == 0) || (CollisionSonic.intersects(GlobalSpikeBox) && spike == 0)) {
                    xSonic += 30;
                    gravity = 1;
                    collide=false;
                    }
                    else if(CollisionSonic.intersects(GlobalPlat) && ySonic+hSonic < test) {
                        collide = false;
                    }
                    else if (xSonic <= 0) {
                        xSonic += 30;
                    }
                    else if (duck == true) {
                        xSonic-=0;      
                    }
                    //Can't move if firing a shotgun blast
                    else if(powerUp != 2 || powerUp == 2 && Bullet.size() < 1){
                        xSonic-=5;      
                    }              
                }
                if(goalPostHit == true) {
                    if(goalPostTimer < 301) {
                        goalPostTimer++;    
                    }
                    if(goalPostTimer > 0 && goalPostTimer < 300) {
                        GoalPost = Toolkit.getDefaultToolkit().getImage("src\\resources\\Goal Post.gif");                        
                    }
                    else if (goalPostTimer >= 300) {
                        if (goalPostTimer == 300){
                        actend = 1;
                        actmusic = -1;
                        aniwag = 0;
                    }
                        GoalPost = Toolkit.getDefaultToolkit().getImage("src\\resources\\SPA Goal Post 5.png");                            
                    }
                }
                if(duck == false && anijump == 0 && rightpress == 0 && leftpress == 0 && actend == 0 && spike == 0 && spring == 0) {
                    g.drawImage(Sonic, xSonic, ySonic, 110, 160, this);    
                }
                if(actend == 0) {
                    drawHUD(g, fontHUD);
                    Debug(g,font1);
                }
                if(actend == 1) {
                    resultScreen(g,fontHUD);
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
        } 
        catch (InterruptedException e) {
        
        }  //captures the exception

    }//close pause method
public void StartUp(Graphics g) {//This method controls the startup animation
    if(starttimer < 500) {
       Tanirun++;   
    }
    if(Tanirun > 60) {
        Tanirun = 0;
    }
    if(starttimer > 0 && starttimer < 200) {
        xTSonic+=10;
    }
    else if(starttimer > 200 && starttimer < 400) {
        Tright = false;
        Tleft = true;
        xTSonic-=10;
    }
    else if(starttimer > 400 && starttimer < 500) {
        Tright = true;
        Tleft = false;
        xTSonic+=10;
    }
    else if(starttimer >= 500 && starttimer < 590) {
        Tright = true;
        Tleft = false;
        xTSonic+=5;
    }
     else if(starttimer > 590 && starttimer < 605) {
        Tright = true;
        Tleft = false;
        xTSonic+=2;
    }
    if(colorswitch == 0 && TSonic != Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Combo 2.png") && TSonic != Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Combo 4.png") && TSonic != Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Combo 7.png") && TSonic != Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Combo 6.png") && TSonic != Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Lean 1.png") && TSonic != Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Lean 2.png")) {
        Logo = Toolkit.getDefaultToolkit().getImage("src\\resources\\GNeoGeo Pocket Color Logo.png");
    }
    else if ((Tanicombo >= 20 && Tanicombo < 40 && colorswitch == 0) || (Tanicombo >= 60 && Tanicombo < 80 && colorswitch == 0) || (Tanicombo >= 120 && Tanicombo < 140 && colorswitch == 0) || (Tanicombo >= 100 && Tanicombo < 120 && colorswitch == 0) || (TSonic != Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Lean 1.png"))) {
        Logo = Toolkit.getDefaultToolkit().getImage("src\\resources\\NeoGeo Pocket Color Logo.png");     
    }
    /*g.drawString("starttimer "+starttimer,100,200);
    g.drawString("Tanirun "+Tanirun,100,300);
    g.drawString("Taniledge "+Taniledge,100,400);
    g.drawString("Taniwait "+Taniwait,100,500);
    g.drawString("Tanicombo "+Tanicombo,100,600);
    g.drawString("Tanilean "+Tanilean,100,700);
    g.drawString("Tanicolor "+Tanicolor,100,100);*/
    g.drawImage(Logo,xLogo,yLogo,wLogo,hLogo,this);
    g.setColor(Color.gray);
    if(starttimer > 0 && starttimer < 180) {
        g.fillRect(xLogo,yLogo,wLogo,hLogo);  
    }
    else if(starttimer >= 180 && starttimer < 400) {
        g.fillRect(xLogo,yLogo+92,wLogo,hLogo-92);  
    }
    else if(starttimer >= 400 && starttimer < 575) {
        g.fillRect(xLogo,yLogo+184,wLogo,hLogo-184);  
    }
    else if(starttimer >= 575 && starttimer < 2000) {
        g.fillRect(xLogo,yLogo+280,wLogo,hLogo-280);  
    }

    if(starttimer < 500) {
        if(Tanirun >= 0 && Tanirun <= 15 && Tright == true && Tleft == false) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TRun 1.png");
            g.drawImage(TSonic, xTSonic, yTSonic, 130, 160, this);
        }
        else if(Tanirun > 15 && Tanirun <= 30 && Tright == true && Tleft == false) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TRun 2.png");
            g.drawImage(TSonic, xTSonic, yTSonic, 130, 160, this);
        }
        else if(Tanirun > 30 && Tanirun <= 45 && Tright == true && Tleft == false) {   
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TRun 3.png");
            g.drawImage(TSonic, xTSonic, yTSonic, 130, 160, this);
        }
        else if(Tanirun > 45 && Tanirun <= 60 && Tright == true && Tleft == false) {   
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TRun 4.png");
            g.drawImage(TSonic, xTSonic, yTSonic, 130, 160, this);
        }
        if(Tanirun >= 0 && Tanirun <= 15 && Tright == false && Tleft == true) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic TRun 1.png");
            g.drawImage(TSonic, xTSonic, yTSonic, 130, 160, this);
        }
        else if(Tanirun > 15 && Tanirun <= 30 && Tright == false && Tleft == true) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic TRun 2.png");
            g.drawImage(TSonic, xTSonic, yTSonic, 130, 160, this);
        }
        else if(Tanirun > 30 && Tanirun <= 45 && Tright == false && Tleft == true) {   
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic TRun 3.png");
            g.drawImage(TSonic, xTSonic, yTSonic, 130, 160, this);
        }
        else if(Tanirun > 45 && Tanirun <= 60 && Tright == false && Tleft == true) {   
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic TRun 4.png");
            g.drawImage(TSonic, xTSonic, yTSonic, 130, 160, this);
        }    
    }
    else if(starttimer >= 500 && starttimer < 605)    {
       TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TSkid 1.png");   
        g.drawImage(TSonic, xTSonic, yTSonic, 140, 160, this);
        yTSonic = 305;
    }
    else if(starttimer >= 575 && starttimer < 750)    {
        TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TStand 1.png");   
        g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this);
        yTSonic = 305;
    }
    else if(starttimer >= 750 && starttimer < 825)    {
        TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TWrist 1.png");   
        g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this);
        yTSonic = 305;
    }
    else if(starttimer >= 825 && starttimer < 1100)    {
        Taniledge++;
        if(Taniledge >= 60) {
            Taniledge = 0;
        }
        if(Taniledge >= 0 && Taniledge < 20) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TLedge 1.png");   
            g.drawImage(TSonic, xTSonic, yTSonic, 140, 160, this);
            yTSonic = 305;   
        }
        else if(Taniledge >= 20 && Taniledge < 40) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TLedge 2.png");   
            g.drawImage(TSonic, xTSonic-2, yTSonic, 140, 160, this);
            yTSonic = 305;   
        }
        else if(Taniledge >= 40 && Taniledge < 60) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TLedge 3.png");   
            g.drawImage(TSonic, xTSonic-2, yTSonic, 140, 160, this);
            yTSonic = 305;   
        }
    }
    else if(starttimer >= 1100 && starttimer < 1300)    {
        TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TStand 1.png");   
        g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this);
        yTSonic = 305;
    }
    else if(starttimer >= 1300 && starttimer < 1500) {
        Taniwait++;
        if(Taniwait >= 40) {
            Taniwait = 0;
        }
        if(Taniwait >= 0 && Taniwait < 20) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TStand 4.png");   
            g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this); 
        }
        else if(Taniwait >= 20 && Taniwait < 40) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TStand 5.png");   
            g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this); 
        }
    }
    else if(starttimer >= 1500 && starttimer < 1550) {
        TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic TWag 1.png");   
        g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this); 
    }
    else if(starttimer >= 1550 && starttimer < 1600) {
        TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic TStand 1.png");   
        g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this); 
    }
    else if(starttimer >= 1600 && starttimer < 2200) {
        Tanicombo++;
        if(Tanicombo >= 160) {
            Tanicombo = 0;
        }
        if(Tanicombo >= 0 && Tanicombo < 20) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic TCombo 1.png");   
            g.drawImage(TSonic, xTSonic, yTSonic, 140, 160, this); 
        }
        else if(Tanicombo >= 20 && Tanicombo < 40) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Combo 2.png");      
            g.drawImage(TSonic, xTSonic, yTSonic, 140, 160, this);  
        }
        else if(Tanicombo >= 40 && Tanicombo < 60) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic TCombo 3.png");   
            g.drawImage(TSonic, xTSonic, yTSonic, 140, 160, this);  
        }
        else if(Tanicombo >= 60 && Tanicombo < 80) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Combo 4.png");   
            g.drawImage(TSonic, xTSonic, yTSonic, 140, 160, this); 
        }
        else if(Tanicombo >= 80 && Tanicombo < 100) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic TCombo 5.png");  
            yTSonic = 310;
            g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this); 
        }
        else if(Tanicombo >= 100 && Tanicombo < 120) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Combo 6.png"); 
            yTSonic = 310;
            g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this);  
        }
        else if(Tanicombo >= 120 && Tanicombo < 140) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Combo 7.png");
            yTSonic = 305;
            g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this);
        }
        else if(Tanicombo >= 140 && Tanicombo < 160) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic TCombo 8.png");   
            g.drawImage(TSonic, xTSonic, yTSonic, 110, 160, this);  
        }      
    }
    if(starttimer >= 1900 && starttimer < 2050) {
        g.fillRect(xLogo,yLogo+184,wLogo+500,hLogo-184);   
    }
    else if(starttimer >= 2050 && starttimer < 2200) {
        g.fillRect(xLogo,yLogo+92,wLogo+500,hLogo-92);  
    }
    else if(starttimer >= 2200 && starttimer < 2400) {
        g.fillRect(xLogo,yLogo,wLogo+500,hLogo);     
    }
    if(starttimer >= 2400) {
        Tanilean ++;
        if(Tanilean >= 40) {
            Tanilean = 0;
        }   
        if(Tanilean >= 0 && Tanilean < 20) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Lean 1.png");   
            g.drawImage(TSonic, xTSonic-45, yTSonic, 110, 160, this);      
        }
        else if(Tanilean >= 20 && Tanilean < 40) {
            TSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Lean 2.png");   
            g.drawImage(TSonic, xTSonic-45, yTSonic, 110, 160, this);      
        }    
    }
    if(starttimer >= 2400 && starttimer < 2500) {
        g.fillRect(xLogo,yLogo+92,wLogo+500,hLogo-92);   
    }
    else if(starttimer >= 2500 && starttimer < 2600) {
       g.fillRect(xLogo,yLogo+184,wLogo+500,hLogo-184); 
    }
    else if(starttimer >= 2600 && starttimer < 2700) {
         g.fillRect(xLogo,yLogo+280,wLogo,hLogo-280);    
    }
    if(starttimer >= 2700) {
        if(Tanicolor < 99 && title == -1) {
            Tanicolor++;   
        }
        if(Tanicolor >= 0 && Tanicolor < 20) {
            ImageColor = Toolkit.getDefaultToolkit().getImage("src\\resources\\Color Logo 1.png");   
            g.drawImage(ImageColor, 575, 500, 390, 66, this);    
        }
        else if(Tanicolor >= 20 && Tanicolor < 40) {
        ImageColor = Toolkit.getDefaultToolkit().getImage("src\\resources\\Color Logo 2.png");   
        g.drawImage(ImageColor, 575, 500, 390, 66, this);    
        }
        else if(Tanicolor >= 40 && Tanicolor < 60) {
        ImageColor = Toolkit.getDefaultToolkit().getImage("src\\resources\\Color Logo 3.png");   
        g.drawImage(ImageColor, 575, 500, 390, 66, this);      
        }
        else if(Tanicolor >= 60 && Tanicolor < 80) {
            ImageColor = Toolkit.getDefaultToolkit().getImage("src\\resources\\Color Logo 4.png");   
            g.drawImage(ImageColor, 575, 500, 390, 66, this);    
        }
        else if(Tanicolor >= 80 && Tanicolor < 100) {
            ImageColor = Toolkit.getDefaultToolkit().getImage("src\\resources\\Color Logo 5.png");   
            g.drawImage(ImageColor, 575, 500, 390, 66, this);     
        }
    }
    if(starttimer >= 2850 && startsound == 0) {
        playMusic();
        startsound = 1;
    }
    if(starttimer >= 3400) {
        title = 0;
        starttimer = 0;
    }
      
}
public void TitleScreen(Graphics g) {
     Font font2 = new Font("Comic Sans MS",Font.BOLD,20); //creates a font setting for text on screen
    g.setFont(font2); 
    if(title == 0) {
        g.drawImage(TBackground,0,0,1296,936,this);
        g.drawImage(TBackground,1296,0,1296,936,this);   
    }
    if(title == 0) {
       Groundtimer++;  
    }
    xGround -=20;
    xTTree-=2;
    if(Groundtimer % 12 == 0) {
       xGround = 0;
    }
    if(Groundtimer % 250 == 0) {
       xTTree = 200;  
    }
    
    g.drawImage(Ground, xGround, yGround,wGround, hGround, this);
    g.drawImage(Ground, xGround+wGround, yGround,wGround, hGround, this);
    g.drawImage(Ground, xGround+(wGround*2), yGround,wGround, hGround, this);  
    g.drawImage(Ground, xGround+(wGround*3), yGround,wGround, hGround, this); 
    g.drawImage(Palmtree, xTTree, 360, 200, 400, this);   
    g.drawImage(Palmtree, xTTree+500, 360, 200, 400, this);  
    g.drawImage(Palmtree, xTTree+1000, 360, 200, 400, this);  
    g.drawImage(Palmtree, xTTree+1500, 360, 200, 400, this); 
    TitleTop = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic 2 Title Sprite Top.png");
    TitleBottom = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic 2 Title Sprite Base Custom.png");
    Tails = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Tails Celebrate 1.png");
    g.drawImage(TitleTop, xTitleTop, yTitleTop, 1024, 280, this);  
    if(tailsstart == 1) {
        g.drawImage(Tails, xTails, yTails, 319, 297, this);      
    }
    xSonic = 425;
    if(wagstart == 0) {
        ySonic = 200;
        wagstart = 1;     
    }
    else if (wagstart == 1 && ySonic > 110) {
        ySonic -=4;
    }
    if(tailsstart == 0) {
        yTails = 220;
    }
    if(ySonic == 108) {
        tailsstart = 1;
    }
    if(tailsstart == 1 && yTails > 115) {
        yTails -=4;
    }
    wagW = 220;
    wagH = 320;
    wagAdd = 5;
    Wag(g);
    aniwag++;  
    if(aniwag > 200) {
        aniwag = 0;     
    }
    if(titlerun >= 0 && titlerun <= 5) {
        TitleRun = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 1.png");
        g.drawImage(TitleRun, 700, 600, 130, 160, this);
    }
    else if(titlerun > 5 && titlerun <= 10) {
        TitleRun = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 2.png");
        g.drawImage(TitleRun, 700, 600, 130, 160, this);
    }
    else if(titlerun > 10 && titlerun <= 15) {
        TitleRun = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 3.png");
        g.drawImage(TitleRun, 700, 600, 131, 160, this);
    }
    else if(titlerun > 15 && titlerun <= 20) {
        TitleRun = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 4.png");
        g.drawImage(TitleRun, 700, 600, 130, 160, this);
    }
    if(titlerun >= 20) {
        titlerun = 0;
    }
    g.drawImage(Copyright,990,760,524,32,this);
    //g.drawString("titlerun "+titlerun,25, 700);
    g.drawImage(TitleBottom, xTitleBottom, yTitleBottom, 888, 300, this);   
    /*g.drawString("tailsstart "+tailsstart, 50, 400);
    g.drawString("ySonic "+ySonic, 50, 500);
    g.drawString("Groundtimer "+Groundtimer, 50, 600);
    g.drawString("xTTree "+xTTree, 50, 100);*/
}       
public void Debug(Graphics g, Font font1) {//Draws the debug screen where I can see all of my variables
    if(debug > 0) {
        g.setFont(font1);
        g.setColor(Color.white);
        g.drawString("Debug",700,50);
        g.drawString("Debug: "+debug,800,50); 
    } 
    if(debug == 1) {
        g.drawString("wide: "+wide,300,100);
        g.drawString("high: "+high,300,125);
        g.drawString("xSonic: "+xSonic,300,150);
        g.drawString("ySonic: "+ySonic,300,175);
        g.drawString("wSonic: "+wSonic,300,200);
        g.drawString("hSonic: "+hSonic,300,225);
        g.drawString("ySonic+hSonic: "+(ySonic+hSonic),300,250);
        g.drawString("ySonic-hSonic: "+(ySonic-hSonic),300,275);
        g.drawString("collide: "+collide,300,300);
        g.drawString("ground: "+ground,300,325);
        g.drawString("left: "+left,300,350);
        g.drawString("right: "+right,300,375);
        g.drawString("duck: "+duck,300,400);
        g.drawString("duckcheck: "+duckcheck,300,425);
        g.drawString("leftpress: "+leftpress,300,450);
        g.drawString("rightpress: "+rightpress,300,475);
        g.drawString("xpress: "+xpress,300,500);
        g.drawString("collisioncheck: "+collisioncheck,300,525);
        g.drawString("waittimer: "+waittimer,300,550);
        g.drawString("gravity: "+xpress,300,575);
        g.drawString("jump: "+jump,300,600);
        g.drawString("jumpheight: "+jumpheight,300,625);
        g.drawString("ringsCollected: "+ringsCollected,300,650);
        g.drawString("score: "+score,300,675);
        g.drawString("lives: "+lives,300,700);
        g.drawString("pittrigger: "+pittrigger,300,725);
        g.drawString("actend: "+actend,300,750);
        g.drawString("spike: "+spike,700,100);
        g.drawString("spiketimer: "+spiketimer,700,125);
        g.drawString("spikemusic: "+spikemusic,700,150);
        g.drawString("spikeinvince: "+spikeinvince,700,175);
        g.drawString("notwait: "+notwait ,700,200);
        g.drawString("spring: "+spring,700,225);
        g.drawString("springtimer: "+springtimer,700,250);                         
    }
    else if(debug == 2) {
        g.setColor(Color.cyan);
        g.drawString("wagW: "+wagW,300,100); 
        g.drawString("wagH: "+wagH,300,125);
        g.drawString("wagAdd: "+wagAdd,300,150);
        g.drawString("wagstart: "+wagstart,300,175);
        g.drawString("aniblink: "+aniblink,300,200);
        g.drawString("anijump: "+anijump,300,225);
        g.drawString("anirun: "+anirun,300,250);
        g.drawString("aniwag: "+aniwag,300,275);
    }           
    else if(debug == 3) {
        g.setColor(Color.white);
        g.drawString("powerUp: "+powerUp,300,100);
        g.drawString("ammo: "+ammo,300,125);
        g.drawString("HMG",300,150);
        g.drawString("Music",700,100);
        g.drawString("Extras",1100,100);
        Color darkred = new Color (102,0,0);
        Color darkgreen = new Color (51,102,0);
        Color darkblue = new Color (0,0,102);
        g.setColor(darkred);
        g.drawString("BulletDelay: "+BulletDelay,300,175);
        g.drawString("BulletCollide: "+BulletCollide,300,200);
        g.drawString("BulletDirection: "+BulletDirection,300,225);
        g.drawString("# of bullets: "+Bullet.size(),300,250);
        g.setColor(darkgreen);
        g.drawString("musicstart: "+musicstart,700,125);
        g.drawString("actmusic: "+actmusic,700,150);
        g.drawString("filepath: "+filepath,700,175);
        g.drawString("totalmusic: "+totalmusic,700,200);
        g.setColor(darkblue);
        g.drawString("change: "+change,1100,125);
        g.drawString("title: "+title,1100,150);
        g.drawString("ringSet: "+setRing,1100,175);
        g.drawString("setHMGMon: "+setHMGMon,1100,200);
        g.drawString("setShotMon: "+setShotMon,1100,225);
        g.drawString("setRingMon: "+setRingMon,1100,250);
        g.drawString("setSpring: "+setSpring,1100,275);
        g.drawString("setSpike: "+setSpike,1100,300);
        g.drawString("setEnemy: "+setEnemy,800,300);
        g.drawString("continuetimer: "+continueCutsceneTimer,1100,325);
        g.drawString("continueselect: "+continueSelect,1100,350);
        g.drawString("goalPostHit: "+goalPostHit,1100,375);
        g.drawString("goalPostTimer: "+goalPostTimer,1100,400);
        g.drawString("actFade: "+actFadeTimer,1100,425);
        g.drawString("secondTimer: "+secondTimer,1100,450);
        g.drawString("minuteTimer: "+minuteTimer,1100,475);
        g.drawString("timeScore: "+timeScore,1100,500);
        g.drawString("number of Spikes: "+SpikeBox.size(),1100,525);
        g.drawString("number of bullets: "+EnemyBullet.size(),1100,550);
        g.drawString("setEnemyBullets: "+setEnemyBullet,1100,575);
        g.drawString("EnemyBulletDelay: "+EnemyBulletDelay,1100,600);
    }
    else if(debug == 4) {
        g.setColor(Color.white);
        g.drawString("Box1",300,100);
        g.drawString("Box2",300,225);
        g.drawString("Box3",300,350);
        g.drawString("Box4",300,475);
        g.drawString("Box4",300,475);
        g.drawString("Box5",300,600);
        g.drawString("Spike",700,100);
        g.drawString("Spike2",700,225);
        g.drawString("Spring",700,300);
        g.drawString("RingBox",700,425);
        g.drawString("Plat1",1100,100);
        g.drawString("Plat1",1100,225);
        g.drawString("Global Variables",1100,350);
        g.setColor(Color.pink);
        g.drawString("xBox1: "+xBox1,300,125);
        g.drawString("yBox1: "+yBox1,300,150);
        g.drawString("wBox1: "+wBox1,300,175);
        g.drawString("hBox1: "+hBox1,300,200);
        g.drawString("xBox2: "+xBox2,300,250);
        g.drawString("yBox2: "+yBox2,300,275);
        g.drawString("wBox2: "+wBox2,300,300);
        g.drawString("hBox2: "+hBox2,300,325);
        g.drawString("xBox3: "+xBox3,300,375);
        g.drawString("yBox3: "+yBox3,300,400);
        g.drawString("wBox3: "+wBox3,300,425);
        g.drawString("hBox3: "+hBox3,300,450);
        g.drawString("xBox4: "+xBox4,300,500);
        g.drawString("yBox4: "+yBox4,300,525);
        g.drawString("wBox4: "+wBox4,300,550);
        g.drawString("hBox4: "+hBox4,300,575);
        g.drawString("xBox5: "+xBox5,300,625);
        g.drawString("yBox5: "+yBox5,300,650);
        g.drawString("wBox5: "+wBox5,300,675);
        g.drawString("hBox5: "+hBox5,300,700);
        g.drawString("wSpike: "+wSpike,700,175);
        g.drawString("hSpike: "+hSpike,700,200);
        g.drawString("xSpring: "+xSpring,700,325);
        g.drawString("ySpring: "+ySpring,700,350);
        g.drawString("wSpring: "+wSpring,700,375);
        g.drawString("hSpring: "+hSpring,700,400);
        g.drawString("wRingBox: "+wMon,700,500);
        g.drawString("hRingBox: "+hMon,700,525);
        g.drawString("boxSound: "+boxSound,700,575);
        g.drawString("xPlat1: "+xPlat1,1100,125);
        g.drawString("yPlat1: "+yPlat1,1100,150);
        g.drawString("wPlat1: "+wPlat1,1100,175);
        g.drawString("hPlat1: "+hPlat1,1100,200);
        g.drawString("xPlat2: "+xPlat2,1100,250);
        g.drawString("yPlat2: "+yPlat2,1100,275);
        g.drawString("wPlat2: "+wPlat2,1100,300);
        g.drawString("hPlat2: "+hPlat2,1100,325);
        g.drawString("hPlat1: "+hPlat1,1100,375);
        g.drawString("xGlobalSpike: "+xGlobalSpikeBox,1100,400);
        g.drawString("yGlobalSpike: "+yGlobalSpikeBox,1100,425);
        g.drawString("xGlobalSpring: "+xGlobalSpringBox,1100,450);
        g.drawString("yGlobalRingBox: "+yGlobalHMGMon,1100,475);
        g.drawString("xGlobalPlat: "+xGlobalPlat,1100,500);
        g.drawString("yGlobalPlat: "+yGlobalPlat,1100,525);
        g.drawString("wGlobalPlat: "+wGlobalPlat,1100,550);
        g.drawString("hGlobalPlat: "+hGlobalPlat,1100,575);            
    }
    else if(debug == 5) {
        g.setColor(Color.white);
        g.drawString("Global Rectangles",300,100);
        Color lightblue = new Color (51,255,238);
        g.setColor(lightblue);
        g.drawString("GlobalSpike: "+GlobalSpikeBox,300,125);
        g.drawString("GlobalSpring: "+GlobalSpringBox,300,150);
        g.drawString("GlobalRingBox: "+GlobalSpringBox,300,175);
        g.drawString("GlobalPlat: "+GlobalPlat,300,200);
    }  
}
public void Spring(Graphics g) {//Changes Sonic's animation when he is in a spring state
    if(duck == false && jump == 0 && spike == 0 && left == false && right == true && spring == 1) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Spring 1.png");
        g.drawImage(Sonic, xSonic, ySonic, 110, 160, this);
    }
    else if(duck == false && jump == 0 && spike == 0 && left == true && right == false && spring == 1) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Spring 1.png");
        g.drawImage(Sonic, xSonic, ySonic, 110, 160, this);
    }
}
public void Hit(Graphics g) {//Changes Sonic's animation when he is in a spike state
    if(duck == false && left == false && right == true && jump == 0 && spike == 1 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Hit.png"); 
        g.drawImage(Sonic, xSonic, ySonic+60, 160, 120, this);
    }
    if(duck == false && left == true && right == false && jump == 0 && spike == 1 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Hit.png");
        g.drawImage(Sonic, xSonic, ySonic+60, 160, 120, this);
    }
}
public void Wag(Graphics g) {//Changes Sonic's animation to wagging his finger
    if(duck == false && left == false && right == true && jump == 0 && aniwag >= 0 && aniwag < 100) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Wag 1.png");
        g.drawImage(Sonic, xSonic, ySonic, wagW, wagH, this);    
    }
    else if(duck == false && left == false && right == true && jump == 0 && aniwag >= 100 && aniwag <= 200) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Wag 2.png");
        g.drawImage(Sonic, xSonic-5, ySonic, wagW+wagAdd, wagH, this);
    }
    if(duck == false && left == true && right == false && jump == 0 && aniwag >= 0 && aniwag < 100) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Wag 1.png");
        g.drawImage(Sonic, xSonic, ySonic, wagW, wagH, this);    
    }
    else if(duck == false && left == true && right == false && jump == 0 && aniwag >= 100 && aniwag <= 200) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Wag 2.png");
        g.drawImage(Sonic, xSonic, ySonic, wagW+wagAdd, wagH, this);
    }
}
public void Run(Graphics g) {//Changes Sonic's animation when he is running
    
    if(duck == false && left == false && right == true && jump == 0 && leftpress == 0 && rightpress == 1  && anirun >= 0 && anirun <= 10 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 1.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == false && right == true && jump == 0 && leftpress == 0 && rightpress == 1 && anirun > 10 && anirun <= 20 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 2.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == false && right == true && jump == 0 && rightpress == 1 && leftpress == 0 && anirun > 20 && anirun <= 30 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 3.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == false && right == true && jump == 0 && rightpress == 1 && leftpress == 0 && anirun > 30 && anirun <= 40 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 4.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    if(duck == false && left == true && right == false && jump == 0 && leftpress == 1 && rightpress == 0 && anirun >= 0 && anirun <= 10 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Run 1.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == true && right == false && jump == 0 && leftpress == 1 && rightpress == 0 && anirun > 10 && anirun <= 20 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Run 2.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == true && right == false && jump == 0 && leftpress == 1 && rightpress == 0 && anirun > 20 && anirun <= 30 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Run 3.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
    else if(duck == false && left == true && right == false && jump == 0 && leftpress == 1 && rightpress == 0 && anirun > 30 && anirun <= 40 && spring == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Run 4.png");
        g.drawImage(Sonic, xSonic, ySonic, 130, 160, this);
    }
}
public void Duck(Graphics g) {//Changes Sonic's animation when he is ducking
    if(duck == true && left == false && right == true) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Duck 1.png");
        g.drawImage(Sonic, xSonic+12, ySonic-15, 120, 100, this);
    }
    if(duck == true && left == true && right == false) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Duck 1.png");
        g.drawImage(Sonic, xSonic, ySonic-15, 120, 100, this);
    }
}
public void Jump(Graphics g, int anijump) {//Changes Sonic's animation when he is jumping
    if(duck == false && left == false && right == true && anijump%10 == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 1.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 1) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 2.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 2) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 3.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 3) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 4.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 4) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 5.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 5) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 1.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 6) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 2.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 7) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 3.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 8) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 4.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == false && right == true && anijump%10 == 9) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Jump 5.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    if(duck == false && left == true && right == false && anijump%10 == 0) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 1.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 1) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 2.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 2) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 3.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 3) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 4.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 4) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 5.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 5) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 1.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 6) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 2.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 7) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 3.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 8) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 4.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
    else if(duck == false && left == true && right == false && anijump%10 == 9) {
        Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Jump 5.png");
        g.drawImage(Sonic, xSonic+12, ySonic+60, 120, 100, this);
    }
}
public void Blink(Graphics g, int aniblink) {//Changes Sonic's animation when he is waiting too long
    if (right == true && left == false && duck == false){
        if (aniblink == 800){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Stand 2.png");
        }
        else if (aniblink == 850){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Stand 3.png");
        }
        else if (aniblink%100 == 0 && aniblink  >= 900 && aniblink < 2000){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Stand 4.png");
        }
        else if (aniblink%100 == 50 && aniblink  >= 900 && aniblink < 2000){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Stand 5.png");
        }   
        else if (aniblink >= 2000 && aniblink < 2100){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Wrist 1.png");
         }
    }
    if (right == false && left == true && duck == false){
        if (aniblink == 800){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Stand 2.png");
        }
        else if (aniblink == 850){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Stand 3.png");
        }
        else if (aniblink%100 == 0 && aniblink  >= 900 && aniblink < 2000){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Stand 4.png");
        }
        else if (aniblink%100 == 50 && aniblink  >= 900 && aniblink < 2000){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Stand 5.png");
        }   
        else if (aniblink >= 2000 && aniblink < 2100){
            Sonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\LNeo Sonic Wrist 1.png");
        }    
    }     
}
public static boolean collision(Graphics g) {//Changes the value of Oof depending on what boxes Sonic is colliding with   
    boolean collide=false; 
    if(CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3)&& !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalRingMon)) {
        test = Box1.y;
        collide=true;         
    }  
    else if(CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box3)&& !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox)&& !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon)) {
        test = Box2.y;
        collide=true;         
    }  
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox)&& !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && !CollisionSonic.intersects(GlobalHMGMon)) {
        test = Box3.y;
        collide=true;         
    }
    else if(CollisionSonic.intersects(Box1) && CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox)&& !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        if(change == 4) {
            test = Box1.y;      
        } 
        collide=true;         
    }
    else if(!CollisionSonic.intersects(Box1) && CollisionSonic.intersects(Box2) && CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox)&& !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        if(change == 4) {
            test = Box2.y;   
        } 
            collide=true;         
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        test = Box4.y;
        collide=true;         
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && CollisionSonic.intersects(Box3) && CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        if(change == 1) {
            test = Box3.y;
        }
        else if(change == 4) {
            test = Box3.y;
        }
        collide=true;         
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3)&& !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        test = yBox5;
        collide=true;         
    }  
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && ySonic+hSonic > yGlobalSpikeBox) {
        test = yGlobalSpikeBox;
    }
    else if(CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && ySonic+hSonic > yGlobalSpikeBox) {       
        collide = true;
    }
    else if(CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        test = yBox1;
        collide=true;
    }
    else if(CollisionSonic.intersects(Box1) && CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        test = yBox1;
        collide=true;
    }
     else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        if(change == 4) {
            test = Box4.y;   
        }
        collide=true;
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && CollisionSonic.intersects(GlobalSpringBox) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        test = yGlobalSpringBox;
        collide=true;
    }
    else if(CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        test = yGlobalHMGMon;
        collide=true;
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        test = yGlobalHMGMon;
        collide=true;
    }
    else if(!CollisionSonic.intersects(Box1) && CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon)) {
        test = yGlobalHMGMon;
        collide=true;
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon) && CollisionSonic.intersects(Plat1) && !CollisionSonic.intersects(Plat2)) {
        test = yGlobalPlat;
        collide=true;
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon) && !CollisionSonic.intersects(Plat1) && CollisionSonic.intersects(Plat2)) {
        test = yGlobalPlat;
        collide=true;
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && !CollisionSonic.intersects(GlobalHMGMon) && CollisionSonic.intersects(GlobalShotMon) && !CollisionSonic.intersects(Plat1) && !CollisionSonic.intersects(Plat2)) {
        test = yGlobalShotMon;
        collide=true;
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && !CollisionSonic.intersects(GlobalHMGMon) && CollisionSonic.intersects(GlobalShotMon) && !CollisionSonic.intersects(Plat1) && !CollisionSonic.intersects(Plat2)) {
        test = yGlobalShotMon;
        collide=true;
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && !CollisionSonic.intersects(GlobalHMGMon) && CollisionSonic.intersects(GlobalShotMon) && CollisionSonic.intersects(Plat1)) {
        test = yGlobalShotMon;
        collide=true;
    }
    else if(!CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon) && CollisionSonic.intersects(GlobalRingMon) && !CollisionSonic.intersects(Plat1) && !CollisionSonic.intersects(Plat2)) {
        test = yGlobalRingMon;
        collide=true;
    }
    else if(CollisionSonic.intersects(Box1) && !CollisionSonic.intersects(Box2) && !CollisionSonic.intersects(Box3) && !CollisionSonic.intersects(Box4) && !CollisionSonic.intersects(GlobalSpikeBox) && !CollisionSonic.intersects(Box5) && !CollisionSonic.intersects(GlobalSpringBox) && !CollisionSonic.intersects(GlobalHMGMon) && !CollisionSonic.intersects(GlobalShotMon) && CollisionSonic.intersects(GlobalRingMon) && !CollisionSonic.intersects(Plat1) && !CollisionSonic.intersects(Plat2)) {
        test = yGlobalRingMon;
        collide=true;
    }
    if(CollisionSonic.intersects(GoalPostBox)) {
        goalPostHit = true;
    }
    return collide;    
    }
//Each one draws is respective box
public void Box1(Graphics g) {     
    g.setColor(Color.black);
    g.fillRect(Box1.x,Box1.y,Box1.width,Box1.height);
}
public void Box2(Graphics g) {
    g.setColor(Color.blue);
    g.fillRect(Box2.x,Box2.y,Box2.width,Box2.height);
}
public void Box3(Graphics g) {
    g.setColor(Color.green);
    g.fillRect(Box3.x,Box3.y,Box3.width,Box3.height);
}
public void Box4(Graphics g) {
    g.setColor(Color.cyan);   
    g.fillRect(Box4.x,Box4.y,Box4.width,Box4.height);
}
public void actionPerformed(ActionEvent e) {
    
    }

public void keyTyped(KeyEvent e) {
    
    }
public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == e.VK_DOWN && jump == 0) {//Sonic stops ducking and stands up        
        notwait = 1;
        aniblink = 0;
        waittimer = 0;
        if(duckcheck == 1) {
            duckcheck = -1;
        }
        duck = false;        
    }
    if (e.getKeyCode() == e.VK_RIGHT && jump == 0) {//Tells program that the right key is released        
       rightpress = 0;
       anirun = 0;
    }
    if (e.getKeyCode() == e.VK_RIGHT && jump == 1) {//Tells program that the right key is released when sonic is jumping        
       rightpress = 0;
       anirun = 0;
    }
    if (e.getKeyCode() == e.VK_LEFT && jump == 0) {//Tells program that the left key is released         
       leftpress = 0;
       anirun = 0;
    }
    if (e.getKeyCode() == e.VK_LEFT && jump == 1) {//Tells program that the left key is released when sonic is jumping         
     leftpress = 0;
     anirun = 0;
    }
    if (e.getKeyCode() == e.VK_X && duck == false) {        
    xpress = 0;
    }
}        
public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == e.VK_RIGHT && actend == 0 && spike == 0 && title == 1) {//Tells program right key is pressed
        rightpress=1;
        leftpress = 0;
    }
    if (e.getKeyCode() == e.VK_LEFT && actend == 0 && spike == 0 && title == 1) {//Tells program left key is pressed    
        leftpress = 1;  
        rightpress = 0;
    }

    /*if (e.getKeyCode() == e.VK_UP && actend == 0 && spike == 0 && title == 1) {
         ySonic-=100;
    }*/
    if (e.getKeyCode() == e.VK_DOWN && jump == 0 && actend == 0 && spike == 0 && title == 1 && spring == 0) {//Sonic ducks and can't move
        //left or right
        duck = true;
        BulletDelay = 0;
        xpress = 0;
        if(duckcheck == -2) {
            duckcheck = 0;
        }
    }
    if (e.getKeyCode() == e.VK_Z && title == 1 && actend == 0 && duck == false) {//Sonic jumps
        collisioncheck = 1;
        if (collide) {
            ySonic -= 20;
            collide=false;
        }
        if(jump==0 && duck == false && ground == true && actend == 0 && spike == 0) {
            gravity = -45;
            jumpheight = -45;
            jump = 1; 
        }
    }
    if(e.getKeyCode() == e.VK_X && e.getKeyCode() != e.VK_DOWN && title == 1 && actend == 0 && duck == false && spike == 0 && spring == 0) {//Sonic shoots (if he has a powerup)
        xpress = 1;        
    }
    /*if (e.getKeyCode() == e.VK_C && title == 1) {
        aniwag = 0;
        change = 6;
        setRing = 0;
        musicstart = -1;
        totalmusic = -1;
        actmusic = -1;
        actend = 0;
    }
    if (e.getKeyCode() == e.VK_V && title == 1) {
        aniwag = 0;
        change = 1;
        musicstart = 0;
        setRing = 0;
        setSpike = 0;
        actend = 0;
    }
    if (e.getKeyCode() == e.VK_B && title == 1) {
        change = 2;
        setHMGMon = 0;
        setEnemy = 0;
        setRingMon = 0;
    }      
    if (e.getKeyCode() == e.VK_N && title == 1 && lives > 0) {
        actend = 1;
        actmusic = -1;
        aniwag = 0;
    }  
    if (e.getKeyCode() == e.VK_M && title == 1) {
        change = 3;
        setShotMon = 0;
    } 
    if (e.getKeyCode() == e.VK_COMMA && title == 1) {
        change = 4;
    }
    if (e.getKeyCode() == e.VK_PERIOD && title == 1) {
        lives = 0;
    }*/  
    //Controls the start up screen and the title screen
    if (e.getKeyCode() == e.VK_ENTER && title == -1 && !clip.isRunning()) {
        title = 0;
    }   
    else if (e.getKeyCode() == e.VK_ENTER && title == 0 && !clip.isRunning()) {
        title = 1;
        xSonic = 50;
        ySonic = 430;
        wagW = 110;
        wagH = 160;
        musicstart = -1;
    }
    //Controls if the player says yes or no on the Continue Screen
    else if(e.getKeyCode() == e.VK_Y && continueSelect == 0 && lives == 0 && title == 1 && Canicontinue == 70 && continueOptionTimer > 0) {
        continueSelect = 1;
    }  
    else if(e.getKeyCode() == e.VK_N && continueSelect == 0 && lives == 0 && title == 1 && Canicontinue == 70 && continueOptionTimer > 0) {
        System.exit(0);
    }  
    if (e.getKeyCode() == e.VK_E && title == 1 && debug < 5) {
       debug++;
    }
    if (e.getKeyCode() == e.VK_Q && title == 1 && debug > 0) {
       debug--;
    }
}//end keypressed
public void playMusic() {//plays music (that pretty much it :D
     if(startsound == 0 && title == -1) {
        music = "src\\resources\\music files\\Start Up.wav";
    }
    else if(musicstart == -2 && actend == 0 && spike == 0 && title == 0) {
        music = "src\\resources\\music files\\Title Screen.wav";
    }
    else if(musicstart == -1 && actend == 0) {
       music = "src\\resources\\music files\\Green Grove Zone.wav";
    }
    else if(actend == 1 && actmusic == 0) {
       music = "src\\resources\\music files\\Act Clear SPA.wav";
    }
    else if(totalmusic == -1 && actmusic == 1 && lives > 0) {
       music = "src\\resources\\music files\\Score Tally.wav";
    }
    else if(lives == 0) {
       music = "src\\resources\\music files\\Continue.wav";
    }
    try {
        if (startsound == 0 && title == -1 && lives > 0) {
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
        else if (musicstart == -2 && actend == 0 && lives > 0) {
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
        else if (musicstart == -1 && actend == 0 && lives > 0) {
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
        else if (musicstart == 0 && actend == 0 && lives > 0) {
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
        else if(actend == 0 && boxSound == 0 && lives > 0) {
            File musicPath = new File(music);//creates File object which has path of musicLocation
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
            //for bringing the music from the music file to our Java application (gets that from the musicPath object)
            boxEffect = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
            boxEffect.open(audioInput);//opens music
            boxEffect.start();
            Thread.sleep(300);//stops thread (that is created by the clip class)
        }
        else if(lives == 0 && continuemusic == -1 || actend == 1 && actmusic == -1) {
            clip.close();
        }
        else if(actend == 1 && lives > 0 && actmusic == 0) {
            clip.close();
            File musicPath = new File(music);//creates File object which has path of musicLocation
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
            //for bringing the music from the music file to our Java application (gets that from the musicPath object)
            clip = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
            clip.open(audioInput);//opens music
            clip.start();
            Thread.sleep(300);//stops thread (that is created by the clip class)
        }
        else if(lives == 0 && continuemusic == 0) {
            File musicPath = new File(music);//creates File object which has path of musicLocation
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
            //for bringing the music from the music file to our Java application (gets that from the musicPath object)
            clip = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
            clip.open(audioInput);//opens music
            clip.start();
        }
        else if(lives > 0 && totalmusic == -1 && actend == 1 && actmusic == 1) {
            File musicPath = new File(music);//creates File object which has path of musicLocation
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
            //for bringing the music from the music file to our Java application (gets that from the musicPath object)
            clip = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
            clip.open(audioInput);//opens music
            clip.start();
        }
        else {
            JOptionPane.showMessageDialog(null,"The file was not found");//doesn't play if it cant find the file 
        }
    } catch (Exception ex) {
            ex.printStackTrace();// /printStackTrace prints out error message
    }
}   
public void drawEnvironment(Graphics g) {//draws the level based on the change value
    g.setColor(Color.blue);
    g.fillRect(0,0,1600,800);
    g.drawImage(Cloud,200,300,240,112,this);
    g.drawImage(Cloud,600,300,240,112,this);
    g.drawImage(Cloud,1000,300,240,112,this);
    g.drawImage(Cloud,0,50,240,112,this);
    g.drawImage(Cloud,400,50,240,112,this);
    g.drawImage(Cloud,1200,50,240,112,this);
    g.drawImage(Cloud,800,50,240,112,this);
    Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 2.png");
    if(change == 0 || change == 6 || change == 7) {
        g.drawImage(Palmtree, xPalmtree, yPalmtree, 200, 400, this);
        g.drawImage(Palmtree, xPalmtree+575, yPalmtree, 200, 400, this); 
        g.drawImage(Palmtree, xPalmtree+1150, yPalmtree, 200, 400, this);      
    }
    else if(change == 1) {
        g.drawImage(Palmtree, xPalmtree, yPalmtree, 200, 400, this);
        g.drawImage(Palmtree, xPalmtree+400, yPalmtree-150, 200, 400, this); 
        g.drawImage(Palmtree, xPalmtree+1000, yPalmtree-200, 200, 400, this);      
    }
    else if(change == 2){
        g.drawImage(Palmtree, xPalmtree, yPalmtree, 200, 400, this);
        g.drawImage(Palmtree, xPalmtree+1000, yPalmtree, 200, 400, this);      
    }       
    else if(change == 3){
        g.drawImage(Palmtree, xPalmtree, yPalmtree, 200, 400, this);  
        g.drawImage(Palmtree, xPalmtree+1000, yPalmtree, 200, 400, this);   
        g.drawImage(Palmtree, xPalmtree+600, yPalmtree-200, 200, 400, this); 
    } 
    else if(change == 4){
        g.drawImage(Palmtree, xPalmtree, yPalmtree-300, 200, 400, this);  
        g.drawImage(Palmtree, xPalmtree+600, yPalmtree-50, 200, 400, this);
        g.drawImage(Palmtree, xPalmtree+1000, yPalmtree, 200, 400, this);    
    }
    if(change == 0) {
        g.drawImage(Ground,xBox5,yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+wBox1,yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+(wBox1*2),yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+(wBox1*3),yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+(wBox1*4),yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+(wBox1*5),yBox5,wBox1,hGround,this);
    }
    else if(change == 1) {
        g.drawImage(Ground,xBox5,yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+100,yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox1,yBox1,wBox1,hGround,this);
        g.drawImage(Ground,Box4.x, Box4.y, wBox1, hGround,this); 
        g.drawImage(Ground,Box3.x,Box3.y,wBox1,hGround,this);
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 4.png");
        g.drawImage(Ground,Box5.x+400,Box5.y+100,wBox1,101,this);
        g.drawImage(Ground,Box5.x+700,Box5.y+100,wBox1,101,this);
        g.drawImage(Ground,Box5.x+700,Box5.y,wBox1,101,this);
        g.drawImage(Ground,Box5.x+1000,Box5.y,wBox1,101,this);
        g.drawImage(Ground,Box5.x+1000,Box5.y+100,wBox1,101,this);
        g.drawImage(Ground,Box5.x+1300,Box5.y-20,wBox1,101,this);
        g.drawImage(Ground,Box5.x+1300,Box5.y,wBox1,101,this);
        g.drawImage(Ground,Box5.x+1300,Box5.y+100,wBox1,101,this);
    }
    else if(change == 2) {
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 3.png");
        g.drawImage(Ground,Box5.x,Box5.y,wBox1,hGround,this);
        g.drawImage(Ground,Box1.x,Box1.y,wBox1,hGround,this);
        g.drawImage(Ground,Box3.x,Box3.y,wBox1,hGround,this);
        g.drawImage(Ground,Box2.x,Box2.y,wBox1,hGround,this);
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 4.png");
        g.drawImage(Ground,Box2.x,Box2.y+hGround,wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+hGround+101,wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+hGround+(101*2),wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+hGround+(101*3),wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+hGround+(101*4),wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+hGround+(101*5),wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+hGround+(101*6),wBox1,101,this);
    }
    else if(change == 3) {
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 3.png");
        g.drawImage(Ground,xBox5,yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+wBox1,yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+(wBox1*2),yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+(wBox1*3),yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+(wBox1*4),yBox5,wBox1,hGround,this);
        g.drawImage(Ground,xBox5+(wBox1*5),yBox5,wBox1,hGround,this);
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 3.png");
        g.drawImage(Ground,Plat1.x,Plat1.y,wBox1,200,this);
        g.drawImage(Ground,Plat1.x+150,Plat1.y,wBox1,200,this);
        g.drawImage(Ground,Plat1.x+200,Plat1.y,wBox1,200,this);
    }
    else if(change == 4) {
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 3.png");
        g.drawImage(Ground,Box5.x,Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box5.x+wBox1,Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box5.x+(wBox1*2),Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box4.x,Box4.y,wBox1,200,this);
        g.drawImage(Ground,Box3.x,Box3.y,wBox1,200,this);
        g.drawImage(Ground,Box2.x,Box2.y,wBox1,200,this);
        g.drawImage(Ground,Box1.x,Box1.y,wBox1,200,this);
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 4.png");
        g.drawImage(Ground,Box4.x,Box4.y+200,wBox1,101,this);
        g.drawImage(Ground,Box3.x,Box3.y+200,wBox1,101,this);
        g.drawImage(Ground,Box3.x,Box3.y+301,wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+200,wBox1,101,this);
        g.drawImage(Ground,Box1.x,Box1.y+200,wBox1,101,this);
        g.drawImage(Ground,Box1.x,Box1.y+301,wBox1,101,this);
        g.drawImage(Ground,Box1.x,Box1.y+402,wBox1,101,this);
        g.drawImage(Ground,Box1.x,Box1.y+503,wBox1,101,this);
    }
    else if(change == 5) {
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 3.png");
        g.drawImage(Ground,Box5.x,Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box5.x+100,Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box3.x,Box3.y,wBox1,200,this);
        g.drawImage(Ground,Box2.x,Box2.y,wBox1,200,this);
        g.drawImage(Ground,Box1.x,Box1.y,wBox1,200,this);
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 4.png");
        g.drawImage(Ground,Box1.x,Box1.y+200,wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+200,wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+301,wBox1,101,this);
        g.drawImage(Ground,Box2.x,Box2.y+402,wBox1,101,this);
        g.drawImage(Ground,Box3.x,Box3.y+200,wBox1,101,this);
    }
    else if(change >= 6) {
        Ground = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo South Island Ground 3.png");
        g.drawImage(Ground,Box5.x,Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box5.x+wBox1,Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box5.x+(wBox1*2),Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box5.x+(wBox1*3),Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box5.x+(wBox1*4),Box5.y,wBox1,200,this);
        g.drawImage(Ground,Box5.x+(wBox1*5),Box5.y,wBox1,200,this);
    }
} 
public void drawHUD(Graphics g, Font HUDtext) {//draws HUD
    g.setColor(Color.white);
    g.setFont(HUDtext);
    g.drawImage(HUD,10,10,180,172,this);
    g.drawString(""+ringsCollected,220,175);
    if(secondTimer == 6000 && actend == 0) {
        minuteTimer ++;
        secondTimer = 0; 
    }
    if(secondTimer < 1000 && actend == 0) {
        g.drawString(""+minuteTimer+":0"+(secondTimer/100),220,110);    
    }
    else if(secondTimer >= 1000 && secondTimer < 6000 && actend == 0) {
        g.drawString(""+minuteTimer+":"+(secondTimer/100),220,110);    
    }
    g.drawString(""+score,220,47);  
        if(powerUp > 0) {
            if(powerUp == 1) {
                g.drawImage(H,600,10,48,40,this); 
            }
            else if(powerUp == 2) {
                g.drawImage(S,600,10,48,40,this); 
            } 
            g.drawString(""+ammo,700,47);
        }
    Sonic(18,700,g);    
    g.drawImage(LivesHUD,10,700,128,56,this);
    g.setColor(Color.white);
    g.drawString(""+lives,125,747);  
}
public void ringDraw(Graphics g,int i, Rectangle ringRect){//draws rings
    g.drawImage(ringPic,ringRect.x,ringRect.y,50,50,this);
    //g.drawString(""+ringRect,500,50+50*i);
 }
public void ringGet(Graphics g, int i) {//checks to see if Sonic collected the ring
   if(CollisionSonic.intersects(Rings.get(i))) {
        ringsCollected++;
        score+=10;
        Rings.remove(i);
    }
}
public void HMG(Graphics g,int i){//controls everything about the HMG power up
    for(int f = 0;f < HMGMon.size();f++){
        collideHMGMon(g,HMGMon.get(f),Bullet.get(i));
        removeHMGMon(g,f,Bullet.get(i));
    }
    for(int f = 0;f < ShotMon.size();f++){
        collideShotMon(g,ShotMon.get(f),Bullet.get(i));
        removeShotMon(g,f,Bullet.get(i));
    }
    for(int f = 0;f < RingMon.size();f++){
        collideRingMon(g,RingMon.get(f),Bullet.get(i));
        removeRingMon(g,f,Bullet.get(i));
    }
    for(int f = 0;f < EnemyBox.size();f++){
        collideEnemy(g,EnemyBox.get(f),Bullet.get(i));
        removeEnemy(g,f,Bullet.get(i));
    }
    if(!Bullet.get(i).intersects(Box1)&& !Bullet.get(i).intersects(Box2)&& !Bullet.get(i).intersects(Box4) && !Bullet.get(i).intersects(Box5) && !Bullet.get(i).intersects(GlobalHMGMon) && !Bullet.get(i).intersects(GlobalShotMon) && !Bullet.get(i).intersects(GlobalRingMon) && !Bullet.get(i).intersects(GlobalEnemyBox) && BulletX.get(i) >= 0 && BulletX.get(i) <= 1920) {
        BulletCollide = false;
    }
    else if(Bullet.get(i).intersects(Box1)|| Bullet.get(i).intersects(Box2)|| Bullet.get(i).intersects(Box4) || Bullet.get(i).intersects(Box5)) {
        BulletCollide = true;
    }
    else if(Bullet.get(i).intersects(GlobalHMGMon)) {
        for(int w = 0; w < Bullet.size();w++) {
            Bullet.remove(i);
            BulletX.remove(i);
            BulletY.remove(i);
            BulletDir.remove(i);   
        }
        if(Bullet.size() == 0) {
            powerUp = 1;    
            ammo = 20;
            if(boxSound == 0) {
                playMusic();
                boxSound = 1;
            }
        }
            BulletCollide = true;
    }
    else if(Bullet.get(i).intersects(GlobalShotMon)) {
        for(int w = 0; w < Bullet.size();w++) {
            Bullet.remove(i);
            BulletX.remove(i);
            BulletY.remove(i);
            BulletDir.remove(i);   
        }
        if(Bullet.size() == 0) {
            powerUp = 2;    
            ammo = 10;
            if(boxSound == 0) {
                playMusic();
                boxSound = 1;
            }
        }
            BulletCollide = true;
    }
    else if(Bullet.get(i).intersects(GlobalRingMon)) {
        for(int w = 0; w < Bullet.size();w++) {
            Bullet.remove(i);
            BulletX.remove(i);
            BulletY.remove(i);
            BulletDir.remove(i);   
        }
        if(Bullet.size() == 0) {
            ringsCollected+=10;
            if(boxSound == 0) {
                playMusic();
                boxSound = 1;
            }
        }
            BulletCollide = true;
    }
    else if(Bullet.get(i).intersects(GlobalEnemyBox)) {
        for(int w = 0; w < Bullet.size();w++) {
            Bullet.remove(i);
            BulletX.remove(i);
            BulletY.remove(i);
            BulletDir.remove(i);   
        }
            BulletCollide = true;
    }
    else if(BulletX.get(i) < 0 ) {
        BulletCollide = true;
    }
    else if(BulletX.get(i) > 1920) {
       BulletCollide = true;
    }
    if(BulletDir.get(i) == 0 && BulletCollide == false) {
        g.drawImage(HMGBullet,BulletX.get(i),BulletY.get(i),10,10,this);
        BulletX.set(i,BulletX.get(i)+25); 
    }
    else if(BulletDir.get(i) == 1 && BulletCollide == false) {
       g.drawImage(HMGBullet,BulletX.get(i),BulletY.get(i),10,10,this);
      BulletX.set(i,BulletX.get(i)-25);   
    }
    else if (BulletCollide == true){
        Bullet.remove(i);
        BulletX.remove(i);
        BulletY.remove(i);
        BulletDir.remove(i);     
        BulletCollide = false;
    }
}
public void ShotGun(Graphics g,int i){//controls everything about the Shotgun power up
    for(int f = 0;f < HMGMon.size();f++){
        collideHMGMon(g,HMGMon.get(f),Bullet.get(i));
        removeHMGMon(g,f,Bullet.get(i));
    }
    for(int f = 0;f < ShotMon.size();f++){
        collideShotMon(g,ShotMon.get(f),Bullet.get(i));
        removeShotMon(g,f,Bullet.get(i));
    }
    for(int f = 0;f < RingMon.size();f++){
        collideRingMon(g,RingMon.get(f),Bullet.get(i));
        removeRingMon(g,f,Bullet.get(i));
    }
    for(int f = 0;f < EnemyBox.size();f++){
        collideEnemy(g,EnemyBox.get(f),Bullet.get(i));
        removeEnemy(g,f,Bullet.get(i));
    }
    drawShotGunBlast(g, BulletDir.get(i));
    if(!Bullet.get(i).intersects(GlobalHMGMon) && !Bullet.get(i).intersects(GlobalShotMon) && !Bullet.get(i).intersects(GlobalRingMon) && !Bullet.get(i).intersects(GlobalEnemyBox) && BulletDelay <= 91) {
        BulletCollide = false;
    }
    else if(!Bullet.get(i).intersects(GlobalHMGMon) && !Bullet.get(i).intersects(GlobalShotMon) && !Bullet.get(i).intersects(GlobalRingMon) && !Bullet.get(i).intersects(GlobalEnemyBox) && BulletDelay > 91) {
        BulletCollide = true;
    }
    else if(Bullet.get(i).intersects(GlobalHMGMon)) {
        powerUp = 1;   
        ammo = 20;
        if(boxSound == 0) {
            playMusic();
            boxSound = 1;
        }
        BulletCollide = true;
    }
     else if(Bullet.get(i).intersects(GlobalShotMon)) {
        powerUp = 2;   
        ammo = 10;
        if(boxSound == 0) {
            playMusic();
            boxSound = 1;
        }
        BulletCollide = true;
    }
    else if(Bullet.get(i).intersects(GlobalRingMon)) {
        ringsCollected+=10;
        if(boxSound == 0) {
            playMusic();
            boxSound = 1;
        }
        BulletCollide = true;
    }
    else if(Bullet.get(i).intersects(GlobalEnemyBox)) {
        BulletCollide = true;
    }
    if(BulletDir.get(i) == 0 && BulletCollide  == false) {
        g.setColor(Color.yellow);
        g.drawImage(ShotGunBullet,BulletX.get(i),BulletY.get(i),200,100,this);
        BulletX.set(i,BulletX.get(i)); 
    }
    else if(BulletDir.get(i) == 1 && BulletCollide  == false) {
       g.setColor(Color.yellow);
       g.drawImage(ShotGunBullet,BulletX.get(i),BulletY.get(i),200,100,this);
       BulletX.set(i,BulletX.get(i));   
    }
    else if (BulletCollide == true && BulletDelay > 91){
        Bullet.remove(i);
        BulletX.remove(i);
        BulletY.remove(i);
        BulletDir.remove(i);     
        BulletCollide = false;
        BulletDelay = 0;
    }
}
//each draw method draws each respective thing based on their arrayList
public void drawHMGMon(Graphics g, Rectangle HMGMon, int i) {
    g.drawImage(HGMMonitor,HMGMon.x,HMGMon.y,wMon,hMon,this);
    //g.drawString(""+HMGMon, 700, 200+100*i);
    //g.drawString("GlobalHMGBox: "+GlobalHMGMon, 200, 500);
}
public void drawShotMon(Graphics g, Rectangle ShotMon, int i) {
    g.drawImage(ShotMonitor,ShotMon.x,ShotMon.y,wMon,hMon,this);
    //g.drawString(""+ShotMon, 700, 200+100*i);
    //g.drawString("GlobalShotBox: "+GlobalShotMon, 200, 500);
}
public void drawRingMon(Graphics g, Rectangle RingMon, int i) {
    g.drawImage(RingMonitor,RingMon.x,RingMon.y,wMon,hMon,this);
    //g.drawString(""+HMGMon, 700, 200+100*i);
    //g.drawString("GlobalRingMon: "+GlobalRingMon, 100, 300);
}
public void drawSpring(Graphics g, Rectangle SpringBox, int i) {
    g.drawImage(Spring,SpringBox.x,SpringBox.y,wSpring,hSpring,this);
    //g.drawString(""+SpringBox, 700, 200+100*i);
    //g.drawString("GlobalSpring: "+GlobalSpringBox, 200, 450);
}
public void drawSpike(Graphics g, Rectangle SpikeBox, int i) {
    g.drawImage(Spike,SpikeBox.x,SpikeBox.y,wSpike,hSpike,this);
    //g.drawString(""+SpikeBox, 700, 200+100*i);
    //g.drawString("GlobalSpikeBox: "+GlobalSpikeBox, 200, 400);
}
public void drawEnemy(Graphics g, Rectangle EnemyBox, int i) {
    g.drawImage(Crabnik,EnemyBox.x,EnemyBox.y,wSpike,hSpike,this);
    //g.drawString(""+EnemyBox, 300, 200+100*i);
    //g.drawString("GlobalEnemyBox: "+GlobalEnemyBox, 200, 600);
}
public void drawEnemyBullet(Graphics g, Rectangle EnemyBullet, int i) {
    xEnemyBullet.set(i,xEnemyBullet.get(i)-25);
    g.drawImage(HMGBullet,EnemyBullet.x,EnemyBullet.y,10,10,this);
    //g.drawString(""+EnemyBullet, 300, 200+100*i);
    //g.drawString("GlobalEnemyBox: "+EnemyBullet, 200, 600);
}
//Each method checks to see if the player is colliding with their specific thing (HMG for HGM Monitors, RingMon for Ring Monitors, etc)
public void collideHMGMon(Graphics g,Rectangle HMGMon, Rectangle Hitter) {
    if(Hitter.intersects(HMGMon)) {
        GlobalHMGMon = HMGMon;
        xGlobalHMGMon = HMGMon.x;
        yGlobalHMGMon = HMGMon.y;
    if(actend == 0 && boxSound == 0 && Hitter.intersects(GlobalHMGMon)) {
       music = "src\\resources\\music files\\Heavy Machine Gun.wav";
    }
        //g.drawString("xGlobalHMGMon: "+HMGMon.x, 400, 600);
        //g.drawString("yGlobalHMGMon: "+HMGMon.y, 400, 650);
    }
 }
public void collideShotMon(Graphics g,Rectangle ShotMon, Rectangle Hitter) {
    if(Hitter.intersects(ShotMon)) {
        GlobalShotMon = ShotMon;
        xGlobalShotMon = ShotMon.x;
        yGlobalShotMon = ShotMon.y;
        if(actend == 0 && boxSound == 0 && Hitter.intersects(GlobalShotMon)) {
           music = "src\\resources\\music files\\Shotgun.wav";
        }
        //g.drawString("xGlobalShotMon: "+ShotMon.x, 400, 600);
        //g.drawString("yGlobalShotMon: "+ShotMon.y, 400, 650);
    }
}
public void collideRingMon(Graphics g,Rectangle RingMon, Rectangle Hitter) {
    if(Hitter.intersects(RingMon)) {
        GlobalRingMon = RingMon;
        xGlobalRingMon = RingMon.x;
        yGlobalRingMon = RingMon.y;
        if(actend == 0 && boxSound == 0 && Hitter.intersects(GlobalRingMon)) {
           music = "src\\resources\\music files\\Ring Monitor.wav";
        }
        //g.drawString("xGlobalRingMon: "+RingMon.x, 400, 100);
        //g.drawString("yGlobalRingMon: "+RingMon.y, 400, 200);
    }
}
public void collideSpring(Graphics g,Rectangle SpringBox, Rectangle Hitter) {
    if(Hitter.intersects(SpringBox)) {
        GlobalSpringBox = SpringBox;
        xGlobalSpringBox = SpringBox.x;
        yGlobalSpringBox = SpringBox.y;
        //g.drawString("xGlobalHMGMon: "+SpringBox.x, 400, 600);
        //g.drawString("yGlobalHMGMon: "+SpringBox.y, 400, 650);
    }
}
public void collideSpike(Graphics g,Rectangle SpikeBox, Rectangle Hitter) {
    if(Hitter.intersects(SpikeBox)) {
        GlobalSpikeBox = SpikeBox;
        xGlobalSpikeBox = SpikeBox.x;
        yGlobalSpikeBox = SpikeBox.y;
        //g.drawString("xGlobalSpikeBox: "+SpikeBox.x, 400, 600);
        //g.drawString("yGlobalSpikeBox: "+SpikeBox.y, 400, 650);
    }
}
public void collideEnemy(Graphics g,Rectangle EnemyBox, Rectangle Hitter) {
    if(Hitter.intersects(EnemyBox)) {
        GlobalEnemyBox = EnemyBox;
        xGlobalEnemyBox = EnemyBox.x;
        yGlobalEnemyBox = EnemyBox.y;
        //g.drawString("xGlobalSpikeBox: "+EnemyBox.x, 400, 600);
        //g.drawString("yGlobalSpikeBox: "+EnemyBox.y, 400, 650);
    }
}
public void collideEnemyBullet(Graphics g,Rectangle EnemyBullet, Rectangle Hitter,int i) {
    if(Hitter.intersects(EnemyBullet)) {
        lives--;
        ringsCollected = 0;
        xSonic = 0;
        EnemyBulletDelay = 0;
        removeEnemyBullet(i);
    }
    else if(EnemyBullet.x < 0) {
        removeEnemyBullet(i); 
    }
}
//removes their respective thing
 public void removeHMGMon(Graphics g,int i, Rectangle Hitter) {
    if(Hitter.intersects(HMGMon.get(i))) {
        HMGMon.remove(i);
        xHMGMon.remove(i);
        yHMGMon.remove(i);
        score+=100;
    }
 }
public void removeShotMon(Graphics g,int i, Rectangle Hitter) {
    if(Hitter.intersects(ShotMon.get(i))) {
        ShotMon.remove(i);
        xShotMon.remove(i);
        yShotMon.remove(i);
        score+=100;
    }
}
public void removeRingMon(Graphics g,int i, Rectangle Hitter) {
    if(Hitter.intersects(RingMon.get(i))) {
        RingMon.remove(i);
        xRingMon.remove(i);
        yRingMon.remove(i);
        score+=100;
    }
}
public void removeEnemy(Graphics g,int i, Rectangle Hitter) {
     if(Hitter.intersects(EnemyBox.get(i))) {
         EnemyBox.remove(i);
         xEnemyBox.remove(i);
         yEnemyBox.remove(i);
         score+=100;
     }
}
public void removeEnemyBullet(int i) {
    xEnemyBullet.remove(i);
    yEnemyBullet.remove(i);
    EnemyBullet.remove(i);
}
//cleans the screen of rings, enemies, monitors, etc
public void wipeScreen() {
    for(int i = 0;i < Rings.size();i++) {
        Rings.remove(i); 
    }
    for(int i = 0;i < HMGMon.size();i++) {
        xHMGMon.remove(i);
        yHMGMon.remove(i);
        HMGMon.remove(i); 
    }
    for(int i = 0;i < ShotMon.size();i++) {
        xShotMon.remove(i);
        yShotMon.remove(i);
        ShotMon.remove(i); 
    }
    for(int i = 0;i < RingMon.size();i++) {
        RingMon.remove(i); 
    }
    for(int i = 0;i < SpringBox.size();i++) {
        xSpringBox.remove(i);
        ySpringBox.remove(i);
        SpringBox.remove(i); 
    }
    for(int i = 0;i < SpikeBox.size();i++) {
        xSpikeBox.remove(i);
        ySpikeBox.remove(i);
        SpikeBox.remove(i); 
    }
    for(int i = 0;i < EnemyBox.size();i++) {
        xEnemyBox.remove(i);
        yEnemyBox.remove(i);
        EnemyBox.remove(i); 
    }
    for(int i = 0;i < EnemyBullet.size();i++) {
        xEnemyBullet.remove(i);
        yEnemyBullet.remove(i);
        EnemyBullet.remove(i); 
    }
    
}
//draws the shotgunblast
public void drawShotGunBlast(Graphics g, int bulletDir) {
    if(bulletDir == 0) {
        if(BulletDelay >= 0 && BulletDelay <= 7) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 1.png");      
        }
        else if(BulletDelay > 7 && BulletDelay <= 14) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 2.png");      
        }
        else if(BulletDelay > 14 && BulletDelay <= 21) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 3.png");      
        }
        else if(BulletDelay > 21 && BulletDelay <= 28) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 4.png");      
        }
        else if(BulletDelay > 28 && BulletDelay <= 35) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 5.png");      
        }
        else if(BulletDelay > 35 && BulletDelay <= 42) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 6.png");      
        }
        else if(BulletDelay > 42 && BulletDelay <= 49) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 7.png");      
        }
        else if(BulletDelay > 49 && BulletDelay <= 56) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 8.png");      
        }
        else if(BulletDelay > 56 && BulletDelay <= 63) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 9.png");      
        }
        else if(BulletDelay > 63 && BulletDelay <= 70) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 10.png");      
        }
        else if(BulletDelay > 70 && BulletDelay <= 77) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 11.png");      
        }
        else if(BulletDelay > 77 && BulletDelay <= 84) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 12.png");      
        }
        else if(BulletDelay > 84 && BulletDelay <= 91) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\ShotGunBullet 13.png");      
        }    
    }
    else if(bulletDir == 1) {
        if(BulletDelay >= 0 && BulletDelay <= 7) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 1.png");      
        }
        else if(BulletDelay > 7 && BulletDelay <= 14) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 2.png");      
        }
        else if(BulletDelay > 14 && BulletDelay <= 21) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 3.png");      
        }
        else if(BulletDelay > 21 && BulletDelay <= 28) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 4.png");      
        }
        else if(BulletDelay > 28 && BulletDelay <= 35) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 5.png");      
        }
        else if(BulletDelay > 35 && BulletDelay <= 42) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 6.png");      
        }
        else if(BulletDelay > 42 && BulletDelay <= 49) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 7.png");      
        }
        else if(BulletDelay > 49 && BulletDelay <= 56) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 8.png");      
        }
        else if(BulletDelay > 56 && BulletDelay <= 63) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 9.png");      
        }
        else if(BulletDelay > 63 && BulletDelay <= 70) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 10.png");      
        }
        else if(BulletDelay > 70 && BulletDelay <= 77) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 11.png");      
        }
        else if(BulletDelay > 77 && BulletDelay <= 84) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 12.png");      
        }
        else if(BulletDelay > 84 && BulletDelay <= 91) {
            ShotGunBullet = Toolkit.getDefaultToolkit().getImage("src\\resources\\LShotGunBullet 13.png");      
        }         
    }  
}
//Sonic icon
public static void Sonic ( int x, int y, Graphics g) {
  Color SonicBlue = new Color(80, 80, 240);
  Color SonicYellow = new Color(240, 192, 32);
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
  g.fillRect(x+24,y+52,16,4); 
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
  //Eyes
  g.setColor(SonicGreen);
  g.fillRect(x+36, y+28, 4, 4);
  g.fillRect(x+48, y+28, 4, 4);
  g.fillRect(x+36, y+36, 4, 4);
}
//Draws the results screen when the act ends
public void resultScreen(Graphics g, Font textHUD) {
    g.setColor(Color.white);
    g.setFont(textHUD);   
    g.drawString(""+(ringsCollected*100),600,460);
    g.drawString(""+timeScore,600,520);
    g.drawString(""+score,600,590);
    g.drawImage(Result1,300,200,864,96,this);
    g.drawImage(Result2,400,305,648,96,this);
    g.drawImage(Act1,1150,200,288,192,this);
    g.drawImage(ResultsHUD,410,425,180,172,this);
    g.setFont(textHUD);
    if(minuteTimer == 0 && secondTimer < 3000 && secondTimer > 0 && actend == 1) {
        timeScore = 20000;
        secondTimer = 0;
        minuteTimer = 0;
    }
    else if(minuteTimer == 0 && secondTimer < 6000 && secondTimer >= 3000 && actend == 1) {
        timeScore = 10000;
        secondTimer = 0;
        minuteTimer = 0;
    }
    else if(minuteTimer == 1 && secondTimer >= 0 && secondTimer < 60000 && actend == 1) {
        timeScore = 5000;
        secondTimer = 0;
        minuteTimer = 0;
    }
    else if(minuteTimer == 2 && secondTimer >= 0 && secondTimer < 60000 && actend == 1) {
        timeScore = 2500;
        secondTimer = 0;
        minuteTimer = 0;
    } 
    else if(minuteTimer >= 3 && secondTimer >= 0 && secondTimer < 60000 && actend == 1) {
        timeScore = 1000;
        secondTimer = 0;
        minuteTimer = 0;
    } 
    if(ringsCollected > 0 && !clip.isRunning() && "src\\resources\\music files\\Act Clear SPA.wav".equals(music)) {
        pause(5);
        ringsCollected --;
        score+=100;
    }
    else if(ringsCollected == 0 && timeScore > 0 && !clip.isRunning() && "src\\resources\\music files\\Act Clear SPA.wav".equals(music)) {
        pause(5);
        timeScore -=100;
        score+=100;
    }
    else if(ringsCollected == 0 && timeScore == 0 && totalmusic == -1) {
        playMusic();
        totalmusic = 0;
    }
    if(ringsCollected == 0 && timeScore == 0) {
        actFadeTimer ++;
    if(actFadeTimer > 500) {
        System.exit(0);
    }
}
}
//draws the continue screen when the player loses all of their lives
public void continueScreen(Graphics g, Font fontContinueTimer) {
    if(continuemusic == -1) {
        playMusic();   
        continuemusic = 0;
    }
    wipeScreen();
    if(Rings.isEmpty() && HMGMon.isEmpty() && ShotMon.isEmpty() && RingMon.isEmpty() && SpringBox.isEmpty() && SpikeBox.isEmpty()) {
    g.setColor(Color.black);
    g.fillRect(0, 0, 1920, 1080);
    g.setColor(Color.white);
    /*g.drawString("continueCutsceneTimer: "+continueCutsceneTimer,0,500);
    g.drawString("continueSelect: "+continueSelect,0,550);
    g.drawString("Canicontinue: "+Canicontinue,0,575);
    g.drawString("continueTimer: "+continueOptionTimer,0,600);*/
    if(lives == 0 && continueCutsceneTimer < 160) {
        continueCutsceneTimer++;
    }
    if(continueCutsceneTimer < 90) {
        yCSonic+=4;
    }
    else if(continueCutsceneTimer >= 90 && continueCutsceneTimer < 130) {
        yCSonic-=2;
    }
    else if(continueCutsceneTimer >= 130 && continueCutsceneTimer < 160) {
        yCSonic+=4;
    }
    if(continueCutsceneTimer < 160) {
        Canispin++;
        if(Canispin >= 40) {
            Canispin = 0;
        }
        if(Canispin >= 0 && Canispin < 5) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Spin 1.png");
            g.drawImage(CSonic,xCSonic,yCSonic,wCSonic,hCSonic,this);
        }
        else if(Canispin >= 5 && Canispin < 10) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Spin 2.png");
            g.drawImage(CSonic,xCSonic,yCSonic,wCSonic,hCSonic,this);
        }
        else if(Canispin >= 10 && Canispin < 15) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Spin 3.png");
            g.drawImage(CSonic,xCSonic,yCSonic,wCSonic,hCSonic,this);
        }
        else if(Canispin >= 15 && Canispin < 20) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Spin 4.png");
            g.drawImage(CSonic,xCSonic,yCSonic,wCSonic,hCSonic,this);
        }
        else if(Canispin >= 20 && Canispin < 25) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Spin 5.png");
            g.drawImage(CSonic,xCSonic,yCSonic,wCSonic,hCSonic,this);
        }
        else if(Canispin >= 25 && Canispin < 30) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Spin 6.png");
            g.drawImage(CSonic,xCSonic,yCSonic,wCSonic,hCSonic,this);
        }
        else if(Canispin >= 30 && Canispin < 35) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Spin 7.png");
            g.drawImage(CSonic,xCSonic,yCSonic,wCSonic,hCSonic,this);
        }
        else if(Canispin >= 35 && Canispin < 40) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Spin 8.png");
            g.drawImage(CSonic,xCSonic,yCSonic,wCSonic,hCSonic,this);
        }
    }
    else if(continueCutsceneTimer == 160) {
        CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Dead.png");
        g.drawImage(CSonic,xCSonic,yCSonic,130,110,this);
        if(Canicontinue < 70) {
            Canicontinue++;    
        }
        if(Canicontinue >= 0 && Canicontinue < 7) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 10.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 7 && Canicontinue < 14) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 9.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 14 && Canicontinue < 21) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 8.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 21 && Canicontinue < 28) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 7.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 28 && Canicontinue < 35) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 6.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 35 && Canicontinue < 42) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 5.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 42 && Canicontinue < 49) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 4.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 49 && Canicontinue < 56) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 3.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 56 && Canicontinue < 63) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 2.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 63 && Canicontinue < 70) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 1.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue == 70) {
            ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue GIF.gif");
            g.drawImage(ContinuePic,500,100,500,250,this);   
            g.drawImage(Yes,300,550,300,75,this);
            g.drawImage(No,900,550,300,75,this);
            continueOptionTimer-=9;
            g.setFont(fontContinueTimer);
            g.drawString(""+(continueOptionTimer/1000),710,610);
            if(continuemusic == 0) {
                playMusic();
                continuemusic = 1;
            }
        }
        if(continueOptionTimer < 0) {
            System.exit(0);
        }
        if(continueSelect == 0) {
            continueCutsceneTimer = 160;
        }
        else if(continueSelect == 1) {
            clip.close();
            Canicontinue = 0;
            continueCutsceneTimer = 161;
        }
    }
    else if(continueCutsceneTimer >= 161) {
        continueCutsceneTimer++;
    }
    if (continueCutsceneTimer >= 161 && continueCutsceneTimer < 250) {
        if(Canicontinue < 71) {
            Canicontinue++;    
        }
        if(Canicontinue >= 0 && Canicontinue < 7) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 1.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 7 && Canicontinue < 14) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 2.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 14 && Canicontinue < 21) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 3.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 21 && Canicontinue < 28) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 4.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 28 && Canicontinue < 35) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 5.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 35 && Canicontinue < 42) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 6.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 42 && Canicontinue < 49) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 7.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 49 && Canicontinue < 56) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 8.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 56 && Canicontinue < 63) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 9.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        else if(Canicontinue >= 63 && Canicontinue <= 70) {
        ContinuePic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Continue 10.png");
        g.drawImage(ContinuePic,500,100,500,250,this);            
        }
        CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Dead.png");
        g.drawImage(CSonic,xCSonic,yCSonic,130,110,this);
    }
    else if(continueCutsceneTimer >= 250 && continueCutsceneTimer < 400) {
        xHand+=4;
        yHand+=2;
        
    }
    else if(continueCutsceneTimer >= 400 && continueCutsceneTimer < 425) {
        xHand+=2;       
    }
    else if(continueCutsceneTimer >= 425 && continueCutsceneTimer < 430) {
        xHand+=4;       
    }
    else if(continueCutsceneTimer >= 430 && continueCutsceneTimer < 445) {
        xHand-=4;       
    }
    else if(continueCutsceneTimer >= 445 && continueCutsceneTimer < 460) {
        xHand+=4;       
    }
    else if(continueCutsceneTimer >= 460 && continueCutsceneTimer < 475) {
        xHand-=4;       
    }
    else if(continueCutsceneTimer >= 475 && continueCutsceneTimer < 490) {
        xHand+=4;       
    }
    else if(continueCutsceneTimer >= 490 && continueCutsceneTimer < 505) {
        xHand-=4;       
    }
    if(continueCutsceneTimer >= 425 && continueCutsceneTimer < 600) {
        Hand = Toolkit.getDefaultToolkit().getImage("src\\resources\\Fist.png");    
    }    
    if(continueCutsceneTimer >= 250 && continueCutsceneTimer < 510) {       
        g.drawImage(CSonic,xCSonic,yCSonic,130,110,this);
        g.drawImage(Hand,xHand,yHand,80,80,this);        
    }
    if(continueCutsceneTimer >= 250 && continueCutsceneTimer < 505) {
        CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Dead.png");
        g.drawImage(CSonic,xCSonic,yCSonic,130,110,this);
    }
    else if(continueCutsceneTimer >= 510 && continueCutsceneTimer < 515) {
        CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Get Up 1.png");  
        g.drawImage(CSonic,xCSonic,yCSonic,130,110,this);
    }
    else if(continueCutsceneTimer >= 515 && continueCutsceneTimer < 520) {
        CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Get Up 2.png"); 
        g.drawImage(CSonic,xCSonic,yCSonic,130,110,this);
    }
    else if(continueCutsceneTimer >= 520 && continueCutsceneTimer < 521) {
        yCSonic-=50;
    }
    else if(continueCutsceneTimer >= 520 && continueCutsceneTimer < 550) {
        CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Stand 1.png");
        g.drawImage(CSonic,xCSonic,yCSonic,110,160,this); 
    }
    else if(continueCutsceneTimer >= 550 && continueCutsceneTimer < 750) {
        if(continueCutsceneTimer >= 575 && continueCutsceneTimer < 625) {
            Hand = Toolkit.getDefaultToolkit().getImage("src\\resources\\Point 1.png"); 
        }
        else if(continueCutsceneTimer >= 625) {
            Hand = Toolkit.getDefaultToolkit().getImage("src\\resources\\Point 2.png");
        }
        CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Angry Neo Sonic Stand 1.png");
        g.drawImage(CSonic,xCSonic,yCSonic,110,160,this); 
    }
    else if(continueCutsceneTimer >= 750 && continueCutsceneTimer < 800) {
        CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Stand 1.png");
        g.drawImage(CSonic,xCSonic,yCSonic,110,160,this);     
    }
    else if(continueCutsceneTimer >= 800 && continueCutsceneTimer < 850) {
        CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Wag 1.png");
        g.drawImage(CSonic,xCSonic,yCSonic,110,160,this);     
    }
    else if(continueCutsceneTimer >= 850) {
        if(continueCutsceneTimer >= 850 && continueCutsceneTimer < 950) {
            CaniRunChange = 4;
        }
        else if(continueCutsceneTimer >= 950 && continueCutsceneTimer < 1050) {
            CaniRunChange = 3;
        }
        else if(continueCutsceneTimer >= 1050 && continueCutsceneTimer < 1150) {
            CaniRunChange = 2;
        }
        else if(continueCutsceneTimer >= 1150) {
            CaniRunChange = 1;
        }
        Canirun++;
        if(Canirun >= 0*CaniRunChange && Canirun <= 5*CaniRunChange) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 1.png");
            g.drawImage(CSonic, xCSonic, yCSonic, 130, 160, this);
        }
        else if(Canirun > 5*CaniRunChange && Canirun <= 10*CaniRunChange) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 2.png");
            g.drawImage(CSonic, xCSonic, yCSonic, 130, 160, this);
        }
        else if(Canirun > 10*CaniRunChange && Canirun <= 15*CaniRunChange) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 3.png");
            g.drawImage(CSonic, xCSonic, yCSonic, 131, 160, this);
        }
        else if(Canirun > 15*CaniRunChange && Canirun <= 20*CaniRunChange) {
            CSonic = Toolkit.getDefaultToolkit().getImage("src\\resources\\Neo Sonic Run 4.png");
            g.drawImage(CSonic, xCSonic, yCSonic, 130, 160, this);
        }
        if(Canirun >= (20*CaniRunChange)) {
            Canirun = 0;
        }
        if(continueCutsceneTimer > 1200) {
            xCSonic+=20;
        }
    }
    if (continueCutsceneTimer >= 510) {
        if(continueCutsceneTimer > 1225) {
            Hand = Toolkit.getDefaultToolkit().getImage("src\\resources\\Ok Sign.png");
        }
        g.drawImage(Hand,xHand,yHand,80,80,this);
    }
    if(continueCutsceneTimer >= 1300) {//resets everything
        ringsCollected = 0;
        actend = 0;
        jump = 0;
        spike = 0;
        spiketimer = 0;
        spring = 0;
        springtimer = 0;
        duckcheck = -2;
        xpress = 0;
        rightpress = 0;
        leftpress = 0;
        aniblink = 0;
        anijump = 0;
        anirun = 0;
        aniwag = 0;
        score = 0;
        powerUp = 0;
        BulletDelay = 0;
        EnemyBulletDelay = 0;
        ammo = 0;
        BulletCollide = false;
        musicstart = -1;
        totalmusic = -1;
        goalPostHit = false;
        goalPostTimer = 0;
        secondTimer = 0;
        minuteTimer = 0;
        actmusic = -1;
        Canirun = 0;
        Canispin = 0;
        change = 0;
        setRing = 0; 
        setHMGMon = 0;
        setRingMon = 0;
        setShotMon = 0;
        setSpring = 0;
        setSpike = 0;
        setEnemy = 0;
        xSonic = 0;
        ySonic = 300;
        continueCutsceneTimer = 0;
        continueSelect = 0;
        continueOptionTimer = 11000;
        Canicontinue = 0;
        xCSonic = 650;
        yCSonic = 0;
        xHand = -100;
        yHand = 100;
        continuemusic = -1;
        Hand = Toolkit.getDefaultToolkit().getImage("src\\resources\\Hand.png"); 
        right = true;
        left = false;
        lives = 3;
    }
    }   
}  
/***********************************************************/
    
}//close program


