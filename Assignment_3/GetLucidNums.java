// or equal to n.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetLucidNums {
    static List getLucid(int n) {

        List<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        for (int i = 1; i < arr.size(); i++) {

            int ele = arr.get(i);
            int deleteEle = i + ele;

            while (deleteEle < arr.size()) {
                arr.remove(deleteEle);
                deleteEle += (ele - 1);

            }
        }
        return arr;

    }

    public static void main(String[] srgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which you want lucid numbers");
        int n = sc.nextInt();
        System.out.println(getLucid(n));
    }
}
