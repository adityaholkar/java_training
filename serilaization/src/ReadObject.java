import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObject {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Reading object....");
        try(FileInputStream fis = new FileInputStream("people.bin")){
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person)ois.readObject();
            Person person2 = (Person)ois.readObject();



            ois.close();

            System.out.println(person1);
            System.out.println(person2);



            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
