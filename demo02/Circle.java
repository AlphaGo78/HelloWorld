package demo02;

public class Circle extends Shape{

    public static final double PI = 3.14159;

    protected double r;

    public Circle(double r){
        checkRadius(r);
        this.r = r;
    }

    protected void checkRadius(double radius){
        if(radius < 0){
            throw new IllegalArgumentException("radius may not be negative.");
        }
    }

    public double circumference(){
        return 2 * PI * r;
    }

    public double area(){
        return PI * r * r;
    }

    public double getRadius(){
        return r;
    }

    public void setRadius(double r){
        checkRadius(r);
        this.r = r;
    }
}
