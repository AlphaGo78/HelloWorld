package demo02;

public class CenteredRectangle extends Rectangle implements Centered{
    private double cx;
    private double cy;

    public CenteredRectangle(double cx, double cy, double w, double h) {
        super(w, h);
        this.cx = cx;
        this.cy = cy;
    }

    @Override
    public void setCenter(double x, double y) {
        cx = x;
        cy = y;
    }

    @Override
    public double getCenterX() {
        return cx;
    }

    @Override
    public double getCenterY() {
        return cy;
    }
}
