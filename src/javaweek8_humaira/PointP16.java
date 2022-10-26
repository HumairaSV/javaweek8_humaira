package javaweek8_humaira;

/*
16. Point
You have to represent a point in 2D space. Write a class with the name Point. The class needs two
fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg
constructor). The second constructor has parameters x and y of type int and it needs to initialize the
fields.
 */
public class PointP16 {
    int x;
    int y;

    public PointP16() {
    }

    public PointP16(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        this.x = a;
    }

    public void setY(int b) {
       this.y = b;
    }
    public double distance(){
        return distance(0,0);
    }

    public double distance ( int x, int y){
        return Math.sqrt((x-this.x)*(x- this.x)+(y- this.y)*(y - this.y));
    }
    public double distance(PointP16 secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        PointP16 first = new PointP16(6, 5);
        PointP16 second = new PointP16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        PointP16 point = new PointP16();
        System.out.println("distance()= " + point.distance());
    }

}
