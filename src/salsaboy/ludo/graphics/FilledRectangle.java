package salsaboy.ludo.graphics;

import javax.swing.*;
import java.awt.*;

public class FilledRectangle extends JLabel {
    private int x, y, height, width;
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
    public FilledRectangle(Rectangle rectangle) {
        this.x = rectangle.getX();
        this.y = rectangle.getY();
        this.height = rectangle.getHeight();
        this.width = rectangle.getWidth();
    }
}
