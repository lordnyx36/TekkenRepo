import java.util.Scanner;

/**
 * RickshawFare.java
 *
 * A console-based Java program to calculate rickshaw fares.
 * It asks the user for distance, time, local status, and night travel,
 * then calculates and displays the total fare in Nepali Rs. format.
 * 
 * Usage:
 * Compile: javac RickshawFare.java
 * Run: java RickshawFare
 * 
 * @author Karan Khatiwada
 * @version 11/21/2025
 */
public class Rickshaw_Fare_Command_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Getting inputs from the user
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

        //Displaying final fare in format
        System.out.println("Total Fare: Rs. " + Math.round(fare) + "/-");

        sc.close();
    }
}
