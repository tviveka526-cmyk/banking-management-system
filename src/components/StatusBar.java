package components;

import javax.swing.*;
import java.awt.*;

/**
 * Custom status bar component for bottom panel
 */
public class StatusBar extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel statusLabel;
    
    public StatusBar() {
        setBackground(new Color(52, 152, 219));
        setPreferredSize(new Dimension(0, 30));
        
        statusLabel = new JLabel("Ready");
        statusLabel.setForeground(Color.WHITE);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        
        add(statusLabel);
    }
    
    public void setStatus(String message) {
        statusLabel.setText(message);
    }
}
