
/**
 * Write a description of class Literals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week3_tutorial

{
    int agr;
    static int rtr;
    public static void main(String[] args)
    {
        int age = 19; //local variable
        System.out.println(age);
        
        // <className> <Variable> = new <className>();
        Week3_tutorial t1 = new Week3_tutorial();
        // to print out the out side variable {Soutside stactic} use System.out.println(<Variable>.na
        System.out.println(t1.agr);
        
    }
}