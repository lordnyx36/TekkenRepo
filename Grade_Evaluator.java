import java.util.Scanner;

/**
 * Takes a numeric grade as input
• Uses the ternary operator to assign:
• "Pass" if grade ≥ 40
• "Fail" if grade < 40
 *
 * @author Karan Khatiwada
 * @version 11/21/2025
 */
public class Grade_Evaluator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Grade Evaluator\n\n");
        System.out.println("_____________________________________________________");
        float grade;
        System.out.println("Enter Grade to check either you passed or failed : ");
        grade = scan.nextFloat();
        String result = (grade >= 40) ? "Passed":"Failed";
        System.out.println("Since you scored -> " + grade + " Out of -> 100. So You've " + result + "!!!");
        scan.close();
    }
}