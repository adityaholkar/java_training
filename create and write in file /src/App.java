import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class App {
    public static void main(String[] args)  {
        File file = new File("sample.txt");
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
            br.write("one");
            br.newLine();
            br.write("second");
            br.newLine();
            br.write("third");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("unable to write file " + file.toString());
        }
    }
}
