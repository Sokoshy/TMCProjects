import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        // initialize counters and sums

        int sum = 0;
        int count = 0;
        int counterEven = 0;
        int counterOdd = 0;

        while (true) {

            int numberInput = Integer.valueOf(scanner.nextLine());

            if (numberInput == -1) {
                break;
            }
            
            if (numberInput % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }

            count++;
            sum += numberInput;
        }
        System.out.println("Thx! Bye!");
        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Numbers: %d\n", count);
        System.out.println("Average: " + (1.0 * sum / count));
        System.out.printf("Even: %d\n", counterEven);
        System.out.printf("Odd: %d", counterOdd);

        scanner.close();
    }
}
