public class GenericMethod {
    public static <A> void printArr(A[] arr) {
        for (A ele : arr)
            System.out.printf("%s ", ele);
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integerArr = {1, 2, 3, 4, 5, 6};
        printArr(integerArr);
        Double[] doubleArr = {1.1, 1.2, 1.3, 1.4, 2.1};
        printArr(doubleArr);
        Character[] charArr = {'A', 'B', 'C', 'D', 'E'};
        printArr(charArr);
    }
}







