public class circle implements shape {
    private double x;
    public circle(){
        x= 0;
    }
    @Override
    public void setSides(double x, double y, double z) {
        this.x = x;
    }

    @Override
    public double area() {
        return 3.1416*x*x;
    }

    @Override
    public double perimeter() {

        return 2*3.1416*x;
    }
}
