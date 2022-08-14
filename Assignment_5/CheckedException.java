import java.io.IOException;
import java.util.Scanner;

public class CheckedException {
    static void checkEven(int num) throws IOException{
        if (num %2!=0){
            throw new IOException("num is not even");
        }
        else{
            System.out.println("Num is even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int userInput = sc.nextInt();
            checkEven(3);
        }
        catch (Exception e){
            System.out.println(e);
        };
    }
}
