package com.stormnet.figuresfx.figures;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Ellipse extends Figure {
    private double width;
    private double height;
    private double radius1;
    private double radius2;

    private Ellipse(double cx, double cy, double lineWidth, Color color) {
        super(Figure.FIGURE_TYPE_ELLIPSE, cx, cy, lineWidth, color);
    }

    public Ellipse(double cx, double cy, double lineWidth, Color color, double radius1, double radius2) {
        this(cx, cy, lineWidth, color);
        this.width = width < 10 ? 10 : width;
        this.height = height < 10 ? 10 : height;
        this.radius1 = radius1 < 10 ? 10 : radius1;
        this.radius2 = radius2 < 10 ? 10 : radius2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius1() {
        return radius1;
    }

    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return Double.compare(ellipse.width, width) == 0 &&
                Double.compare(ellipse.height, height) == 0 &&
                Double.compare(ellipse.radius1, radius1) == 0 &&
                Double.compare(ellipse.radius2, radius2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, radius1, radius2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ellipse{");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append(",radius1=").append(radius1);
        sb.append(",radius2=").append(radius2);
        sb.append(", cx=").append(cx);
        sb.append(", cy=").append(cy);
        sb.append(", lineWidth=").append(lineWidth);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(lineWidth);
        gc.setStroke(color);
        gc.strokeOval(cx, cy, radius1, height);
    }
}
