import java.util.Iterator;
import java.util.LinkedList;
 
public class App {
 
    public static void main(String[] args) {
 
        LinkedList<String> numbers = new LinkedList<String>();
 
        numbers.add("one");
        numbers.add("two");
        numbers.add("four");
        numbers.add("three");
         
        
        Iterator<String> it = numbers.iterator();
 
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
             
            if(value.equals("two")) {
                it.remove();
            }
        }
 
        System.out.println();
         
        
        for (String number : numbers) {
            System.out.println(number);
        }
    }
 
}