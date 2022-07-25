import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to check for anagram");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i < s2.length(); i++) {
            int ascii = (int) s2.charAt(i);
            if (ascii != 32) {
                String s = "";
                s += s2.charAt(i);
                if (!s1.contains(s)) {
                    flag = false;
                }
            }
        }
        System.out.println(flag);

    }
}
