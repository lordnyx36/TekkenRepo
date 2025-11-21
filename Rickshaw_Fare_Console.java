import java.util.Scanner;

/**
 * RickshawFare.java
 * 
 * A console-based Java program to calculate rickshaw fares.
 * It prompts the user for distance, time, local status, and night travel,
 * then calculates the total fare based on base fare, distance, time,
 * local discount, and night surcharge.
 * 
 * Ensures consistent and transparent pricing for all customers.
 * 
 * @author Karan Khatiwada
 * @version 11/21/2025
 */
public class Rickshaw_Fare_Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Geting inputs from the user
        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        System.out.print("Enter time in minutes: ");
        double time = sc.nextDouble();

        System.out.print("Is the customer local? (yes/no): ");
        boolean isLocal = sc.next().equalsIgnoreCase("yes") ? true : false;

        System.out.print("Is the travel during night? (yes/no): ");
        boolean isNight = sc.next().equalsIgnoreCase("yes") ? true : false;

        //Fare calculation
        double baseFare = 50;      // Base fare in Rs.
        double perKmFare = 20;     // Fare per km
        double perMinuteFare = 2;  // Fare per minute

        double fare = baseFare + (distance * perKmFare) + (time * perMinuteFare);

        //Applying local discount if applicable
        fare = (isLocal && distance > 10) ? fare * 0.9 : fare;

        //Applying night surcharge if applicable
        fare = isNight ? fare * 1.15 : fare;

        //Displaying final fare in Nepali format
        System.out.println("Total Fare: Rs. " + fare + "/-");

        sc.close();
    }
}
