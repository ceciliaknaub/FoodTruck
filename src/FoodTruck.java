
import java.util.ArrayList;


public class FoodTruck extends Vehicle{
    private String truckName;
    private ArrayList<String> menu;
    
    
    FoodTruck(int maxPassengers, double maxSpeed, double milesTraveled,
            String truckName, ArrayList<String> menu){
        super(maxPassengers, maxSpeed, milesTraveled);
        this.truckName = truckName;
        this.menu = menu;          
    }
    
    @Override
    public String getInfo(){
        return super.getInfo() + " Truck Name: " + truckName + " Menu:  " + menu.get(0) + ", " +
                menu.get(1) + ", " + menu.get(2);
    }
    
}
