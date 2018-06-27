package salsaboy.salsaengine.graphics;

import javax.swing.*;
import java.awt.*;

public class Image extends JLabel {
    private boolean isInPaint = false;
    private Painting toPaint;
    public void setPaint(Painting e) {
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
    public Image() {
    
    }
}
