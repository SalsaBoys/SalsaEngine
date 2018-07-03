package salsaboy.ludo.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.net.URL;

public class Image extends JLabel {
    private boolean isInPaint = false;
    private CustomRenderer toPaint;
    public void setPaint(CustomRenderer e) {
        toPaint = e;
    }
    @Override
    public void paint(Graphics g) {
        if (isInPaint) {
            toPaint.paint(g);
        } else {
            super.paint(g);
        }
    }
    
    public Image(URL location, int x, int y) {
        ImageIcon icon = new ImageIcon(location);
        setIcon(icon);
        setBounds(new Rectangle(new Point(x, y), getPreferredSize()));
        
        setIcon(icon);
    }
    public Image(URL location) {
        this(location, 0, 0);
    }
}
