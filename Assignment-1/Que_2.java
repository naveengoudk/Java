import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="";

        while (str.length()!=5){
            System.out.println("please enter 5 digit number");
            str = sc.next();
        }

            String[] arr = str.split("");
            String result = "";

        for (int i = 0; i < arr.length; i++) {

            if (i==arr.length-1){
                result+=arr[i];
            } else {
                result += (arr[i] + "   ");
            }
        }
            System.out.println(result);
    }
}
