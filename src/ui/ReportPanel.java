package ui;

import javax.swing.*;

/**
 * Panel for generating reports
 */
public class ReportPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public ReportPanel() {
        // To be implemented
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Report Panel");
        add(label);
    }
}
