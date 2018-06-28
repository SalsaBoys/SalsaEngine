package salsaboy.salsaengine.graphics;

import javax.swing.*;
import java.awt.*;
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
    
    public Image(URL location) {
        ImageIcon icon = new ImageIcon(location);
        
        setIcon(icon);
    }
}
