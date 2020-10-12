public abstract class Shape2D extends Shape{

    public Shape2D(double i) {

    }

    @Override
    public double getArea(double size) {
      return size;
    }

    public abstract int getArea();
}
