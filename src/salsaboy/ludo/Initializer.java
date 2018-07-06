package salsaboy.ludo;

import salsaboy.ludo.gameplay.GameType;
import salsaboy.ludo.graphics.Image;
import salsaboy.ludo.splash.Splash;
import salsaboy.ludo.graphics.Window;
import java.awt.*;

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
    Window frame();
    
        //Splash info
    /**
     * Gets the splashes. These will follow the Salsa Engine splash.
     * @return The splash at that moment
     */
    Splash[] splashes();
    /**
     * The colour of the splash background
     * @return The colour to use
     */
    Color splashBackgroundColour();
    
        //Menu info
    Image menuBackground();
    
        //Misc info
    String gameName();
}
