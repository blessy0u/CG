package com.cgvsu.rasterization;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class EllipseFiller {

    public static void fillEllipse(GraphicsContext gc, double xc, double yc, double a, double b,
                                   Color startColor, Color endColor) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Полуоси должны быть положительными.");
        }
        if (startColor == null || endColor == null) {
            throw new NullPointerException("Цвета не могут быть null.");
        }

        for (int y = (int) Math.floor(yc - b); y <= (int) Math.floor(yc + b); y++) {
            double xLeft = xc - (a / b) * Math.sqrt(b * b - (y - yc) * (y - yc));
            double xRight = xc + (a / b) * Math.sqrt(b * b - (y - yc) * (y - yc));

            if (!Double.isNaN(xLeft) && !Double.isNaN(xRight)) {
                int leftX = (int) Math.floor(xLeft);
                int rightX = (int) Math.ceil(xRight);

                Color color = interpolateColor(y, yc, b, startColor, endColor);

                for (int x = leftX; x <= rightX; x++) {
                    if (x >= 0 && y >= 0) {
                        gc.setFill(color);
                        gc.fillRect(x, y, 1, 1);
                    }
                }
            }
        }
    }

    private static Color interpolateColor(int y, double yc, double b, Color startColor, Color endColor) {
        double distance = Math.abs(y - yc) / b;
        distance = Math.min(distance, 1);

        double red = startColor.getRed() * (1 - distance) + endColor.getRed() * distance;
        double green = startColor.getGreen() * (1 - distance) + endColor.getGreen() * distance;
        double blue = startColor.getBlue() * (1 - distance) + endColor.getBlue() * distance;

        red = clamp(red, 0, 1);
        green = clamp(green, 0, 1);
        blue = clamp(blue, 0, 1);

        return Color.color(red, green, blue);
    }

    private static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }
}