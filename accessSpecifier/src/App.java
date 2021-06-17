import factory.Car;

public class App {
    /*
        private --- only within same class
        public --- from anywhere
        protected -- same class, subclass, and same package
        no modifier -- same package only
 */
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        System.out.println(car.id);
        System.out.println(car.name);
        //System.out.println(car.size); size is protected and app is in different package
        
    }
}
