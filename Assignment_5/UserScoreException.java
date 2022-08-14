import java.util.Scanner;

class ScoreException extends Exception {
    public ScoreException(String m) {
        System.out.println(m);
    }
}

public class UserScoreException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag == true) {
            try {
                System.out.println("Please enter a score");
                String userInput = sc.next();
                getMessage(Integer.parseInt(userInput));
            } catch (ScoreException e) {
            } catch (NumberFormatException e) {
                System.out.println("you must enter a number for a score");
            }
            System.out.println("Do you want to enter another score .type y for yes and n for no");
            String userResponse = sc.next();
            if (userResponse.equals("n")) {
                flag = false;
            } else if (userResponse.equals("y")) {
                flag = true;
            } else {
                System.out.println("That is not a valid response");
                flag = false;
            }


        }
    }

    static void getMessage(int n) throws ScoreException, NumberFormatException {
        if (n < 0 || n > 100) {
            throw new ScoreException("Score must be >=0 and <=100!");
        } else {
            System.out.println("That is a valid score");
        }
    }
}
