import java.util.ArrayList;
import java.util.List;

public class Dish {

    private String name;

    private Fridge fridge;
    private List<Amount> amountList;


    public Dish(String name) {
        this.name = name;
    }

    public Dish(String name, Fridge fridge) {
        this.name = name;
        this.fridge = fridge;

        /**Zwrotna do Fridge*/
        fridge.addDish(this);
    }

    /**Zwrotna od Fridge*/
    public void addFridge(Fridge fridge){
        this.fridge = fridge;
    }

    public Fridge getFridge() {
        return fridge;
    }

    @Override
    public String toString() {
        return ""+name;
    }
}
