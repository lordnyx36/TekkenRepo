/**
 * A Java program that:
 * Declares member variables for all 8 primitive types without initializing them
 * and prints their default values.
 *
 * @author Karan Khatiwada
 * @version 11/21/2025
 */
public class Default_Value_Checker 
{
    
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    
    public static void main(String[] args) {
        
        Default_Value_Checker obj = new Default_Value_Checker();
        
        // Printing default values of member variables
        System.out.println("Printing the default values of 8 primitive types:");
        System.out.println("Byte = " + obj.byteVar);
        System.out.println("Short = " + obj.shortVar);
        System.out.println("Int = " + obj.intVar);
        System.out.println("Long = " + obj.longVar);
        System.out.println("Float = " + obj.floatVar);
        System.out.println("Double = " + obj.doubleVar);
        System.out.println("Char = '" + obj.charVar + "'"); // char default is '\u0000'
        System.out.println("Boolean = " + obj.booleanVar);
        
        /* Local variables (declared inside a method) must be explicitly initialized
           before use because Java does not provide default values for them.*/
    }
}
