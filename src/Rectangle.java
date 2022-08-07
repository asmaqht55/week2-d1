public class Rectangle extends shape{
  protected double width=1.0;
   protected double length=1.0;
   public Rectangle(){

   }
public  Rectangle(int width,int length) {
    this.width = width;
    this.length = length;
}
public Rectangle(double width,double length,String color,boolean filled){
       super(color,filled);
       this.length=length;
       this.width=width;
}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
