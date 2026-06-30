package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Splash screen displayed on application startup
 * Shows loading animation and transitions to login frame
 */
public class SplashScreen extends JFrame {
    private static final long serialVersionUID = 1L;
    
    public SplashScreen() {
        setTitle("Banking Management System");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        
        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Background gradient
                GradientPaint gradient = new GradientPaint(0, 0, new Color(26, 188, 156),
                        getWidth(), getHeight(), new Color(41, 128, 185));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
                
                // Title
                g2d.setColor(Color.WHITE);
                g2d.setFont(new Font("Arial", Font.BOLD, 32));
                g2d.drawString("Banking Management System", 80, 150);
                
                // Loading text
                g2d.setFont(new Font("Arial", Font.PLAIN, 14));
                g2d.drawString("Loading...", 250, 250);
            }
        };
        
        add(panel);
        setVisible(true);
        
        // Simulate loading and transition to login
        Timer timer = new Timer(3000, e -> {
            dispose();
            new LoginFrame();
        });
        timer.setRepeats(false);
        timer.start();
    }
}
