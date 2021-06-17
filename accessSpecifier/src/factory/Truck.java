package factory;
public class Truck  {
    private Car car = new Car();
    public Truck(){
        System.out.println(car.size);
    }
}
