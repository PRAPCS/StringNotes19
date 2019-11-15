import java.util.Scanner;

/**
 * Write a description of class StringInputMethods here.
 *
 * @author Mr. Burger
 * @version (a version number or a date)
 */
public class Main {
  public static void main(String[] args) {
    // Declare variables
    String name;
    int nameLength;
    String halfName;
    // Need to create a Scanner object to take in inputs from the user
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    name = input.nextLine();

    System.out.println("Hello " + name);
    // .length() gives the number of characters in the string including spaces and
    // special characters.
    nameLength = name.length();
    System.out.println("Your name has: " + nameLength + " Characters");
    // Creates a new string that starts at location 0 and ends at but not including
    // namelength/2
    halfName = name.substring(0, nameLength / 2);
    System.out.println(halfName);
    // Creates a new string that starts at location 3 and goes to the end of the
    // string
    halfName = name.substring(3);
    System.out.println(halfName);

    name = name.replace("a", "z");
    System.out.println(name);

    name = name.toUpperCase();
    System.out.println(name);

    System.out.println("This is a really cool editor.");

  }
}
