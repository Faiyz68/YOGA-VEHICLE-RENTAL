package vehicles;

public class Car extends Vehicle{
    public Car(String Brand){
        super(Brand, 40);

    }
    @Override
    public double calculateRentalcost(int days){
        return super.calculateRentalcost(days) + 20; // $20 flat insurance
    }
}
