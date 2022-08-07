public class circlee {
    protected double radius=1.0;

    public circlee(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
    return radius*2;
    }
    public double getArea(){
        return radius*radius;
    }

    @Override
    public String toString() {
        return "circlee{" +
                "radius=" + radius +
                '}';
    }
}
