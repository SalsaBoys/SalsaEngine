package salsaboy.salsaengine;

import salsaboy.salsaengine.gameplay.GameType;
import salsaboy.salsaengine.splash.Splash;
import javax.swing.*;

public interface Initializer {
        //Game play info
    /**
     * This is so that you can change the type through the game
     * @return the type
     */
    GameType gameType();
    /**
     * The frame which the game will be in
     * @return
     */
    JFrame frame();
    
        //Menu info
    /**
     * This is to tell if the Engine should go with the default menu.
     * This doesn't include the splash, that's compulsory.
     * @return If the game wants the default start.
     */
    boolean defaultStart();
    
        //Splash info
    /**
     * Gets the splash at a specific location. These will be followed by the Salsa Engine splash.
     * @param location The location in the order of splashes.
     * @return The splash at that moment
     */
    Splash splashAt(int location);
}
