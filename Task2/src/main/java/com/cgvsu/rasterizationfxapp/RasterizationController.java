package com.cgvsu.rasterizationfxapp;

import com.cgvsu.rasterization.EllipseFiller;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class RasterizationController {

    @FXML
    AnchorPane anchorPane;
    @FXML
    private Canvas canvas;

    @FXML
    private void initialize() {
        anchorPane.prefWidthProperty().addListener((ov, oldValue, newValue) -> canvas.setWidth(newValue.doubleValue()));
        anchorPane.prefHeightProperty().addListener((ov, oldValue, newValue) -> canvas.setHeight(newValue.doubleValue()));

        EllipseFiller.fillEllipse(canvas.getGraphicsContext2D(), 300, 300, 200, 100, Color.BLACK, Color.GRAY);
    }
}