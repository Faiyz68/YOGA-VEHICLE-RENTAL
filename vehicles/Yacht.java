package vehicles;

public class Yacht extends Vehicle {
    public Yacht(String Brand){
        super(Brand, 500);
    }
    @Override
    public double calculateRentalcost(int days){
        return super.calculateRentalcost(days) + (100*days); // 100$/days luxury tax
    }
}
