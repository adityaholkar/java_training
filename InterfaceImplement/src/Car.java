public class Car implements Iinfo {
    private  int id ;
    public Car(int id){
        this.id = id;
    }
    public void carWheel(){
        System.out.println("Car hava 4.");
    }
    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        System.out.println("This is car with id: "+this.id);
    }
    
}
