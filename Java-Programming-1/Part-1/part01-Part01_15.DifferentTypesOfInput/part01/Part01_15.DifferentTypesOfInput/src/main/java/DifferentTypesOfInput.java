
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int numberInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double numberDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean value = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + numberInt);
        System.out.println("You gave the double " + numberDouble);
        System.out.println("You gave the boolean " + value);
        scan.close();

    }
}
