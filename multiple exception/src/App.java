import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) {
        Sample sample = new Sample();
        // try and catch block
        // try {
        //     sample.run();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // } catch (ParseException e) {
        //     // TODO Auto-generated catch block
        //     System.out.println("Parse Exception...");
        // }
             // Multi catch block
        // try {
        //     sample.run();
        // } catch (IOException | ParseException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }


            // Exception  is parent class
        try {
            sample.run();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        //catch block should be according to priority or occurance of exception in
        //code even in multi catch block it should be in respective of priority in
        //Or statment


    }
}
