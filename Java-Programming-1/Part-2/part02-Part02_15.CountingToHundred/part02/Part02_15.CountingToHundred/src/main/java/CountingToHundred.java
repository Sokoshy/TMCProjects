
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        int i = number;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
