package Drawing;

import Resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){
        return PI*this.radius*this.radius;
    }
    public double perimeter(){
        return 2*PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",area = "+this.getArea()+
                '}';
    }

    @Override
    public double resize(double percent) {
        this.radius = this.radius*percent/100;
        return this.getArea();
    }
}
