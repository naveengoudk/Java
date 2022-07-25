import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String hexStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int asciVal = (int) c;
            hexStr += Integer.toHexString(asciVal);

        }
        System.out.println(hexStr);
    }
}
