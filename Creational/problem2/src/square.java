public class square implements shape {
    private  double x;

    public square(){
        this.x = 0;
    }
    @Override
    public void setSides(double x, double y, double z) {
        this.x = x;
    }

    @Override
    public double area() {
        return x*x;
    }

    @Override
    public double perimeter() {
        return 4*x;
    }
}
