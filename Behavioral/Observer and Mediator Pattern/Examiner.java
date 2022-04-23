import java.io.IOException;
import java.util.Random;

public class Examiner extends Users{
    private int[] marks;

    public Examiner(Mediator mediator, String na) throws IOException {
        marks = new int[6];
        this.mediator = mediator;
        this.name = na;
        Random random = new Random();
        int num;
        for(int i=1; i<6; i++){
            num = random.nextInt();
            if(num<(num*(-1)))
                num = num * (-1);
            marks[i] = (num%100);
        }

    }

    @Override
    public void getMarks(int marks) {

    }

    @Override
    public void checkAgain(Users student) throws IOException {
        Random random = new Random();
        int error = random.nextInt()%2;
        int mark = student.getMark();

        if(error==0){
            int newmark = random.nextInt()%100;
            if(newmark<newmark*(-1)) newmark = newmark*(-1);
            System.out.println();
            System.out.println("Examiner rechecks and mark changes");
            mediator.sendRecheckMarks(student,newmark);
        }else {
            System.out.println();
            System.out.println("Examiner rechecks and mark unchanged");
            mediator.sendRecheckMarks(student,mark);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int getMark() {
        return 0;
    }

    @Override
    public void sendMarks() throws IOException {
        mediator.sendMarks(marks);
    }
}