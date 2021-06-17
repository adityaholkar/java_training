public class App {
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory();
        Car car =  new Car();
        Factory factory2 = car;
        factory2.running();

        car.name();
        //will not work as method is not overridden
        //factory2.name();
    }
}
