/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AngryBirdsApplication;

import AngryBirdsLevel.BirdsLevel;

import java.io.IOException;

//import javax.media.CannotRealizeException;
//import javax.media.NoPlayerException;

/**
 *
 * @author 何枝可依
 */
public class AngryBirdsMain {

    /**
     * Entrance of This Game.
     */
    public static void main(String[] args) throws InterruptedException, IOException{// NoPlayerException, CannotRealizeException {


        BirdsLevel ts=new BirdsLevel();

        AngryBirdsMenu menu=new AngryBirdsMenu();
        AngryBirdsPanel game=new AngryBirdsPanel();

        AngryBirdsViewFrame mainframe=new AngryBirdsViewFrame(menu,game);
        //MusicController music=new MusicController();
        AngryBirdsController tc=new AngryBirdsController(ts,game);
        AngryBirdsMenuController mc=new AngryBirdsMenuController(menu);
        AngryBirdsPanelController pc=new AngryBirdsPanelController(mainframe.getLayoutpanel(),mc,tc);


        ts.getWorld().setContactListener(tc);
        //music.start();

        Thread switcher=new Thread(pc);

        switcher.start();
        mainframe.setVisible(true);

    }
}
