package salsaboy.salsaengine.map;

import javax.swing.*;
import java.util.ArrayList;

public class Backgrounds {
    static ArrayList<JLabel> backgrounds = new ArrayList<>();
    public static void add(String location) {
        JLabel label = new JLabel(new ImageIcon(location));
        backgrounds.add(label);
    }
}
