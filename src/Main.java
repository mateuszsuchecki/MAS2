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


    }
}