import java.util.Scanner;

public class ReverseString {
    static String reverseWords(String[] revArr) {
        String res = revArr[0] + " ";
        for (int i = 1; i < revArr.length - 1; i++) {
            String[] singleArr = revArr[i].split("");
            String singleRev = "";
            for (int j = singleArr.length - 1; j >= 0; j--) {
                singleRev += singleArr[j];
            }
            res += (singleRev + " ");
        }
        res += revArr[revArr.length - 1];
        return res;
    }

    static String reverse(String[] arr) {
        String revStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                revStr += (arr[i] + " ");
            } else {
                revStr += arr[i];
            }
        }
        String[] revArr = revStr.split(" ");
        return reverseWords(revArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String reversedString = reverse(arr);
        System.out.println(reversedString);
    }
}
