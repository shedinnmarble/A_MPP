package prob2;

/**
 * Created by yafen on 2016/6/7.
 */
public class EquilateralTriangle implements ClosedCurve {
    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {

        this.sideLength = sideLength;
    }

    private double sideLength;
    @Override
    public double computePerimeter() {
        return 3*this.sideLength;
    }
}
