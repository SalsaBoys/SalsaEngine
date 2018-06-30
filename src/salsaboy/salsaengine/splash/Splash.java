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
                    final int frameHeight = Engine.requirements.frame().getHeight();
                    final int frameWidth = Engine.requirements.frame().getWidth();
                    
                    final int labelHeight = splash.label.getHeight();
                    final int labelWidth = splash.label.getWidth();
                    
                    splash.label.setBounds(new Rectangle(new Point(
                        (frameWidth / 2) - (labelWidth / 2),
                        (frameHeight / 2) - (labelHeight / 2)
                    ), splash.label.getSize()));
                    Engine.requirements.frame().add(splash.label);
                    
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
