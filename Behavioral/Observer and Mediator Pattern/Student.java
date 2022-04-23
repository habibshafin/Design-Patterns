import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student extends Users {
    int id;
    String name;
    int mark;
    boolean checked;
    Mediator mediator;

    public Student(Mediator mediator,int num){
        id = num;
        name = "student";
        mark = 0;
        this.mediator = mediator;
        checked = false;
    }

    @Override
    public void getMarks(int marks) throws IOException {
        mark = marks;
        System.out.println("Student id : "+id+" gets mark from office : "+marks);
        if(checked==false){
        System.out.println("1. Apply for recheck 2. Nothing");
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(str.readLine());
        if(choice==1){
            checked = true;
            mediator.Recheck(this);

        }else{
            //do nothing
        }
        }

    }

    @Override
    public void checkAgain(Users student) {
        //do nothing
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getMark() {
        return mark;
    }

    @Override
    public void sendMarks() throws IOException {

    }
}
