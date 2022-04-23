import java.util.ArrayList;
import java.util.List;

abstract class shake{
    int rate;
    List<String> ingredients = new ArrayList<String>(1000);
    List<String> addedIngredients = new ArrayList<String>(1000);
    abstract void baseIngredients();
    abstract void addIngredient(String ing);

    public int getRate() {
        return rate;
    }
}
