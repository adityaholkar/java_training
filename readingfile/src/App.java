import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "sample.txt";
        File fileheader = new File(fileName);
        Scanner scanner = new Scanner(fileheader);

        while(scanner.hasNextLine()){
            String temp = scanner.nextLine();
            System.out.println(temp);
        }
        scanner.close();
    }
}
