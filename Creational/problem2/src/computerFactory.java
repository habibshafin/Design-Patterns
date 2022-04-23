public class computerFactory extends AbstractFactory {
    @Override
    public computer getcomputer(String s) {
        if(s.equalsIgnoreCase("computerA")){
            return new computerA();
        }else if(s.equalsIgnoreCase("computerB")){
            return new computerB();
        }else if (s.equalsIgnoreCase("computerC")){
            return new computerC();
        }else return null;
    }

    @Override
    public shape getshape(String s) {
        return null;
    }
}
