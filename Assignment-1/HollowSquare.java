import java.util.Scanner;

public class HollowSquare {
    static void printSquare(int side) {
        for (int i = 0; i < side; i++) {
            if (i == 0 || i == side - 1) {
                for (int j = 0; j < side; j++) {
                    System.out.print("*");
                }

            } else {
                System.out.print("*");
                for (int j = 1; j < side - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        printSquare(side);
    }
}
