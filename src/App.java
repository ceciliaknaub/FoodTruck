
import java.util.ArrayList;


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Taco");
        menu.add("Burrito");
        menu.add("Enchillada");
        FoodTruck Truck1 = new FoodTruck(4, 60, 30000,
            "Maria's Mexican Food", menu);
        FoodTruck Truck2 = new FoodTruck(2, 85, 2500,
            "Pablo's Authentic", menu);
        FoodTruck Truck3 = new FoodTruck(3, 65.3, 12987,
            "Franco's Fiesta", menu);
        System.out.println(Truck1.getInfo());
        System.out.println(Truck2.getInfo());
        System.out.println(Truck3.getInfo());
    }
    
}
