import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.Random;

public class NightSky {
    public static void drawSky(Graphics2D g2d, int width, int height) {
        RadialGradientPaint gradientPaint = new RadialGradientPaint(
                new Point2D.Double(width / 2, height / 2),
                Math.max(width, height) / 2,
                new float[]{0.0f, 1.0f},
                new Color[]{new Color(8, 48, 110), new Color(1, 1, 39)});

        g2d.setPaint(gradientPaint);
        g2d.fillRect(0, 0, width, height);

        g2d.setColor(Color.WHITE);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            g2d.fill(new Ellipse2D.Double(x, y, 3, 3));
        }
    }
}
