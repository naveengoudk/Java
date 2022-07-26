import java.util.Scanner;

public class ConvertIntToHex {
    static String IntToHex(String str) {
        String hexStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int asciVal = (int) c;
            hexStr += Integer.toHexString(asciVal);

        }
        return hexStr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String hexString = IntToHex(str);
        System.out.println(hexString);
    }
}
