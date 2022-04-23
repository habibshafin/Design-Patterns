import java.util.ArrayList;

public class Composite implements Component{
    String name;
    String type;
    String directory;
    int componentCount;
    Component parent;
    ArrayList<Component> components;

    public ArrayList<Component> getComponents(){
        return components;
    }

    @Override
    public int getComponentCount() {
        return componentCount;
    }

    @Override
    public Component getParent() {
        return parent;
    }

    public void addFolder(Component c){
        components.add(c);
        //components.get(components.size()-1).details();
    }
    public void addFile(Component leaf){
        components.add(leaf);
        increaseComponentCount();
    }

    public Composite(String name, String type, Component parent){
        this.name = name;
        componentCount = 0;
        this.type = type;
        components = new ArrayList<>();
        this.parent = parent;
        if(parent==null)
            directory = name+":";
        else
            directory = parent.getDirectory()+"\\"+name;
    }

    public void increaseComponentCount(){
        componentCount = componentCount + 1;
        if(parent!=null)
            parent.increaseComponentCount();
    }

    @Override
    public void remove(Component component) {
        componentCount = componentCount - component.getComponentCount();
        components.remove(component);
    }

    public String getType(){
        return type;
    }

    @Override
    public String getDirectory() {
        return directory;
    }

    @Override
    public void list() {
        for(int i=0; i<components.size(); i++){
            System.out.print("   --");
            System.out.println(components.get(i).getName());
            if((components.get(i).getType()=="drive"||components.get(i).getType()=="folder")&& components.get(i).getComponents().size()>0){
                System.out.print("     ");
                components.get(i).list();
            }
        }
    }

    @Override
    public void details() {
        System.out.println("Name : "+name);
        System.out.println("Type : "+type);
        System.out.println("Directory : \"" +directory+"\"");
        System.out.println("Component Count : "+componentCount);
    }

    @Override
    public String getName() {
        return name;
    }
}
