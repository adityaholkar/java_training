import java.util.Scanner;

class Machine{
    private String name;
    private int age;
    private Double height;
    public void setName(String name){
        this.name = name;
    }
    public void setInfo(int age,Double height){
        this.age = age;
        this.height = height;

    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Double getHeight(){
        return this.height;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Machine robot = new Machine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of robot");
        String name = scanner.nextLine();
        robot.setName(name);
        System.out.println("Enter the age and height");
        int age = scanner.nextInt();
        Double height = scanner.nextDouble();
        robot.setInfo(age,height);
        System.out.println("Hello, My name is "+robot.getName()+". I am "+robot.getAge()+" old. My height is "+robot.getHeight());

    }
}
