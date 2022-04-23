import java.util.ArrayList;

public class Leaf implements Component {
    String name;
    String type;
    String directory;
    int componentCount;
    Component parent;

    public Leaf(String name, String type, Component parent){
        this.name = name;
        this.componentCount = 0;
        this.type = type;
        this.parent = parent;
        parent.increaseComponentCount();
        if(parent==null)
            directory = name;
        else
            directory = parent.getDirectory()+"\\"+name;
    }
    @Override
    public void list() {
        //System.out.println("It is a leaf object");
    }

    @Override
    public void details() {
        System.out.println("Name : "+name);
        System.out.println("Type : "+type);
        System.out.println("Directory : \"" +directory+" \"");
        System.out.println("Component Count : "+componentCount);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getDirectory() {
        return directory;
    }

    @Override
    public void addFile(Component c) {

    }

    @Override
    public void addFolder(Component c) {

    }

    @Override
    public ArrayList<Component> getComponents() {
        return null;
    }

    @Override
    public int getComponentCount() {
        return 0;
    }

    @Override
    public Component getParent() {
        return parent;
    }

    @Override
    public void increaseComponentCount() {

    }

    @Override
    public void remove(Component component) {

    }
}
