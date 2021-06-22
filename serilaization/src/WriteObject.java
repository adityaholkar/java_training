import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        System.out.println("Writing into object");
        Person adam = new Person(1,"Adam");
        Person smith = new Person(2,"Smith");
        System.out.println(adam);
        System.out.println(smith);
        
        try(FileOutputStream fos = new FileOutputStream("people.bin")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(adam);
            oos.writeObject(smith);
             

            oos.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
