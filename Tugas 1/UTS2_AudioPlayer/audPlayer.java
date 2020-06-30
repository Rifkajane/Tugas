/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.UTS2_AudioPlayer;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Rifka
 */
public class audPlayer {

    static audPlayer player = new audPlayer();
    static Clip clip;

    private audPlayer() {

    }

    public static audPlayer getInstance() {
        return player;
    }

    public static void loadMusic(String filePath) {
        try {
            
           File musicPath = new File(filePath);
           if(musicPath.exists()){
               AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicPath);
               clip = AudioSystem.getClip();
               clip.open();
               System.out.println("initialized");
           }
        } catch (Exception e) {
            System.out.println("yes");
        }
    }

}
