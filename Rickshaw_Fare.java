import java.util.Scanner;

/**
 * A local rickshaw service in Biratnagar needs a simple tool to calculate fares for their customers.
The fare calculation has a few components: a base fare, a per-kilometer charge, and a per-
minute charge. They also offer discounts for locals on long distances and have a surcharge for
night-time travel.
 *
 * @author Karan Khatiwada
 * @version 11/21/2025
 */
public class Rickshaw_Fare
{
    public static void main(String[] args)
    {
        
    double baseFare = 20;
    double per_km_charge = 10;
    double per_minute_charge = 2;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Rickshaw Fare calcualtor \n\n");
    System.out.println("Enter The Distance Travelled in Km : ");
    double distance = scan.nextDouble();
    
    System.out.println("Enter how many minutes travelled : ");
    double minute_travelled = scan.nextDouble();
    
    scan.nextLine();
    
    System.out.println("Are you a Local?(Yes or No)");
    String local_or_not = scan.nextLine().toLowerCase();
    
    System.out.println("Is it Day or Night? ");
    String day_or_night = scan.nextLine().toLowerCase();
    
    double fare = baseFare + (per_km_charge * distance) + (per_minute_charge * minute_travelled);
    
    if(local_or_not.equals("yes") && distance >10)
    {
        if(day_or_night.equals("day"))
        {
            fare = fare - (fare * 0.10);
        }
        else
        {
            fare = fare + (fare * 0.10);
        }
        
        
    }
    else if(day_or_night.equals("night") && distance > 10)
    {
        if(local_or_not.equals("Yes"))
        {
            fare = fare + (fare * 0.10);
        }
        else
        {
            fare = fare + (fare *0.20);
        }
        
    }
    else
    {
        fare = fare;
    }
    
    System.out.println("----------FARE CALCUALTOR IS COMPLETE----------");
    System.out.println("\nYour Total fare is : " + fare + " RS.");
    
    
    
    
    }
}