package components;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Custom card component for displaying dashboard statistics
 */
public class DashboardCard extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public DashboardCard(String title, String value) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(236, 240, 241));
        setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        titleLabel.setForeground(new Color(127, 140, 141));
        
        JLabel valueLabel = new JLabel(value);
        valueLabel.setFont(new Font("Arial", Font.BOLD, 24));
        valueLabel.setForeground(new Color(41, 128, 185));
        
        add(titleLabel);
        add(Box.createVerticalStrut(10));
        add(valueLabel);
    }
}
