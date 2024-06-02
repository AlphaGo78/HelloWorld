package demo02;

public class PlaneCircle extends Circle{

    private final double cx;

    private final double cy;

    public PlaneCircle(double r, double cx, double cy) {
        super(r);
        this.cx = cx;
        this.cy = cy;
    }

    public double getCentreX(){
        return cx;
    }

    public double getCentreY(){
        return cy;
    }

    public boolean isInside(double x, double y){
        double dx = x - cx;
        double dy = y - cy;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return (distance < r);
    }
}
