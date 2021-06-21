import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args){
        File file = new File("sample.txtre");
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while((line=br.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("file not found...."+ file.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("File can't readable..." + file.toString());
        }
        finally{
            try {
                br.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("Unable to open file..." + file.toString());
            }
            catch(NullPointerException ex){
                    //file never opend so br will be NULL
            }
        }
       
    }
}
