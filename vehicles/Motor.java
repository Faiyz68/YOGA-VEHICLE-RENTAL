package vehicles;

public class Motor extends Vehicle{
    public Motor(String Brand){
        super(Brand, 30);
    }
    @Override
    public double calculateRentalcost(int days){
        return super.calculateRentalcost(days)*0.90; // 10% discount
    }
}
