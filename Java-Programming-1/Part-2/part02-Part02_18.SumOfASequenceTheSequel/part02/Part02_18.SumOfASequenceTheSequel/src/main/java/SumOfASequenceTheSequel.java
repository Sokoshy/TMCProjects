
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("First number? ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.printf("Second number? ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        System.out.print("The sum is " + sum);
        scanner.close();
    }
}
