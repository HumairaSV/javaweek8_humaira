package javaweek8_humaira.pool_p20;

public class Rectangle {
    double width;
    double length;
    double a;

    public Rectangle(){
    }

    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        a = width * length;
        return a;
    }

}
