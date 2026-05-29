package main;
import vehicles.Vehicle;
import vehicles.Car;
import vehicles.Motor;
import vehicles.Boat;
import vehicles.Yacht;
import vehicles.Jetski;
import vehicles.Airplane;
import vehicles.PrivateJet;


import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BOLD = "\u001B[1m";
    void main(){
        ArrayList<Vehicle> RentedVehicles = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        boolean isRunning = true;
        System.out.println("WELCOME TO YOGA VEHIVCLE RENTAL");
        System.out.println(CYAN + "=========================================================" + RESET);
        System.out.println(GREEN + " __   __  ____   _____          " + RESET);
        System.out.println(GREEN + " \\ \\ / / / __ \\ / ____|   /\\    " + RESET);
        System.out.println(GREEN + "  \\ V / | |  | | |  __   /  \\   " + RESET);
        System.out.println(GREEN + "   \\ /  | |  | | | |_ | / /\\ \\  " + RESET);
        System.out.println(GREEN + "   | |  | |__| | |__| |/ ____ \\ " + RESET);
        System.out.println(GREEN + "   |_|   \\____/ \\_____/_/    \\_\\" + RESET);
        System.out.println(CYAN + "=========================================================" + RESET);
        System.out.println(YELLOW + BOLD + "               V E H I C L E   R E N T A L               " + RESET);
        System.out.println(CYAN + "=========================================================" + RESET);
        System.out.println("   " + GREEN + "Breathe In, Drive Out." + RESET + " Your flexible journey starts here. \n");
        while (isRunning){
            System.out.println("MAIN MENU : ");
            System.out.println("1. RENT LAND VEHICLE ");
            System.out.println("2. RENT AIR VEHICLE ");
            System.out.println("3. RENT WATER VEHICLE ");
            System.out.println("4. VIEW CART AND CHECKOUT ");
            System.out.println("5. EXIT ");
            System.out.println("CHOOSE AN OPTION ");
        try {
            int mainchoice=scanner.nextInt();
            if(mainchoice == 1){
                //Land vehicle menu
                System.out.println(" LAND VEHICLE MENU ");
                System.out.println("1. CAR ");
                System.out.println("2 MOTOR CYCLE ");
                System.out.println(" CHOOSE TYPE ");
                int type =scanner.nextInt();
                if(type ==1){
                    System.out.println(" CAR MENU ");
                    System.out.println(" 1. SPORTS CAR ");
                    System.out.println(" 2. SUV ");
                    System.out.println(" 3. SEDAN ");
                    System.out.println(" 4. HATCHBACK ");
                    System.out.println(" 5. COUPE ");
                    System.out.println(" 6. PICKUP ");
                    System.out.println(" 7. MINIVAN ");
                    System.out.println(" CHOOSE CAR TYPE : ");
                    int cartype = scanner.nextInt();
                    System.out.print("Enter Brand (e.g., Porsche, Jeep): ");
                        scanner.nextLine();
                        String Brand = scanner.nextLine();
                    if(cartype==1){
                        RentedVehicles.add(new Car( Brand +" (sports car)"));
                    }
                    else if(cartype==2){
                        RentedVehicles.add(new Car(Brand + "(SUV)"));
                    }
                    else if (cartype==3){
                        RentedVehicles.add(new Car(Brand + "(SEDAN)"));
                    }
                    else if (cartype==4){
                        RentedVehicles.add(new Car(Brand + "(HATCHBACK)"));
                    }
                    else if (cartype ==5){
                        RentedVehicles.add(new Car(Brand + "(COUPE)"));
                    }
                    else if (cartype == 6){
                        RentedVehicles.add(new Car(Brand + "(PICKUP)"));
                    }
                    else if (cartype ==7){
                        RentedVehicles.add(new Car(Brand + "(MINIVAN)"));
                    }
                    
                    
                    System.out.println(GREEN+" ADDED TO CART ! " + RESET);
                }
                if(type==2){
                    System.out.println(" 1. SCOOTER ");
                    System.out.println(" 2. NAKED ");
                    System.out.println(" 3. CRUISER");
                    System.out.println(" 4. SPORT BIKE");
                    System.out.println(" 5. DIRT BIKE");
                    System.out.println(" CHOOSE MOTOR BIKE TYPE");
                    int   motorbiketype=scanner.nextInt();
                    System.out.println(" ENTER BRAND (E.G.. YAMAHA, HARLEY");
                    scanner.nextLine();
                    scanner.nextLine();
                    String Brand = scanner.nextLine();
                    if(motorbiketype==1){
                        RentedVehicles.add(new Motor(Brand + "(Scooter)" ));
                    }
                    else if (motorbiketype==2){
                        RentedVehicles.add(new Motor(Brand + "(Naked)"));
                    }
                    else if (motorbiketype==3){
                        RentedVehicles.add(new Motor(Brand + "(Cruiser)"));
                    }
                    else if (motorbiketype==4){
                        RentedVehicles.add(new Motor(Brand + "(Sport Bike)"));
                    }
                    else if (motorbiketype ==5){
                        RentedVehicles.add(new Motor(Brand + "(Dirt Bike)"));
                    }
                    
                    System.out.println(GREEN+" ADDED TO CART !" + RESET);
                }
                
            }
            if (mainchoice==2){
                System.out.println(" AIR VEHICLE MENU ");
                System.out.println(" 1. PUBLIC AIRPLANE");
                System.out.println(" 2. PRIVATE JET ");
                System.out.println(" CHOOSE TYPE");
                int type = scanner.nextInt();
                System.out.println("ENTER BRAND (E.G., BOEING, GULFSTREAM");
                scanner.nextLine();
                String Brand = scanner.nextLine();
                if (type==1){
                    RentedVehicles.add(new Airplane(Brand + "(Public Airplane"));
                }
                else if (type==2){
                    RentedVehicles.add(new PrivateJet(Brand + "(Private Jet)"));
                }
               

                System.out.println(GREEN + " ADDED TO CART ! " + RESET);
            }
            if(mainchoice==3){
                System.out.println(" WATER VEHICLE MENU ");
                System.out.println(" 1. BOAT ");
                System.out.println(" 2. YACHT ");
                System.out.println(" 3. JETSKI ");
                System.out.println(" CHOOSE AN OPTION ");
                int type= scanner.nextInt();
                System.out.println(" ENTER BRAND (e.g., Sea-Doo, Bayliner): ");
                scanner.nextLine();
                String Brand = scanner.nextLine();
                if(type==1){
                    RentedVehicles.add(new Boat(Brand));
                }
                else if(type==2){
                    RentedVehicles.add(new Yacht(Brand));
                }
                else if (type==3){
                    RentedVehicles.add(new Jetski(Brand));
                }
                
                System.out.println(GREEN + " ADDED TO THE CART! "+RESET);
            }
            if(mainchoice==4){
                //CHECKING OUT
                if(RentedVehicles.isEmpty()){
                    System.out.println(YELLOW+" YOUR CART IS EMPTY "+RESET);
                    continue;
                }
                
            
            System.out.println(BOLD+" HOW MANY DAYS ARE YOU RENTING IT FOR : "+RESET);
            int days=scanner.nextInt();
            double total=0;
            System.out.println(" FINAL RECIEPT : ");
            for (Vehicle v :RentedVehicles){
                double cost =v.calculateRentalcost(days);
                System.out.println(" - "+v.getBrand() +" | " + days + " days | cost " + cost);
                total+=cost;
            }
            System.out.println("===========================");
                    System.out.println("GRAND TOTAL: $" + total);
                    System.out.println("===========================");
                    
        }
        if(mainchoice==5){
            System.out.println(GREEN+ " THANK YOU FOR VISITING THE YOGA VEHICLE RENTAL "+RESET);
            isRunning=false;
        }
        else{
            System.out.println(" PLEASE SELECT A VALID OPTION (1-5) ");
        }
                    
        }catch(Exception e){
            System.out.println(" INVALID INPUT! PLEASE TYPE A NUMBER NOT A LETTER ");
            scanner.nextLine();
        }
        }
        scanner.close();
    }
}
