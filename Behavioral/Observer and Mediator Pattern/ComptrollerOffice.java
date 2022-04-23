import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ComptrollerOffice implements Mediator {
    ArrayList<Users> students ;
    Users examiner;
    int [] marks;

    public ComptrollerOffice() throws IOException {
        students = new ArrayList<>();
        students.add(new Student(this,1));
        students.add(new Student(this,2));
        students.add(new Student(this,3));
        students.add(new Student(this,4));
        students.add(new Student(this,5));
        examiner = new Examiner(this,"examiner");
        examiner.sendMarks();
        marks = new int[6];
    }

    @Override
    public void send() {
    }

    @Override
    public void sendMarks(int [] arr) throws IOException {
        marks = arr;
        System.out.println("Marks sent by examiner to controller:");
        printMarks();
        scrutinize();
    }

    @Override
    public void printMarks() {
        for(int i=1; i<6; i++){
            System.out.println("student id : "+i+" marks obtained : "+marks[i]);
        }
    }

    @Override
    public void scrutinize() throws IOException {
        System.out.println();
        System.out.println("Comptroller office starts scrutinizing");
        int check=0;
        int newmark;
        Random random = new Random();
        for(int i=1; i<6; i++){
            check = random.nextInt()%2;
            //if(check<(check*(-1)))
                //check = check*(-1);
            if(check==0){
                newmark = random.nextInt()%100;
                int previousMark = marks[i];
                if(newmark < newmark*(-1)) newmark = newmark * -1;
                System.out.println("Student id : "+i+" previous mark: "+previousMark+" new mark : "+newmark);
                marks[i] = newmark;
            }else{
                //do nothing
            }
        }
        System.out.println("scrutiny ends");
        System.out.println();
        for(int i =1 ; i<6; i++)
            publish(students.get(i-1),marks[i]);
    }

    public void publish(Users user, int mark) throws IOException {
        if(user.getName().equalsIgnoreCase("examiner")){
            //so nothing
        }else {
            user.getMarks(mark);
        }
    }

    @Override
    public void Recheck(Users user) throws IOException {
        int previousMark = user.getMark();
        System.out.println(previousMark);

        if (examiner==null) System.out.println("ken vai!");
            examiner.checkAgain(user);
    }

    @Override
    public void sendRecheckMarks(Users student, int newmark) throws IOException {
        marks[student.getId()] = newmark;
        System.out.println();
        System.out.println("Comptroller office sends marks after recheck");
        System.out.println();
        publish(student,newmark);
    }
}
