
public abstract class Shape3D extends Shape2D{
    public Shape3D(double size) {
        super()
        ;
    }

    public Shape3D() {
            String name = "";
            double area = 0.0;

    }
    public abstract double getVolume();
    public abstract String getname();
    public abstract double getArea();
}