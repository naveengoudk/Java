import java.io.*;
import java.util.Scanner;

public class TelephoneNumberWordGenerator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Four digit number without 0 and 1:");
        int num = sc.nextInt();
        char[][] letters = {{'0', '0', '0'}, {'1', '1', '1'}, {'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'}, {'M', 'N', 'O'}, {'P', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'X', 'Y'}};
        char[] combination = new char[4];


        PrintStream printStream = new PrintStream("C:\\Users\\signi\\IdeaProjects\\untitled9\\src\\combination.txt");
        try {
            String temp = Integer.toString(num);
            char[] chars = temp.toCharArray();
            int[] digit = new int[chars.length];
            for (int i = 0; i < chars.length; i++) {
                digit[i] = Integer.parseInt(String.valueOf(chars[i]));
            }
            for (int level0 = 0; level0 < 3; level0++) {
                combination[0] = letters[digit[0]][level0];

                for (int level1 = 0; level1 < 3; level1++) {
                    combination[1] = letters[digit[1]][level1];

                    for (int level2 = 0; level2 < 3; level2++) {
                        combination[2] = letters[digit[2]][level2];

                        for (int level3 = 0; level3 < 3; level3++) {
                            combination[3] = letters[digit[3]][level3];
                            printStream.printf("\t%s", String.valueOf(combination));
                        }
                        printStream.println();
                    }

                }
            }

            System.out.println("File written.");

        } catch (Exception exception) {
            System.out.println("Error writing to file." + exception);

        }


    }

}




