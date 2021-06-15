public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Factory factory1= new Factory();
        factory1.start();
        factory1.stop();

        Car bmw = new Car();
        
        bmw.start();//override function
        bmw.engine();
        //inherited function
        bmw.stop();
    }
}
