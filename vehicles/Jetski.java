package vehicles;

public class Jetski extends Vehicle{
    public Jetski(String Brand){
        super(Brand, 60);
    }
    @Override
    public double calculateRentalcost(int days){
        return super.calculateRentalcost(days);
    }
}