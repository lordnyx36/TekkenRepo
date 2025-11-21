/**
 * The Rickshaw_Fare_Ternery  class uses ternery operator calculates rickshaw fares based on distance, time,
 * local discounts, and night surcharges. It takes user input and
 * displays the final fare in Nepali Rs. format.
 *
 * @author Karan Khatiwada
 * @version 11/21/2025
 */
import java.util.Scanner;

public class Rickshaw_Fare_Ternery
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking distance and time input
        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        System.out.print("Enter time in minutes: ");
        double time = sc.nextDouble();

        //Checking if customer is local
        System.out.print("Is the customer local? (yes/no): ");
        String localInput = sc.next();
        boolean isLocal = localInput.equalsIgnoreCase("yes") ? true : false;

        //Checking if travel is at night
        System.out.print("Is the travel during night? (yes/no): ");
        String nightInput = sc.next();
        boolean isNight = nightInput.equalsIgnoreCase("yes") ? true : false;

        //Fare calculation rules
        double baseFare = 50;        // Base fare in Rs.
        double perKmFare = 20;       // Fare per km
        double perMinuteFare = 2;    // Fare per minute

        double fare = baseFare + (distance * perKmFare) + (time * perMinuteFare);

        // Local discount: 10% off if distance > 10 km
        fare = (isLocal && distance > 10) ? fare * 0.9 : fare;

        // Night surcharge: 15% extra
        fare = isNight ? fare * 1.15 : fare;

        //Displaying final fare in Nepali format
        System.out.println("Final Fare: Rs. " + Math.round(fare));

        sc.close();
    }
}
