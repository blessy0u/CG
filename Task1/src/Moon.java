import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Moon {

    private static final Random RANDOM = new Random();

    public static void drawMoon(Graphics2D g2d, int centerX, int centerY) {
        int moonDiameter = 400;
        int radius = moonDiameter / 2;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(new Color(220, 251, 253));
        g2d.fill(new Ellipse2D.Double(centerX - radius, centerY - radius, moonDiameter, moonDiameter));

        g2d.setColor(new Color(180,195,234));
        for (int i = 0; i < 50; i++) {
            int x = RANDOM.nextInt(moonDiameter) - radius;
            int y = RANDOM.nextInt(moonDiameter) - radius;

            double distance = (Math.sqrt(x * x + y * y)) + 20;

            if (distance < radius) {
                int size = RANDOM.nextInt(40) + 5;
                g2d.fillOval(centerX + x - size / 2, centerY + y - size / 2, size, size);
            }
        }
    }
}
