import java.io.IOException;
import java.util.ArrayList;

public class Server {
    ArrayList<User> clients;
    String state;
    public void setState(String states) throws IOException {
        state = states;
        notifyAllUsers();
    }
    public String getState(){
        return state;
    }

    public void addUsers(User user){
        clients.add(user);
        //System.out.println(getState());
    }
    public Server(){
        clients = new ArrayList<>();
        state = "Operational";
    }

    public void notifyAllUsers() throws IOException {
        for(User user : clients){
            user.update(state);
        }
    }
}
