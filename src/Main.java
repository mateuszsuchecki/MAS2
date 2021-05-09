import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        /**Zwykła asocjacja 1 do wiele Fridge - Dish*/
        //===========================================================
            System.out.println();
        //===========================================================

        Fridge wegeFridge = new Fridge("Wege");

        Dish falafel = new Dish("Falafel", wegeFridge);
        Dish burgerAvokado = new Dish("Burger z avokado", wegeFridge);
        Dish frytkiZBatatow = new Dish("Frytki z batatów", wegeFridge);

        System.out.println(wegeFridge);
        System.out.println("In fridge: " + wegeFridge.getDishList());

        //===========================================================
            System.out.println();
        //===========================================================

        Dish losos = new Dish("Łosoś");
        Dish dorsz = new Dish("Dorsz");
        Dish pstrag = new Dish("Pstrag");
        ArrayList<Dish> dishList = new ArrayList<>(Arrays.asList(losos, dorsz, pstrag));

        Fridge fishFridge = new Fridge("Fish", dishList);

        System.out.println(losos+ " is in: " + losos.getFridge());
        System.out.println(dorsz+ " is in: " + losos.getFridge());

        /**Asocjacja z atrybutem DishProduct wiele do wiele Dish - Product*/
        //===========================================================
            System.out.println();
        //===========================================================

        Product salt = new Product("salt");
        Product parmesan = new Product("parmesan");
        Product pasta = new Product("pasta");
        ArrayList<Product> productList = new ArrayList<>(Arrays.asList(salt, parmesan, pasta));

        Fridge meatFridge = new Fridge("Meat", dishList);
        Dish spaghetti = new Dish("Spaghetti", meatFridge);

        spaghetti.addProduct(salt, 2);
        spaghetti.addProduct(parmesan, 30);
        spaghetti.addProduct(pasta, 200);

        //===========================================================
            System.out.println();
        //===========================================================
        salt.addDish(frytkiZBatatow, 5);
        salt.addDish(losos, 6);
        salt.addDish(pstrag, 3);





    }
}