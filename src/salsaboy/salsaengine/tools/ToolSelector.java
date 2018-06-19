package salsaboy.salsaengine.tools;

import javax.swing.*;
import java.awt.*;

/**
 * Tools:<br>
 * - Map maker<br>
 * - Node based AI maker<br>
 * - Player<br>
 * - GUI maker<br>
 * - Window/Frame
 */
public class ToolSelector {
    private JFrame frame = new JFrame("Tools");
    private JPanel make = new JPanel();
    private JPanel load = new JPanel();
    
    private JButton mGUI = new JButton("Make GUI");
    private JButton lGUI = new JButton("Load GUI");
    private JButton mAI = new JButton("Make AI");
    private JButton lAI = new JButton("Load AI");
    private JButton mFrame = new JButton("Make Window");
    private JButton lFrame = new JButton("Load Window");
    
    public ToolSelector() {
        frame.setLayout(new GridLayout(0, 2));
        make.setLayout(new GridLayout(0, 1));
        load.setLayout(new GridLayout(0, 1));
    
        make.add(mFrame);
        load.add(lFrame);
        make.add(mGUI);
        load.add(lGUI);
        make.add(mAI);
        load.add(lAI);
        
        frame.add(make);
        frame.add(load);
        
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
