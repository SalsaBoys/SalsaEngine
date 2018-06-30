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
    
        //Splash info
    /**
     * Gets the splashes. These will follow the Salsa Engine splash.
     * @return The splash at that moment
     */
    Splash[] splashes();
}
