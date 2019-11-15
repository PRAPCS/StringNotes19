import java.util.Scanner;
/**
 * Write a description of class StringInputMethods here.
 *
 * @author Mr. Burger
 * @version (a version number or a date)
 */
public class Main
{
    public static void main (String[] args)
    {
        String name;
        int nameLength;
        String halfName;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        name=input.nextLine();

        System.out.println("Hello "+name);
        nameLength = name.length();
        System.out.println("Your name has: "+nameLength+" Characters");

        halfName = name.substring(0,nameLength/2);
        System.out.println(halfName);

        halfName = name.substring(3);
        System.out.println(halfName);

        name = name.replace("a","z");
        System.out.println(name);

        name = name.toUpperCase();
        System.out.println(name);

        System.out.println("This is a really cool editor.");


    }
}
