import java.util.Scanner;

public class RevPyrStarPattern {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = scanner.nextInt();
        for (int b = a; b >= 1; b--) {
            for (int c = 1; c <= a - b; c++) {
                System.out.print("  "); 
            }
            for (int d = 1; d <= (2 * b - 1); d++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
