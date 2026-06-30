package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Login frame for user authentication
 * Placeholder for authentication logic
 */
public class LoginFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField usernameField;
    private JPasswordField passwordField;
    
    public LoginFrame() {
        setTitle("Banking Management System - Login");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(240, 240, 240));
        
        // Header
        JLabel titleLabel = new JLabel("Welcome to Banking System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(40));
        mainPanel.add(titleLabel);
        
        // Username
        mainPanel.add(Box.createVerticalStrut(30));
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        mainPanel.add(usernameLabel);
        usernameField = new JTextField(20);
        usernameField.setMaximumSize(new Dimension(300, 30));
        mainPanel.add(usernameField);
        
        // Password
        mainPanel.add(Box.createVerticalStrut(15));
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        mainPanel.add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordField.setMaximumSize(new Dimension(300, 30));
        mainPanel.add(passwordField);
        
        // Login button
        mainPanel.add(Box.createVerticalStrut(30));
        JButton loginButton = new JButton("Login");
        loginButton.setMaximumSize(new Dimension(300, 40));
        loginButton.setBackground(new Color(41, 128, 185));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }
        });
        mainPanel.add(loginButton);
        
        add(mainPanel);
        setVisible(true);
    }
    
    private void loginUser() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
        // Simple authentication (in real app, validate against database)
        if (username.equals("admin") && password.equals("admin")) {
            dispose();
            new DashboardFrame();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
}
