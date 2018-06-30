package salsaboy.salsaengine;

public class Engine {
    public static Initializer requirements;
    public static void start(Initializer initializer) {
        requirements = initializer;
        
        requirements.start();
    }
}
