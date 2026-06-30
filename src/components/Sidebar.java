package components;

import javax.swing.*;
import java.awt.*;

/**
 * Custom sidebar component for navigation
 */
public class Sidebar extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public Sidebar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(236, 240, 241));
        setPreferredSize(new Dimension(200, 0));
    }
    
    public void addMenuItem(String itemName) {
        JButton button = new JButton(itemName);
        button.setMaximumSize(new Dimension(180, 40));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(button);
        add(Box.createVerticalStrut(5));
    }
}
