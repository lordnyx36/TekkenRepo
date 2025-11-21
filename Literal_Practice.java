/**
 * A Java program that demonstrates the use of specific literals:
 * - long literal with 'L' suffix
 * - float literal with 'f' suffix
 * - char literal using a Unicode escape sequence
 * 
 * @author Karan Khatiwada
 * @version 11/21/2025
 */
public class Literal_Practice {
    public static void main(String[] args) 
    {
        
        long largeNumber = 9876543210L;

        
        float pi = 3.14f;

        
        char copyrightSymbol = '\u00A9';

        // Printing the values
        System.out.println("Long value = " + largeNumber);
        System.out.println("Float value = " + pi);
        System.out.println("Char value = " + copyrightSymbol);
    }
}
