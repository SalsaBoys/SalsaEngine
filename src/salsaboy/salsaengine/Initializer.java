package salsaboy.salsaengine;

import salsaboy.salsaengine.gameplay.GameType;
import javax.swing.*;

public interface Initializer {
        //Game play info
    /**
     * This is so that you can change the type through the game
     * @return the type
     */
    GameType gameType();
    
    JFrame frame();
    
        //Splash info
    /**
     * This is to tell if the Engine should go with the default start.
     * This doesn't include the splash, that's compulsory.
     * @return If the game wants the default start.
     */
    boolean defaultStart();
}
