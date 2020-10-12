public abstract class Shape2D extends Shape{
    private String name;
    private double area;
    public void name(String name){
        this.name = name;
    }
    public Shape2D(double size){
        name = "";
        area = 0.0;
    }

    @Override
    public String getname() {
        return name;
    }
}