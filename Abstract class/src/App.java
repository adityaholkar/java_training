public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.setId(1);
        car.engine();
        Truck truck = new Truck();
        truck.setId(10);
        truck.engine();
        System.out.println(car.getId());
        System.out.println(truck.getId());;
    }
}
