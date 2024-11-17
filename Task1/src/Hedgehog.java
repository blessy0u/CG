import java.awt.*;

public class Hedgehog {

    public static void drawHedgehog(Graphics2D g2d, int x, int y) {
        int[] xPoints1 = {x + 50, x + 70, x + 40, x, x - 40, x - 70, x - 50};
        int[] yPoints1 = {y - 45, y - 110, y - 100, y - 145, y - 100, y - 110, y - 45};
        g2d.setColor(new Color(37,0,51));
        g2d.fillPolygon(xPoints1, yPoints1, 7);


        int[] xPoints2 = {x + 45, x + 75, x + 35, x, x - 35, x - 75, x - 45};
        int[] yPoints2 = {y - 50, y - 110, y - 95, y - 140, y - 95, y - 110, y - 50};
        g2d.setColor(new Color(64,25,92));
        g2d.fillPolygon(xPoints2, yPoints2, 7);

        y = y - 50;
        g2d.setColor(new Color(91, 5, 32));
        g2d.fillOval(x - 55, y - 55, 110, 110);
        g2d.setColor(new Color(160, 57, 86));
        g2d.fillOval(x - 50, y - 50, 100, 100);

        g2d.setColor(new Color(29, 2, 45));
        g2d.fillRect(x - 50, y - 15, 35, 5);
        g2d.setColor(new Color(29, 2, 45));
        g2d.fillRect(x + 30, y - 15, 25, 5);
        g2d.setColor(new Color(29, 2, 45));
        g2d.fillOval(x - 25, y - 25, 40, 40);
        g2d.fillOval(x + 5, y - 25, 40, 40);
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x - 20, y - 20, 30, 30);
        g2d.fillOval(x + 10, y - 20, 30, 30);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(x - 20, y - 15, 10, 10);
        g2d.fillOval(x + 10, y - 15, 10, 10);

        g2d.setColor(new Color(91, 5, 32));
        int[] xPoints = {x + 5, x + 15, x + 10, x + 10, x + 5};
        int[] yPoints = {y + 15, y + 20, y + 25, y + 20, y + 15};
        g2d.fillPolygon(xPoints, yPoints, 5);

        g2d.setColor(new Color(103,1,22));
        g2d.fillArc(x - 30, y - 35, 60, 10, 180, -120);
        g2d.fillArc(x - 10, y - 35, 60, 5, 60, -120);

        g2d.setColor(new Color(91, 5, 32));
        g2d.fillArc(x - 20, y + 30, 20, 5, 160, -180);


        g2d.setColor(new Color(91, 5, 32));
        g2d.fillOval(x - 65, y, 20, 40);
        g2d.fillOval(x + 45, y, 20, 40);
        g2d.setColor(new Color(160, 57, 86));
        g2d.fillOval(x - 60, y, 10, 30);
        g2d.fillOval(x + 50, y, 10, 30);

        g2d.setColor(new Color(91, 5, 32));
        g2d.fillRect(x + 5, y + 50, 10, 30);
        g2d.setColor(new Color(91, 5, 32));
        g2d.fillRect(x - 15, y + 50, 10, 30);
        g2d.setColor(new Color(160, 57, 86));
        g2d.fillRect(x + 10, y + 50, 5, 25);
        g2d.setColor(new Color(160, 57, 86));
        g2d.fillRect(x - 10, y + 50, 5, 25);
        g2d.setColor(new Color(160, 57, 86));
        g2d.fillOval(x + 7, y + 75, 15, 7);
        g2d.fillOval(x - 13, y + 75, 15, 7);
    }
}