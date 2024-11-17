import java.awt.*;

public class Sea {
    public static void drawSea(Graphics2D g2d, int width, int height) {
        GradientPaint gradient = new GradientPaint(0, height - 100, new Color(100, 180, 217), 0, height, new Color(23, 76, 126));
        g2d.setPaint(gradient);
        g2d.fillRect(0, height - 100, width, 100);
    }
}
