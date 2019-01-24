import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/jvalles/Downloads/test.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        System.out.println("Read complete.");
    }
}
