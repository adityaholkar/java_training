import java.util.ArrayList;

class Factory{

    @Override
    public String toString() {
        return "This is Factory";
    }
    public void start(){
        System.out.println("Factory - start");
    }

}

class Car extends Factory{

    @Override
    public String toString() {
        return "This is car";
    }


}
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Factory> list = new ArrayList<Factory>();
        list.add(new Factory());
        list.add(new Factory());
        ArrayList<Car> list1 = new ArrayList<Car>();
        list1.add(new Car());
        list1.add(new Car());
        showList(list);
        showList1(list);
    }
    public static void showList(ArrayList<? extends Factory>list){
        for(Factory i:list){
            System.out.println(i);
            i.start();
        }
    }
    public static void showList1(ArrayList<? super Car>list){
        for(Object i:list){
            System.out.println(i);
        }
    }

}
