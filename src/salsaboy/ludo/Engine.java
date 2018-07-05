package salsaboy.ludo;

import salsaboy.ludo.gameplay.GameType;
import salsaboy.ludo.graphics.Image;
import salsaboy.ludo.graphics.Window;
import salsaboy.ludo.menu.Menu;
import salsaboy.ludo.splash.Splash;
import salsaboy.ludo.splash.SplashType;
import java.awt.*;

public class Engine {
    public static Window frame;
    public static GameType type;
    public static Color splashBack;
    public static String gameName;
    
    /**
     * This must run before anything else.
     * @param initializer The initializer which will initialize the engine.
     */
    public static void start(Initializer initializer) {
        frame = initializer.frame();
        type = initializer.gameType();
        splashBack = initializer.splashBackgroundColour();
        gameName = initializer.gameName();
        
        //Engine splash
        new Splash(new Image(Splash.class.getResource("EngineSplashTemp.png")), 2000, SplashType.CENTER);
        
        //Other splashes
        for (Splash splash : initializer.splashes()) {
            new Splash(splash.label, splash.delay, splash.type);
        }
        
        Splash.run();
        
        //Main menu
        frame.getContentPane().removeAll();
        frame.add(new Menu());
    }
}
