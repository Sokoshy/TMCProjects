import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int whereTo = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int whereFrom = Integer.valueOf(scanner.nextLine());

        if (whereFrom <= whereTo) {
            for (int i = whereFrom; i <= whereTo; i++) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
