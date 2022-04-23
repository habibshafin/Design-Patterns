import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CompositeDesignDemo {
    ArrayList<Component> components;

    public CompositeDesignDemo(){
        components = new ArrayList<>();
    }
    public static void main(String[] args) throws IOException {
        CompositeDesignDemo compositeDesignDemo = new CompositeDesignDemo();
        start:
        while(true){
            System.out.println("1. Create a new drive 2. Select 3. Show All 4. Remove");
            BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
            String st = str.readLine();
            int choice = Integer.parseInt(st);
            if(choice==1){
                System.out.println("Enter the name of the drive to be created");
                String name = str.readLine();
                compositeDesignDemo.components.add(new Composite(name,"drive",null));
                compositeDesignDemo.printAll();
            }else if (choice==2){
                System.out.println("Enter your choice");
                for(int i =0; i< compositeDesignDemo.components.size(); i++) {
                    System.out.print(i+". "+compositeDesignDemo.components.get(i).getName()+" ");
                }
                System.out.println();
                int selection = Integer.parseInt(str.readLine());
                Component selected = compositeDesignDemo.components.get(selection);
                Component previousSelected = compositeDesignDemo.components.get(selection);
                while(true){
                    System.out.println("Selected : "+selected.getName()+" : " + selected.getType());
                    System.out.println("1. Add Folder 2. Add File 3. select 4. Details 5. Exit 6. Show All 7. Back 8. Remove");
                    int job = Integer.parseInt(str.readLine());
                    if(job ==1 ){
                        if(selected.getType().equalsIgnoreCase("file"))
                            System.out.println("It is a file. It can not have folders");
                        else {
                            System.out.println("Enter the name of the folder to be created");
                            String name = str.readLine();
                            String directory = selected.getDirectory() + "\\" + name;
                            selected.addFolder(new Composite(name, "folder", selected));
                            compositeDesignDemo.printAll();
                        }
                    }else if (job==2){
                        if(selected.getType().equalsIgnoreCase("file"))
                            System.out.println("It is a file. It can not have files");
                        else {
                            System.out.println("Enter the name of the file to be created");
                            String name = str.readLine();
                            String directory = selected.getDirectory() + "\\" + name;
                            selected.addFile(new Composite(name, "file", selected));
                            compositeDesignDemo.printAll();
                        }
                    }else if(job==3){
                        System.out.println("Enter your choice");
                        if(selected.getComponents().size()==0)
                            System.out.println("Empty");
                        else {
                            for (int i = 0; i < selected.getComponents().size(); i++) {
                                System.out.print(i + ". " + selected.getComponents().get(i).getName() + " ");
                            }
                            System.out.println();
                            selection = Integer.parseInt(str.readLine());
                            selected = selected.getComponents().get(selection);
                        }
                    }else if(job==4){
                        System.out.println();
                        selected.details();
                    }else if(job==5){
                        return;
                    }else if (job==6){
                        compositeDesignDemo.printAll();
                    }else if(job==7){
                        if(selected.getParent()!=null)
                            selected = selected.getParent();
                        else {
                            continue start;
                        }
                    } else if(job==8){
                        System.out.println("Enter your choice");
                        if(selected.getComponents().size()==0)
                            System.out.println("Empty");
                        else {
                            for (int i = 0; i < selected.getComponents().size(); i++) {
                                System.out.print(i + ". " + selected.getComponents().get(i).getName() + " ");
                            }
                            System.out.println();
                            selection = Integer.parseInt(str.readLine());
                            //selected.getComponents().remove(selected.getComponents().get(selection));
                            selected.remove(selected.getComponents().get(selection));
                            compositeDesignDemo.printAll();
                        }
                    }
                    else{
                        System.out.println("Invalid choice");
                    }
                }
                }
            else if(choice==3){
                compositeDesignDemo.printAll();
            }
            else if(choice==4){
                System.out.println("Enter your choice");
                for(int i =0; i< compositeDesignDemo.components.size(); i++) {
                    System.out.print(i+". "+compositeDesignDemo.components.get(i).getName()+" ");
                }
                System.out.println();
                int selection = Integer.parseInt(str.readLine());
                compositeDesignDemo.getComponents().remove(compositeDesignDemo.getComponents().get(selection));
                compositeDesignDemo.printAll();
            }
            else{
                System.out.println("Invalid Choice");
            }
        }
    }

    private void increaseCount() {

    }
    public void printAll(){
        for(Component c: components){
            System.out.println(c.getName());
            //System.out.println("Total Component Count : "+ c.getComponentCount() );
            c.list();
        }
    }
    public ArrayList<Component> getComponents(){
        return components;
    }
}
