package salsaboy.salsaengine.ui;

import javax.swing.*;
import java.awt.*;

public class Warning extends JFrame {   //TODO Finish this
    private JLabel label = new JLabel();
    private JButton ok = new JButton("OK");
    public Warning(String message) {
        setLayout(null);
        
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText(message);
        label.setBounds(0, 0, 300, 50);
        add(label);
        
        ok.setSize(100, 30);
        ok.setLocation(100, 50);
        add(ok);
    
        setSize(300, 100);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
