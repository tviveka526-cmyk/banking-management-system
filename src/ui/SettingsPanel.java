package ui;

import javax.swing.*;

/**
 * Panel for system settings
 */
public class SettingsPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public SettingsPanel() {
        // To be implemented
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Settings Panel");
        add(label);
    }
}
