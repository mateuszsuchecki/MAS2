public class DishProduct {

    private int amount;

    private Product product;
    private Dish dish;

    public DishProduct(int amount) {
        this.amount = amount;
    }

    public DishProduct(int amount, Product product, Dish dish) {
        this.amount = amount;
        this.product = product;
        this.dish = dish;

        dish.addDishProduct(this);
    }

    public DishProduct(int amount, Dish dish, Product product) {
        this.amount = amount;
        this.product = product;
        this.dish = dish;

        product.addDishProduct(this);
    }
}