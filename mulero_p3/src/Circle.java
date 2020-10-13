public class Circle extends Shape2D {
    private String name;
    private double area,R;
    public Circle(double radius){
        super();
        name = "circle";
        R = radius;
    }

    @Override
    public String getname() {
        name = name;
        return name;
    }

    @Override
    public double getArea() {
        area = Math.PI * (Math.pow(R,2));
        return area;
    }
}
