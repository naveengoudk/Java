import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try {
            FileWriter myFileWriter = new FileWriter("numbers.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter survey response numbers. Type end once completed");
            boolean flag = true;
            while(flag){
                String surveyResponses = sc.next();
                if(surveyResponses.equals("end")){
                    flag=false;
                } else {
                    myFileWriter.write(Integer.parseInt(surveyResponses)+"\n");
                }
            }
            myFileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
