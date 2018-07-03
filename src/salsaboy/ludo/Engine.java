package salsaboy.ludo;

import salsaboy.ludo.gameplay.GameType;
import salsaboy.ludo.graphics.Image;
import salsaboy.ludo.splash.Splash;
import salsaboy.ludo.splash.SplashType;
import javax.swing.*;
import java.awt.*;

public class Engine {
    public static JFrame frame;
    public static GameType type;
    public static Color splashBack;
    
    /**
     * This must run before anything else.
     * @param initializer The initializer which will initialize the engine.
     */
    public static void start(Initializer initializer) {
        frame = initializer.frame();
        type = initializer.gameType();
        splashBack = initializer.splashBackgroundColour();
        
        //Engine splash
        new Splash(new Image(Splash.class.getResource("EngineSplashTemp.png")), 2000, SplashType.CENTER);
        
        Splash.run();
    }
}
