import javax.swing.*;
import java.awt.*;

public class CampusMap extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Anti-aliasing for smoother graphics
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw buildings and labels
        drawBuilding(g2d, "GROUND", 10, 10, 200, 50, Color.BLACK);
        drawBuilding(g2d, "HOSTEL", 800, 10, 200, 50, Color.DARK_GRAY);
        drawBuilding(g2d, "BARONS", 10, 80, 100, 40, Color.MAGENTA);
        drawBuilding(g2d, "MAC", 10, 140, 100, 40, Color.YELLOW);
        drawBuilding(g2d, "ENROLLMENT OFFICE", 10, 200, 150, 40, Color.ORANGE);
        drawBuilding(g2d, "COLLEGE GATE", 10, 260, 100, 40, Color.BLUE);
        drawBuilding(g2d, "LIBRARY", 220, 80, 200, 200, Color.CYAN);
        drawBuilding(g2d, "IT BLOCK", 430, 80, 100, 100, Color.LIGHT_GRAY);
        drawBuilding(g2d, "DESIGN-BLOCK", 540, 80, 100, 100, Color.MAGENTA);
        drawBuilding(g2d, "BLOCK 7", 540, 190, 100, 60, Color.DARK_GRAY);
        drawBuilding(g2d, "BLOCK 6", 430, 190, 100, 60, Color.LIGHT_GRAY);
        drawBuilding(g2d, "OLDAMPHI", 220, 290, 100, 60, Color.GRAY);
        drawBuilding(g2d, "BLOCK 1", 330, 290, 100, 60, Color.DARK_GRAY);
        drawBuilding(g2d, "BLOCK 2", 430, 260, 100, 60, Color.GRAY);
        drawBuilding(g2d, "BLOCK 3", 540, 260, 100, 60, Color.DARK_GRAY);
        drawBuilding(g2d, "BLOCK 4", 430, 330, 100, 60, Color.GRAY);
        drawBuilding(g2d, "BLOCK 5", 540, 330, 100, 60, Color.DARK_GRAY);
        drawBuilding(g2d, "ENERGY HOUSE", 330, 360, 100, 60, Color.DARK_GRAY);
        drawBuilding(g2d, "NESCAFE", 540, 260, 100, 60, Color.RED);
        drawBuilding(g2d, "FOOD COURT", 220, 360, 200, 60, Color.BLUE);
        drawBuilding(g2d, "Gandhi Chowk", 650, 150, 100, 100, Color.RED);
        drawBuilding(g2d, "MDC", 800, 80, 100, 60, Color.ORANGE);
        drawBuilding(g2d, "R&D", 800, 150, 200, 60, Color.RED);
        drawBuilding(g2d, "NEW AMP", 800, 220, 100, 60, Color.GRAY);
        drawBuilding(g2d, "BLOCK 9", 900, 220, 100, 60, Color.DARK_GRAY);
        drawBuilding(g2d, "BLOCK 10", 1000, 220, 100, 60, Color.GRAY);
        drawBuilding(g2d, "BLOCK 11", 1100, 220, 100, 60, Color.DARK_GRAY);

        // Draw routes (lines)
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));

        // Example of drawing routes between buildings
        g2d.drawLine(110, 100, 220, 180); // BARONS to LIBRARY
        g2d.drawLine(60, 220, 110, 180); // ENROLLMENT OFFICE to COLLEGE GATE
        g2d.drawLine(320, 180, 220, 210); // LIBRARY to OLDAMPHI
        g2d.drawLine(520, 210, 430, 230); // DESIGN-BLOCK to BLOCK 3
        g2d.drawLine(750, 100, 900, 100); // HOSTEL to MDC

        // Add more routes as needed...

    }

    private void drawBuilding(Graphics2D g2d, String label, int x, int y, int width, int height, Color color) {
        g2d.setColor(color);
        g2d.fillRect(x, y, width, height);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x, y, width, height);
        g2d.setColor(Color.WHITE);
        g2d.drawString(label, x + 10, y + height / 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Campus Map");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 500);
        frame.add(new CampusMap());
        frame.setVisible(true);
    }
}
