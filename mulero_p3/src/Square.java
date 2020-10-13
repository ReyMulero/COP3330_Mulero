public class Square extends Shape2D {
    private double length;
    private String name;
    private double area;


    public Square (double size){
        name = "square";
        length= size;
    }

    @Override
    public String getname() {
        name = name;
        return name;
    }

    @Override
    public double getArea() {
        area = length * length;
        return area;
    }
}