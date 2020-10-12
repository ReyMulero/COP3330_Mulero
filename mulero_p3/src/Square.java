class Square extends Shape2D {
    private String name;
    private double area;
    private double size;

    public Square(double size) {
        super(size);
        this.size = size;
    }


    @Override
    public void getname() {
        this.name =name;
    }

    @Override
    public int getArea() {
        area = size*size;
        return 0;
    }
}
