

class Factory{
    public void start(){
        System.out.println("Factory is starting.....");
    }
}
interface Human{
    public void man();
}
public class App {
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory(){
            @Override public void start(){
                System.out.println("Car is making....");
            }
        };
        factory.start();
        Human human = new Human(){

            @Override
            public void man() {
                // TODO Auto-generated method stub
                System.out.println("This is man");
            }
            
        };
        human.man();
    }
}
