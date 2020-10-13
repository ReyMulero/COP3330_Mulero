public class Triangle extends Shape2D{
    private double length,Width;
    private String name;
    private double area;

    public Triangle(double size1, double size2){
        super();
        name = "triangle";
        length= size1;
        Width = size2;
    }

    @Override
    public String getname() {
        name = name;
        return name;
    }

    @Override
    public double getArea() {
        area = .5*(length * Width);
        return area;
    }

}
