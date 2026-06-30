package components;

import javax.swing.*;
import java.awt.*;

/**
 * Custom header component for top panel
 */
public class Header extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public Header(String title) {
        setBackground(new Color(41, 128, 185));
        setPreferredSize(new Dimension(0, 60));
        
        JLabel titleLabel = new JLabel(title);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        add(titleLabel);
    }
}
