public class Sphere extends Shape3D {
    private double Radius,area;
    private String name;
    public Sphere(double size1){
        super();
        name = "sphere";
        Radius = size1;



    }

    @Override
    public double getVolume() {
        double volume;
        volume = 4.0/3.0;
        System.out.println(volume);
        volume = volume* Math.PI;
        System.out.println(volume);
        volume = volume * Math.pow(Radius,3);
        System.out.println(volume);
        return volume;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public double getArea() {
        area = (4 * Math.PI * Math.pow(Radius, 2));
        area = Math.round(area*100.0)/100.0;
        return area;
    }
}
