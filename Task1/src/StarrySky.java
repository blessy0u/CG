import javax.swing.*;
import java.awt.*;

public class StarrySky extends JPanel {
    private Cloud[] clouds;

    public StarrySky() {
        clouds = new Cloud[] {
                new Cloud(150, 100, 100, 50),
                new Cloud(500, 150, 120, 60),
                new Cloud(1000, 80, 140, 70),
                new Cloud(1500, 250, 80, 40),
                new Cloud(1900, 180, 110, 55)
        };
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        NightSky.drawSky(g2d, getWidth(), getHeight());

        Moon.drawMoon(g2d, getWidth() / 2, getHeight() / 2);

        Sea.drawSea(g2d, getWidth(), getHeight());

        Earth.drawEarth(g2d, getWidth(), getHeight() - 120);

        Hedgehog.drawHedgehog(g2d, getWidth() / 2, getHeight() - 100);

        // Draw clouds
        for (Cloud cloud : clouds) {
            cloud.draw(g2d);
        }
    }
}