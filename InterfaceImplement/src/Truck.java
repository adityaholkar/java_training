public class Truck implements Iinfo{
    public String name;
    public Truck(String name) {
        this.name = name;
    }
    public void truckWheel(){
        System.out.println("truck have 6.");
    }
    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        System.out.println("This is Truck and its name is "+this.name);
    }
    
}
