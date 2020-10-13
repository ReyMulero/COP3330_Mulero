public class Cube extends Shape3D {
   private double length,area;
   private String name;
    public Cube(double size){
        super();
        name = "cube";
        length = size;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public double getArea() {
        area = 6 * Math.pow(length,2);
        return area;
    }


}