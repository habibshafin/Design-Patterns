public class shapeFactory extends AbstractFactory{
    @Override
    public computer getcomputer(String s) {
        return null;
    }

    @Override
    public shape getshape(String s) {
        if(s.equalsIgnoreCase("circle")){
            return new circle();
        }else if (s.equalsIgnoreCase("rectangle")){
            return new rectangle();
        }else if (s.equalsIgnoreCase("triangle")){
            return new triangle();
        }else if (s.equalsIgnoreCase("square")){
            return new square();
        }else return null;
    }
}
