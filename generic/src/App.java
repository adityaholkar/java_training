import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings =new ArrayList<String>();
        strings.add("adam");
        strings.add("cat");
        strings.add("dogs");
        String temp = strings.get(1);
        System.out.println(temp); 
    }
}
