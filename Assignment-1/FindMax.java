import java.util.Scanner;

public class FindMax {
    static void findmax(int num1, int num2) {
        if (num1 > num2) {
            System.out.printf("%d is greater", num1);
        } else if (num2 > num1) {
            System.out.printf("%d is greater", num2);
            ;
        } else {
            System.out.printf("%d and %d are equal", num1, num2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter two integers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        findmax(num1, num2);


    }
}
