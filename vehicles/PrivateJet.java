package vehicles;

public class PrivateJet extends Vehicle{
    public PrivateJet(String Brand){
        super(Brand , 2500);
    }
    @Override
    public double calculateRentalcost(int days){
        return super.calculateRentalcost(days) + 500; //500$ luxury fee
    }
}
