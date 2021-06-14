class Machine{
    String name;
    int age;
    public Machine(){
        this("Default",0);
        System.out.println("constructor running!!");
        
    }
    public Machine(String name){
        System.out.println("Single parameterized constructor running");
        this.name = name;
    }
    public Machine(String name ,int age){
        System.out.println("Double parameterized constructor running");
        this.name = name;
        this.age =  age;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("adam",27);
        Machine machine3 = new Machine("raj");
    }
}
