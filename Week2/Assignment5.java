import java.util.Scanner;

public class ModWithoutOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        scanner.close();

        int remainder = dividend;
        while (remainder >= divisor) {
            remainder -= divisor;
        }

        System.out.println("Remainder: " + remainder);
    }
}
