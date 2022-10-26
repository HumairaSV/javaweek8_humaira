package javaweek8_humaira.cylinder_p19;

public class Circle {
    double radius;

    public Circle(){
    }

    public Circle(double radius){
        if(radius<0){
            this.radius = 0;
        }else{
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (radius*radius* Math.PI);
    }

}
