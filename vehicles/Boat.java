package vehicles;

public class Boat extends Vehicle{
    public Boat(String Brand){
        super(Brand, 80);
    }
    @Override
    public double calculateRentalcost(int days){
        return super.calculateRentalcost(days) + 50; // 50$ Docking fee
    }
}
