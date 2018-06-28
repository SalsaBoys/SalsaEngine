package salsaboy.salsaengine.graphics;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JLabel {
    private int x, y, height, width;
    @Override
    public void paint(Graphics g) {
        g.drawRect(x, y, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
}
