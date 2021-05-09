import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private List<DishProduct> dishProductList = new ArrayList<>();;

    public Product(String name) {
        this.name = name;
    }

    public void addDish(Dish dish, int amount){
        DishProduct dishProduct = new DishProduct(amount, this, dish);
        dishProductList.add(dishProduct);
    }

    public void addDishProduct(DishProduct dishProduct){
        dishProductList.add(dishProduct);
    }

    public String getName() {
        return name;
    }

    public List<DishProduct> getDishProductList() {
        return dishProductList;
    }
}