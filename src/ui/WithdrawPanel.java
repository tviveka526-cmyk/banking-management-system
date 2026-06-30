package ui;

import javax.swing.*;

/**
 * Panel for withdrawal transactions
 */
public class WithdrawPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public WithdrawPanel() {
        // To be implemented
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Withdraw Panel");
        add(label);
    }
}
