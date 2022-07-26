import java.util.Scanner;

public class WeatherPalindrome {
    static void weatherPalindrome(String num) {
        String[] arr = new String[5];
        arr = num.split("");
        String reversedStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedStr += arr[i];
        }

        System.out.println(reversedStr.equals(num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean flag = false;
        String num = "";

        while (flag == false) {
            num = sc.next();
            if (num.length() == 5) {
                flag = true;
            } else {
                System.out.println("Error : Enter 5 digit number");
            }
        }
        weatherPalindrome(num);


    }
}
