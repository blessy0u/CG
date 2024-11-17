import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cloud {
    private List<Ellipse2D.Float> shapes;
    private int x, y;

    public Cloud(int x, int y, int size, int fluffiness) {
        this.x = x;
        this.y = y;

        shapes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < fluffiness; i++) {
            int offsetX = random.nextInt(size * 2) - size;
            int offsetY = random.nextInt(size * 2) - size;
            float scale = random.nextFloat() * 0.5f + 0.5f;
            shapes.add(new Ellipse2D.Float(x + offsetX, y + offsetY, size * scale, size * scale));
        }
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(255, 255, 255, 150));
        for (Ellipse2D.Float shape : shapes) {
            g2d.fill(shape);
        }
    }
}