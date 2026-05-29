package vehicles;

public class Airplane extends Vehicle{
    public Airplane(String Brand){
        super(Brand , 1000);
    
    }
    @Override
    public double calculateRentalcost(int days){
        return super.calculateRentalcost(days) + 200; //200$ airport fee
    }
}
