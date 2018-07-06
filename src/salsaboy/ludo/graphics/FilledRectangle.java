package salsaboy.ludo.graphics;

import javax.swing.*;
import java.awt.*;

public class FilledRectangle extends JLabel {
    private int x, y, height, width;
    private Color colour;
    @Override
    public void paint(Graphics g) {
        g.fillRect(x, y, width, height);
    }
    public FilledRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        
        setBounds(x, y, width, height);
    }
    public FilledRectangle(java.awt.Rectangle rectangle, Color colour) {
        this.x = (int) rectangle.getX();
        this.y = (int) rectangle.getY();
        this.height = (int) rectangle.getHeight();
        this.width = (int) rectangle.getWidth();
        this.colour = colour;
    }
    public FilledRectangle(Dimension dimension, Color colour/*Note the u*/) {
        this(new java.awt.Rectangle(new Point(0, 0), dimension), colour);
    }
}
