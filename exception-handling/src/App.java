import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        File file =  new File("sample.txt");
        try {
            FileReader fr = new FileReader(file);
            //after exception nothing will be executed after exception is found  
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("File is not present..."+ file.toString());
        }
    }
}
