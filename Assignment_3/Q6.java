// Java code to print Ludic number smaller than
// or equal to n.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] srgs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
//        System.out.println(arr);
        for (int i = 1; i < arr.size(); i++) {

            int ele = arr.get(i);
            int deleteEle = i + ele;
//            System.out.println(deleteEle);
            while (deleteEle < arr.size()) {
                arr.remove(deleteEle);
                deleteEle += (ele - 1);
//                System.out.println(deleteEle);
            }
        }
        System.out.println(arr);
    }
}
