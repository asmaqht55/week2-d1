public class Resizablecircle extends circlee{

    public Resizablecircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "Resizablecircle{" +
                "radius=" + radius +
                '}';
    }

    public double resize(int percent){
        return radius=percent/100.0;

    }
}
