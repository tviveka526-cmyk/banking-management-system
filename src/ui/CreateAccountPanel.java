package ui;

import javax.swing.*;

/**
 * Panel for creating new bank accounts
 */
public class CreateAccountPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public CreateAccountPanel() {
        // To be implemented
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Create Account Panel");
        add(label);
    }
}
