package com.broadlyapplicable.shapeicons;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author dbell
 */
public class ShapeGenerator {

    public static final String GREEN = "#68C953";
    public static final String RED = "#CF3E3E";
    public static final String YELLOW = "#EDAD18";
    public static final String BLUEGREEN = "#22BDBD";

    public static Rectangle getStopIcon() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(65);
        rectangle.setWidth(65);
        rectangle.setFill(Paint.valueOf(RED));
        return rectangle;
    }

    public static Rectangle getHalfPause() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(75);
        rectangle.setWidth(30);
        rectangle.setFill(Paint.valueOf(YELLOW));
        return rectangle;
    }

    public static Polyline getUpdateIcon() {
        Polyline polygon = new Polyline();
        polygon.getPoints().addAll(new Double[]{
            0.0, 30.0,
            15.0, 0.0,
            30.0, 30.0,});
        polygon.setStroke(Paint.valueOf("#37A3E6"));
        polygon.setStrokeWidth(10.0);
        return polygon;
    }

    public static Polyline getCompletedIcon() {
        Polyline polygon = new Polyline();
        polygon.getPoints().addAll(new Double[]{
            0.0, 100.0, 40.0, 150.0, 80.0, 0.0
        });
        polygon.setStroke(Paint.valueOf(BLUEGREEN));
        polygon.setStrokeWidth(15.0);
        return polygon;
    }

    public static Polygon getPlayIcon() {
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
            0.0, 0.0,
            0.0, 100.0,
            75.0, 50.0});

        polygon.setFill(Paint.valueOf(GREEN));
        return polygon;
    }

}
