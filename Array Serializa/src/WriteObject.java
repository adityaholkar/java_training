import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws FileNotFoundException {
        Person[] people = {new Person(1,"adam"),new Person(2,"smith"),new Person(3,"jhon")};
        try(FileOutputStream fos = new FileOutputStream("data.ser")){

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(people);
            oos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }    
}
