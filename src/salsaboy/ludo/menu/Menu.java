package salsaboy.ludo.menu;

import salsaboy.ludo.Engine;
import salsaboy.ludo.graphics.Image;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Menu {
    static ArrayList<JLabel> options = new ArrayList<>();
    static {
        options.add(new MenuItem(Engine.gameName, null).makeTitle());
    }
    public Menu(Image background) {
        Engine.frame.getContentPane().removeAll();
        Engine.frame.setLayout(null);
    
        try {
            background.setBounds(new Rectangle(new Point(0, 0), new Dimension(background.getPreferredSize())));
            Engine.frame.add(background);
        } catch (NullPointerException e) {
            //Don't need anything here
        }
    
        int current = 0;
        for (JLabel label : options) {
            if (current == 0) {
                label.setBounds(new Rectangle(new Point(10, 50), label.getPreferredSize()));
                current += 50;
            } else {
                label.setBounds(new Rectangle(new Point(10, 50 + current), label.getPreferredSize()));
                current += label.getHeight();
            }
            System.out.println(current);
            Engine.frame.add(label);
        }
    }
}
