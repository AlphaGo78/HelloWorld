package demo02;

public class Circle {

    public static final double PI = 3.14159;

    protected double r;

    public Circle(double r){
        this.r = r;
    }

    public double circumference(){
        return 2 * PI * r;
    }

    public double area(){
        return PI * r * r;
    }

    public double radius(){
        return r;
    }
}
