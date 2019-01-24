import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String str = "\nMy name is James Valles and I love to write to files. This is a simple example of writing to a file. \n";
        File fileName = new File("/Users/jvalles/Downloads/test.txt"); //path to file
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)); //setting append to true will allow you to keep writing to file without overwriting
        writer.append(' ');
        writer.append(str); // what you want to write, etc.
        writer.close(); // flushes and then closes stream

    }
}
