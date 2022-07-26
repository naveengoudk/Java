import java.util.Scanner;

public class CountNegPosZeros {
    static void count() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int postivesNums = 0;
        int negativeNums = 0;
        int zeros = 0;
        System.out.println("enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                postivesNums += 1;
            } else if (num < 0) {
                negativeNums += 1;
            } else {
                zeros += 1;
            }
        }
        System.out.printf("no of positive nums : %d ", postivesNums);
        System.out.println();
        System.out.printf("no of negative nums : %d", negativeNums);
        System.out.println();
        System.out.printf("no of zeros : %d", zeros);

    }
}
