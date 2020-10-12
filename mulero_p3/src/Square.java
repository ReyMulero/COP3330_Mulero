public class Square extends Shape2D {
    private double length;
    private String name;
    private double area;


    public Square (double size){
        super(size);
        name = "Square";
        length= size;
    }

    @Override
    public double getArea() {
        area = length * length;
        return area;
    }
}