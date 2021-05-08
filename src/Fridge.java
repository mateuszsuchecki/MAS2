import java.util.ArrayList;
import java.util.List;

public class Fridge {

    private String purpose;
    private List<Dish> dishList;


    public Fridge(String purpose) {
        this.purpose = purpose;
        this.dishList = new ArrayList<>();
    }

    public Fridge(String purpose, ArrayList<Dish> dishList) {
        this.purpose = purpose;
        this.dishList = dishList;

        /**Zwrotna do Dish*/
        for (Dish dish: dishList) {
            dish.addFridge(this);
        }
    }

    /**Zwrotna od Dish*/
    public void addDish(Dish dish){
        dishList.add(dish);
    }

    public String getPurpose() {
        return purpose;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    @Override
    public String toString() {
        return purpose + " fridge";
    }
}
