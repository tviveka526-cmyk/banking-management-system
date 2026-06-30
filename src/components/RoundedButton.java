package components;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * Custom button with rounded corners
 */
public class RoundedButton extends JButton {
    private static final long serialVersionUID = 1L;
    private int arcWidth = 15;
    private int arcHeight = 15;
    
    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        RoundRectangle2D rounded = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight);
        g2d.setColor(getBackground());
        g2d.fill(rounded);
        
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        RoundRectangle2D rounded = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight);
        g2d.setColor(getForeground());
        g2d.setStroke(new BasicStroke(1));
        g2d.draw(rounded);
    }
}
