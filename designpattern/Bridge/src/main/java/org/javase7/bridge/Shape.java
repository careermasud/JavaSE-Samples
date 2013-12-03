package org.javase7.bridge;

/**
 *
 * @author Masudul Haque
 */
public abstract class Shape {

    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();                             // low-level

    public abstract void resizeByPercentage(double pct);     // high-level
}
