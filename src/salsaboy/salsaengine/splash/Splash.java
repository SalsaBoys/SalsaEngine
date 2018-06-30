package salsaboy.salsaengine.splash;

import salsaboy.salsaengine.Engine;
import salsaboy.salsaengine.misc.Timer;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Splash {
    private static ArrayList<Splash> splashes = new ArrayList<>();
    public static void run() {
        for (Splash splash : splashes) {
            Engine.requirements.frame().getContentPane().removeAll();
            Engine.requirements.frame().setLayout(null);
            switch (splash.type) {
                case CENTER:
                    Engine.requirements.frame().add(splash.label);
                    if (!(splash.label.getBounds().equals(Engine.requirements.frame().getBounds()))) {
                        splash.label.setBounds(new Rectangle(new Point(), new Dimension()));
                    }
                    break;
                default:
                    System.out.println("Feature " + splash.type.toString() + " is not ready for use");
                    break;
            }
            new Timer(splash.delay);
        }
    }
    
    private long delay;
    private JLabel label;
    private SplashType type;
    public Splash(JLabel display, long milliseconds, SplashType type) {
        splashes.add(this);
        
        label = display;
        delay = milliseconds;
        this.type = type;
    }
}
