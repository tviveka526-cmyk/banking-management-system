package ui;

import javax.swing.*;

/**
 * Panel for transfer transactions
 */
public class TransferPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public TransferPanel() {
        // To be implemented
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Transfer Panel");
        add(label);
    }
}
