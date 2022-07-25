import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String refStr = arr[0];
        int len = refStr.length();
        String res = "";
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len + 1; j++) {
                String subString = refStr.substring(i, j);
//                System.out.println(subString);
                boolean flag = true;
                for (int k = 0; k < arr.length; k++) {
                    if (!arr[k].contains(subString)) {
//                        System.out.println(subString);
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if (res.length() < subString.length()) {
                        res = subString;
                    }
                }
            }
        }
        System.out.println(res);

    }
}
