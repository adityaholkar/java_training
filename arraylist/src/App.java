import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
       
        numbers.remove(0);//removes first element
        numbers.remove(numbers.size()-1);//remove last elemnt
        for(int i:numbers){
            System.out.println(i);
        }
    }
}
