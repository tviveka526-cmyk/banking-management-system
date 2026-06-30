package ui;

import javax.swing.*;

/**
 * Panel for viewing transactions
 */
public class TransactionPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public TransactionPanel() {
        // To be implemented
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Transaction Panel");
        add(label);
    }
}
