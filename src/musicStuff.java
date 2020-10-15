/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.JOptionPane;

/**
 *
 * @author GeoSonicDash
 */
public class musicStuff {
Clip clip;
     void playMusic(String musicLocation) {
        try {
            File musicPath = new File(musicLocation);//creates File object which has path of musicLocation
            if (musicPath.exists()) { //checks to see if file exists
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);//creating an object that is responsible 
                //for bringing the music from the music file to our Java application (gets that from the musicPath object)
                clip = AudioSystem.getClip();//use clip class to play music, gets the audiostream from the AudioInput object
                clip.open(audioInput);//opens music
                clip.start();
                
                clip.loop(Clip.LOOP_CONTINUOUSLY);//loops the file continuously forever
                clip.open(audioInput);
                clip.loop(-1);
                Thread.sleep(300);
                clip.start();//loops the file continuously forever
                FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN); //allows for changing the volume of the music
                //gainControl.setValue(-30.0f); // Reduce volume by 30 decibels.﻿
                Thread.sleep(300);//stops thread (that is created by the clip class)
                //from killing its self (and the music) as it immediately starts 
            } else {
                System.out.println("Can't find file");//doesn't play if it cant find the file 
            }
        } catch (Exception ex) {
            ex.printStackTrace();// /printStackTrace prints out error message
        }
    }
}
