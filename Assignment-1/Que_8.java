public class Que_8 {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            long factorial = 1;
            for (int j = 1; j < i+1; j++) {
                factorial *= j;
            }
            System.out.printf("Factorial of %d : %d",i , factorial);
            System.out.println();
        }
    }
}
//the factorial for 21 will exceed the max limit of type long . so we have to use BigInteger for further
