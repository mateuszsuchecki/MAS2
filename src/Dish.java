import java.util.ArrayList;
import java.util.List;

public class Dish {

    private String name;

    private Fridge fridge;
    private List<DishProduct> dishProductList = new ArrayList<>();


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

    public void addProduct(Product product, int amount){
        dishProductList.add(new DishProduct(amount, this, product));
    }

    public void addDishProduct(DishProduct dishProduct){
        dishProductList.add(dishProduct);
    }

    @Override
    public String toString() {
        return ""+name;
    }
}