import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,String>map = new HashMap<Integer,String>();
        map.put(1, "red");
        map.put(2, "pink");
        map.put(3, "green");
        map.put(4, "blue");
        String color = map.get(1);
        System.out.println(color);

        for(Map.Entry<Integer,String> i:map.entrySet()){
            int key = i.getKey();
            String value = i.getValue();
            System.out.println("[ key "+key+" Value "+value+ " ]");
        }


    }
}
