class factoryCreator{
    public static AbstractFactory getfactory(String s)
    {
        if(s.equalsIgnoreCase("shape"))
        {
            return new shapeFactory();
        }
        else if(s.equalsIgnoreCase("computer"))
        {
            return new computerFactory();
        }
        return null;
    }

}