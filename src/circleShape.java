public class circleShape extends shape{
    protected double radius=1.0;
    public circleShape (){

    }
    public void circleShape(int radius){
        this.radius=radius;
    }
    public void circleShape(int radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "circleShape{" +
                "Color='" + Color + '\'' +
                '}';
    }
}
