public class triangle implements shape {
    private double x;
    private double y;
    private double z;

    public triangle(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    @Override
    public void setSides(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double area() {
        double s = (x+y+z)/2;
        return Math.sqrt(s*(s-x)*(s-y)*(s-z));
    }

    @Override
    public double perimeter() {
        return x+y+z;
    }
}
