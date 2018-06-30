package salsaboy.salsaengine;

public class Engine {
    public static Initializer requirements;
    
    /**
     * This must run before anything else.
     * @param initializer The initializer which will initialize the engine.
     */
    public static void start(Initializer initializer) {
        requirements = initializer;
        
        if (requirements.defaultStart()) {
        
        }
    }
}
