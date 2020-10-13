public class Pyramid extends Shape3D {
    private double length,area = Math.round(.01),width, height;
    private String name;
    public Pyramid(double size1,double size2,double size3){
        super();
        name = "pyramid";
        length = size1;
        width = size2;
        height = size3;

    }

    @Override
    public double getVolume() {
        double volume =length;
        volume = ((length*width*height)/3);
        return volume;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public double getArea() {
        area = (length * width) + (length * Math.sqrt(Math.pow(width / 2, 2) +
                Math.pow(height, 2))) + (width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2)));
        area = Math.round(area*100.0)/100.0;
        return area;
    }
}
