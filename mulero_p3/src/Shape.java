public abstract class Shape {
    private String name;
    private  Double area;

    public Shape() {
        name = "";
        area = 0.0;
    }
    public abstract double getArea();
    public abstract String getname();

}