import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        try {
            FileWriter myFileWriter = new FileWriter("output.txt");
            File file = new File("numbers.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                int num = Integer.parseInt(sc.nextLine());
                myFileWriter.write(num +"\n");
            }
            myFileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
