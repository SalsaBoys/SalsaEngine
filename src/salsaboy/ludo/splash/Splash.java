package salsaboy.ludo.splash;

import salsaboy.ludo.Engine;
import salsaboy.ludo.graphics.FilledRectangle;
import salsaboy.ludo.misc.Timer;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Splash {
    private static ArrayList<Splash> splashes = new ArrayList<>();
    public static void run() {
        for (Splash splash : splashes) {
            Engine.frame.getContentPane().removeAll();
            Engine.frame.setLayout(null);
            Engine.frame.add(new FilledRectangle(Engine.frame.getPreferredSize())); //TODO FIX
            switch (splash.type) {
                case CENTER:
                    final int frameHeight = Engine.frame.getHeight();
                    final int frameWidth = Engine.frame.getWidth();
                    
                    final int labelHeight = splash.label.getPreferredSize().height;
                    final int labelWidth = splash.label.getPreferredSize().width;
                    
                    splash.label.setBounds(new Rectangle(new Point(
                        (frameWidth / 2) - (labelWidth / 2),
                        (frameHeight / 2) - (labelHeight / 2)
                    ), splash.label.getSize()));
                    Engine.frame.add(splash.label);
                    
                    break;
                default:
                    System.out.println("Feature " + splash.type.toString() + " is not ready for use");
                    break;
            }
            Engine.frame.repaint();
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
