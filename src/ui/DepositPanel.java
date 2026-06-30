package ui;

import javax.swing.*;

/**
 * Panel for deposit transactions
 */
public class DepositPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public DepositPanel() {
        // To be implemented
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Deposit Panel");
        add(label);
    }
}
