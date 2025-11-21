
/**
 * Write a description of class Week3_tutorial_implicit_explicit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week3_tutorial_implicit_explicit
{
    public static void main(String[] args)
    {

        //ecplicit Typecastinh
        double dub = 11.5;
        int integer = (int)dub;
        System.out.println(integer);
        
        int age = 19;
        //implicit typecasting
        
        double db = age;
         
        System.out.println(dub);
        
        //Exceptions
        //short st = 10;
        
        // short sum = st+str; (wrong)
        
        //short st = 10;
        //short str = 11;
        
        //short sum = (short)st + str; //(right)
        
        //Maximum , Minium, Size, Bytes
        System.out.println(Byte.MAX_VALUE); // maximum value
        System.out.println(Byte.MIN_VALUE);// minimum value
        System.out.println(Byte.SIZE); // bits
        System.out.println(Byte.BYTES); // bytes
        
        //Escape Sequence
        System.out.println("Hello\nWorld"); // for new line
        System.out.println("Hamro\tNepal"); // for tabs
        System.out.println("She said \"hi\"");// double quatation
        
        System.out.println("love emoji "+"\u2764");
    }
}