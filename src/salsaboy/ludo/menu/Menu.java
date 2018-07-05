package salsaboy.ludo.menu;

import salsaboy.ludo.Engine;
import javax.swing.*;
import java.util.ArrayList;

public class Menu extends JPanel {
    static ArrayList<JLabel> options = new ArrayList<>(4);
    static {
        options.add(new MenuItem("", null).makeTitle());
    }
    public Menu() {
        Engine.frame.getContentPane().removeAll();
        
        for (JLabel label : options) {
            add(label);
        }
        
        Engine.frame.add(this);
    }
}
