package prob2;

/**
 * Created by yafen on 2016/6/7.
 */
public class Ellipse  implements ClosedCurve{
    public void setA(double a) {
        this.a = a;
    }

    public void setE(double e) {
        E = e;
    }

    private double a;
    private double E;
    public Ellipse(double a, double e){
        this.a=a;
        this.E=e;
    }
    @Override
    public double computePerimeter() {
        return 4*this.a*this.E;
    }
}
