package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Main dashboard frame
 * Displays overview and navigation to other panels
 */
public class DashboardFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    
    public DashboardFrame() {
        setTitle("Banking Management System - Dashboard");
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create main panel with border layout
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Header
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(41, 128, 185));
        JLabel headerLabel = new JLabel("Banking Management System Dashboard");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(headerLabel);
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        
        // Sidebar (Navigation)
        JPanel sidebarPanel = createSidebar();
        mainPanel.add(sidebarPanel, BorderLayout.WEST);
        
        // Content area
        JPanel contentPanel = createContentPanel();
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        
        // Footer
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(52, 152, 219));
        JLabel footerLabel = new JLabel("© 2024 Banking Management System v1.0");
        footerLabel.setForeground(Color.WHITE);
        footerPanel.add(footerLabel);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        setVisible(true);
    }
    
    private JPanel createSidebar() {
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(new Color(236, 240, 241));
        sidebar.setPreferredSize(new Dimension(200, 0));
        
        JButton[] buttons = {
                new JButton("Dashboard"),
                new JButton("Create Account"),
                new JButton("Deposit"),
                new JButton("Withdraw"),
                new JButton("Transfer"),
                new JButton("View Transactions"),
                new JButton("View Customers"),
                new JButton("Reports"),
                new JButton("Settings"),
                new JButton("Logout")
        };
        
        sidebar.add(Box.createVerticalStrut(10));
        for (JButton button : buttons) {
            button.setMaximumSize(new Dimension(180, 40));
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            sidebar.add(button);
            sidebar.add(Box.createVerticalStrut(5));
        }
        sidebar.add(Box.createVerticalGlue());
        
        return sidebar;
    }
    
    private JPanel createContentPanel() {
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setBackground(Color.WHITE);
        
        JLabel welcomeLabel = new JLabel("Welcome to Banking Management System");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        content.add(Box.createVerticalStrut(20));
        content.add(welcomeLabel);
        
        JLabel infoLabel = new JLabel("Select an option from the menu on the left to get started.");
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        content.add(Box.createVerticalStrut(10));
        content.add(infoLabel);
        
        return content;
    }
}
