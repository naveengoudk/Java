import java.util.Scanner;

public class SpaceBetween {
    static String spacesBetween(String str) {
        String[] arr = str.split("");
        String result = "";

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                result += arr[i];
            } else {
                result += (arr[i] + "   ");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        while (str.length() != 5) {
            System.out.println("please enter 5 digit number");
            str = sc.next();
        }
        String result = spacesBetween(str);
        System.out.println(result);
    }
}
