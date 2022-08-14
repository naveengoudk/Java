// Java code for stack implementation

import java.util.*;

class Palindrome {
    static Boolean weatherPalindrome(String s) {
//        naveenb
        Stack<Character> stack = new Stack<Character>();
        int midVal = (int) s.length() / 2;
        for (int i = 0; i < midVal; i++) {
            stack.push(s.charAt(i));
        }
        if (s.length() % 2 != 0) {
            midVal = midVal + 1;
        }
        boolean flag = true;
        for (int i = midVal; i < s.length(); i++) {
            char c = stack.pop();
            if (c != s.charAt(i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        String input = sc.nextLine();
        input.trim();
        input = input.replace(" ", "");
        boolean res = weatherPalindrome(input);
        System.out.println(res);
    }
}
