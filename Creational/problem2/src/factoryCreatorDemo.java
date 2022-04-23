import java.io.IOException;
import java.util.Scanner;

public class factoryCreatorDemo {
    public static void main(String[] args)throws IOException {
        System.out.println("Enter the Computer Name:");
        Scanner sc = new Scanner(System.in);
        String computerName = sc.nextLine();
        System.out.println("Enter the Shape Name");
        Scanner sc1 = new Scanner(System.in);
        String shapeName = sc1.nextLine();
        AbstractFactory computerFactory=factoryCreator.getfactory("computer");
        computer c=computerFactory.getcomputer(computerName);


        AbstractFactory shapeFactory=factoryCreator.getfactory("shape");
        shape s=shapeFactory.getshape(shapeName);
        if(shapeName.equalsIgnoreCase("circle")){
            System.out.println("Enter radius: ");
            Scanner sc2 = new Scanner(System.in);
            double radius = Double.parseDouble(sc2.nextLine());
            s.setSides(radius,0,0);
        }else if(shapeName.equalsIgnoreCase("triangle")){
            System.out.println("enter the sides of a triangle");
            Scanner sc3 = new Scanner(System.in);
            double x = Double.parseDouble(sc3.nextLine());
            Scanner sc4 = new Scanner(System.in);
            double y = Double.parseDouble(sc4.nextLine());
            Scanner sc5 = new Scanner(System.in);
            double z = Double.parseDouble(sc5.nextLine());
            s.setSides(x,y,z);
        }else if(shapeName.equalsIgnoreCase("rectangle")){
            System.out.println("enter the sides of rectangle");
            Scanner sc6 = new Scanner(System.in);
            double x = Double.parseDouble(sc6.nextLine());
            Scanner sc7 = new Scanner(System.in);
            double y = Double.parseDouble(sc7.nextLine());
            s.setSides(x,y,0);
        }else if(shapeName.equalsIgnoreCase("square")){
            System.out.println("enter any side of a square");
            Scanner sc8 = new Scanner(System.in);
            double x = Double.parseDouble(sc8.nextLine());
            s.setSides(x,0,0);
        }
        System.out.println(computerName);
        System.out.println("Resolution is : "+c.getResolution());
        System.out.println(shapeName);
        System.out.println("perimeter: " + s.perimeter());
        System.out.println("area : "+ s.area());
    }
}
