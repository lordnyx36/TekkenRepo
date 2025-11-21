
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args)
    {
        //Arthematic
        int a = 10;
        int b = 5;
        System.out.println("Arthematic Operators\n\n");
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
        
        //Unary (post-increment and pre-increment operators)
        int x = 5;
        System.out.println("Unary (post-increment and pre-increment operators)\n\n");
        System.out.println("x = " + x);
        System.out.println("Post-increment x = " + (x++));
        System.out.println("After post-increment x = " + x);
        System.out.println("Pre-increment x = " + (++x));
        System.out.println("After Pre-increment x = " + x);
        
        //Assignment
        int y = 10;
        System.out.println("Assignment Operators \n\n");
        System.out.println("y = " + y);
        y += 5;
        System.out.println("y += 5 -> " + y);
        y -= 5;
        System.out.println("y -= 5 -> " + y);
        y *= 5;
        System.out.println("y *= 5 -> " + y);
        y /= 5;
        System.out.println("y /= 5 -> " + y);
        y %= 5;
        System.out.println("y %= 5 -> " + y);
        
        //Relational Operator
        
        int m = 10, n = 20;
        System.out.println("Relational Operators \n\n");
        System.out.println(" m = " + m + ", n = " + n);
        System.out.println("m == n: " + (m == n));
        System.out.println("m != n: " + (m != n));
        System.out.println("m > n: " + (m > n));
        System.out.println("m < n: " + (m < n));
        System.out.println("m >= n: " + (m >= n));
        System.out.println("m <= n: " + (m <= n));
        
        //logical Operators
        
        boolean p = true, q = false;
        System.out.println("Logical Operators\n\n");
        System.out.println(" p = true and q = false");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p    : " + (!p));
        
        //Ternary Operators
         
        int score = 75;
        System.out.println("Ternary Operators\n\n");
        System.out.println("Score = " + score);
        String result = (score >= 50) ? "Pass" : "Fail";
        System.out.println("Score " + score + " -> " + result);
    }
}