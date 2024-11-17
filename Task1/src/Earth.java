import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Earth {
    public static void drawEarth(Graphics2D g2d, int width, int height) {
        int earthDiameter = 1500;
        g2d.setColor(new Color(89,121,144));
        g2d.fill(new Ellipse2D.Double(width / 2 - earthDiameter / 2, height, earthDiameter, earthDiameter));

        int earthDiameter1 = 1000;
        g2d.setColor(new Color(64,76,98));
        g2d.fill(new Ellipse2D.Double(width / 2 - earthDiameter1 / 2, height, earthDiameter1, earthDiameter1));

        int earthDiameter2 = 500;
        g2d.setColor(new Color(51,48,59));
        g2d.fill(new Ellipse2D.Double(width / 2 - earthDiameter2 / 2, height, earthDiameter2, earthDiameter2));
    }
}