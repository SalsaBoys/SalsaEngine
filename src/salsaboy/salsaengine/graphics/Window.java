package salsaboy.salsaengine.graphics;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(int width, int height, String title) {
        super(title);
        
        setSize(width, height);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public Window(int width, int height) {
        this(width, height, "");
    }
    
    @Override
    public Component add(Component comp) {
        super.add(comp);
        repaint();
        return comp;
    }
}
