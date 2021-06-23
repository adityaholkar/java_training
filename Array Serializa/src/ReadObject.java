import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws FileNotFoundException{
        
        System.out.println("reading object....");

        try(FileInputStream fis = new FileInputStream("data.ser")){
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[])ois.readObject();

            for(Person i:people){
                System.out.println(i);
            }

            ois.close();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
