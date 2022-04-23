public class rectangle implements shape {
    private double x;
    private double y;

    public rectangle(){
        this.x = 0;
        this.y = 0;
    }
    @Override
    public void setSides(double x, double y, double z) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return x*y;
    }

    @Override
    public double perimeter() {
        return 2*(x+y);
    }
}
