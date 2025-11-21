
/**
 * Create a Java program named "DataTypeInspector.java" that:
• Declares and initializes a variable for each of Java’s 8 primitive data types.
• Uses appropriate literal values for initialization.
• Prints the value of each variable to the console, each with a descriptive label.
 *
 * @author Karan Khatiwada
 * @version 11/21/2025
 */
public class Data_Type_Inspector
{
    public static void main(String[] args)
    {
        
        // Declaring and initializing variables for all 8 primitive data types
        
        byte byteVar = 100;

        short shortVar = 30000;

        int intVar = 100000;

        long longVar = 10000000000L; 

        float floatVar = 10.5f;

        double doubleVar = 20.99;

        char charVar = 'A';

        boolean booleanVar = true;
        //Prinitng
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Int value: " + intVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
        System.out.println("Char value: " + charVar);
        System.out.println("Boolean value: " + booleanVar);

}
}