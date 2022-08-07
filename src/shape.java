public abstract class shape {
    protected String Color="red";
    protected Boolean filled=true;
    public  shape(){
    }
    public shape(String color,boolean filled){
        this.Color="color";
        this.filled= Boolean.valueOf("filled");
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "shape{" +
                "Color='" + Color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
