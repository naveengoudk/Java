import java.util.LinkedList;

public class ListConcatenate {
    static LinkedList concatenate(LinkedList ll1, LinkedList ll2) {
        ll1.addAll(ll2);
        return ll1;
    }

    public static void main(String[] args) {
        LinkedList<Character> ll1 = new LinkedList<>();
        ll1.add('A');
        ll1.add('B');
        ll1.add('C');
        LinkedList<Character> ll2 = new LinkedList<>();
        ll2.add('a');
        ll2.add('b');
        ll2.add('c');
        System.out.println(concatenate(ll1, ll2));

    }
}
