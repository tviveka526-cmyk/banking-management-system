package ui;

import javax.swing.*;

/**
 * Panel for customer management
 */
public class CustomerPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public CustomerPanel() {
        // To be implemented
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Customer Panel");
        add(label);
    }
}
