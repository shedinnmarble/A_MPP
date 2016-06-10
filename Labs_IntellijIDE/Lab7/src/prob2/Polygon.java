package prob2;

import java.util.stream.DoubleStream;

/**
 * Created by yafen on 2016/6/7.
 */
public interface Polygon extends ClosedCurve {
    double[] getSides();

    @Override
    default double computePerimeter() {
        return DoubleStream.of(getSides()).sum();
    }
}
