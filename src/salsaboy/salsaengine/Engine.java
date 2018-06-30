package salsaboy.salsaengine;

import salsaboy.salsaengine.graphics.Image;
import salsaboy.salsaengine.splash.Splash;
import salsaboy.salsaengine.splash.SplashType;

public class Engine {
    public static Initializer requirements;
    
    /**
     * This must run before anything else.
     * @param initializer The initializer which will initialize the engine.
     */
    public static void start(Initializer initializer) {
        requirements = initializer;
        
        //Engine splash
        new Splash(new Image(Splash.class.getResource("EngineSplashTemp.png")), 2000, SplashType.CENTER);
        
        if (requirements.defaultStart()) {
        
        }
        
        Splash.run();
    }
}
