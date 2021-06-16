public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car(10);
        car.carWheel();
        Truck truck = new Truck("adam");
        truck.truckWheel();
        Iinfo info = new Car(39);
        car.showInfo();
        truck.showInfo();
        showInfo(info);
    }
    public static void showInfo(Iinfo info){
        info.showInfo();
    }
}
