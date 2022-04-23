import java.io.IOException;

public interface Mediator {
    public void send();
    public void sendMarks(int [] arr) throws IOException;
    public void printMarks();
    public void scrutinize() throws IOException;
    public void publish(Users user,int mark) throws IOException;
    public void Recheck(Users user) throws IOException;

    public void sendRecheckMarks(Users student, int newmark) throws IOException;
}
