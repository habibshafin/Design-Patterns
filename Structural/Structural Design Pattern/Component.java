import java.util.ArrayList;

public interface Component {
    public void list();
    public void details();
    public String getName();
    public String getType();
    public String getDirectory();
    public void addFile(Component c);
    public void addFolder(Component c);
    public ArrayList<Component> getComponents();
    public int getComponentCount();
    public Component getParent();
    public void increaseComponentCount();
    public void remove(Component component);

}
