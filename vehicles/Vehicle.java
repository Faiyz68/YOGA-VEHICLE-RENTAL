package vehicles;

public class Vehicle {
   private String Brand;
   private double dailyRate;

   public Vehicle(String Brand ){
    this.Brand= Brand;
    this.dailyRate=50;
   }
   public Vehicle(String Brand, double dailyRate){
    this.Brand=Brand;
    this.dailyRate= dailyRate;
   }
   public String getBrand(){
    return Brand;
    }
    public void setBrand(String Brand){
        this.Brand= Brand;}
    public double getdailyRate(){
        return dailyRate;
    }
    public void setdailyRate(double dailyRate){
        this.dailyRate=dailyRate;
    }
    public double calculateRentalcost(int days){
        return dailyRate * days;
    }
}

