import java.util.Scanner;

public class Anagram {
    static boolean weatherAnagram(String s1, String s2) {
        boolean flag = true;

        if (s1.length() != s2.length()) {
            flag = false;
        } else {
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
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to check for anagram");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(weatherAnagram(s1, s2));

    }
}
