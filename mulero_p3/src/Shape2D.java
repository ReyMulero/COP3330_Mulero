public abstract class Shape2D extends Shape{
    private String name;

    public void name(String name){
        this.name = name;
    }
    public Shape2D(){
        name = "";
        double area = 0.0;
    }

    @Override
    public String getname() {
        return name;
    }

}