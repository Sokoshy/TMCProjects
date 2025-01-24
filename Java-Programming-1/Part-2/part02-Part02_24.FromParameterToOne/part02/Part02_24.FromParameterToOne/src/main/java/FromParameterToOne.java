import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(number);
    }

    public static void printFromNumberToOne(int number) {

        int decrementingNumber = number;
        for (int i = 1; i <= number; i++ ) {
            System.out.println(decrementingNumber);
            decrementingNumber--;
        }
//        or find on the internet and optimized
//        for (int i = number; i >= 1; i-- ) {
//            System.out.println(i);
//        }
    }
}
