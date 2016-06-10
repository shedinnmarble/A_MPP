package prob2;

/**
 * Created by yafen on 2016/6/7.
 */
public class EquilateralTriangle implements Polygon {
    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {

        this.sideLength = sideLength;
    }

    private double sideLength;

    @Override
    public double[] getSides() {
        return new double[]{sideLength,sideLength,sideLength};
    }
}
