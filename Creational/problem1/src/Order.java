import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<shake> shakelist = new ArrayList<shake>();
    int total = 0;
    void addShake(shake temp){
        shakelist.add(temp);
    }

    public void print() {
        for(int i = 0; i < shakelist.size(); i++){
            shakelist.get(i).baseIngredients();
            total = total + shakelist.get(i).getRate();

        }
        System.out.println("Total price : "+ total);
        total = 0;
    }
}
