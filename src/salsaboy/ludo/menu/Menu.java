package salsaboy.ludo.menu;

import salsaboy.ludo.Engine;
import javax.swing.*;
import java.util.ArrayList;

public class Menu extends JPanel {
    static ArrayList<JLabel> options = new ArrayList<>(4);
    public Menu() {
        Engine.frame.getContentPane().removeAll();
    }
}
