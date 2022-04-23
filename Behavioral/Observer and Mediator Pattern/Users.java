import java.io.IOException;

public abstract class Users {
    Mediator mediator;
    String name;
    public abstract void getMarks(int marks) throws IOException;
    public abstract void checkAgain(Users student) throws IOException;
    public abstract String getName();
    public abstract int getId();
    public abstract int getMark();
    public abstract void sendMarks() throws IOException;
}
