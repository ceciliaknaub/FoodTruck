
public class Vehicle {
    private int maxPassengers;
    private double maxSpeed;
    private double milesTraveled;
    
    Vehicle(int maxPassengers, double maxSpeed, double milesTraveled){
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.milesTraveled = milesTraveled;
    }
    
    public String getInfo(){
        return "Max Passengers: " + this.maxPassengers + " Max Speed: " + this.maxSpeed 
                + " Miles Traveled: " + this.milesTraveled;
    }
    
    
}
