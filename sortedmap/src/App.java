import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        
        testMap(linkHashMap);
        

    }
    public static void testMap(Map<Integer,String>map){
        map.put(1,"red");
        map.put(4,"black");
        map.put(2, "blue");
        map.put(7, "green");
        map.put(23,"yellow");
        for(Integer key : map.keySet()){
            String value = map.get(key);

            System.out.println(key+" :  "+ value);

        }
    }
}
