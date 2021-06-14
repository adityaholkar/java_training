class Demo{
    public static String demoDescription="This is static keyword";
    public static int count=0;
    public int objectId=0;
    Demo(){
        objectId = count;
        count++;
    }
    public void showObject(){
        System.out.println("Object id is: "+ objectId);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        demo1.showObject();
        demo2.showObject();
        System.out.println("Total count of object is: "+Demo.count);
    }
}
