class Factory{
    public void build(){
        System.out.println("Factory-Build");
    }
}
class Car extends Factory{
    public void build(){
        System.out.println("Car-Build");
    }
    public void run(){
        System.out.println("Car-Run");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory();
        Car car  = new Car();
        
        //simple method call
        factory.build();
        car.build();
        car.run();


        //Upcasting
        Factory factory1 = car;
        factory1.build();


        //downcasting
        Factory factory2 = new Car();
        Car car2 =(Car) factory2;
        car2.build();
        car2.run();

        





    }
}
