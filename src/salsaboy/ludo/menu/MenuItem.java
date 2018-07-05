package salsaboy.ludo.menu;

import com.sun.istack.internal.Nullable;
import salsaboy.ludo.misc.Method;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuItem extends JLabel {
    private static final Font optionFont = new Font("Avenir Next Condensed", Font.PLAIN, 24);
    
    MenuItem makeTitle() {
        setFont(optionFont.deriveFont(48f));
        return this;
    }
    
    private Method onClick;
    private MouseListener listener = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            onClick.method();
        }
    
        @Override
        public void mousePressed(MouseEvent e) {
        
        }
    
        @Override
        public void mouseReleased(MouseEvent e) {
        
        }
    
        @Override
        public void mouseEntered(MouseEvent e) {
            setForeground(Color.GRAY);
        }
    
        @Override
        public void mouseExited(MouseEvent e) {
            setForeground(Color.WHITE);
        }
    };
    public MenuItem(String label, @Nullable Method action) {
        super(label);
        setForeground(Color.WHITE);
        setFont(optionFont);
        
        try {
            onClick = action;
            addMouseListener(listener);
        } catch (NullPointerException e) {
            if (getMouseListeners().length > 0) {
                removeMouseListener(listener);
            }
        }
        
        Menu.options.add(this);
    }
}
