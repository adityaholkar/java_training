import java.util.Scanner;

class Machine{
    public void speakName(String name){
        System.out.println("My name is "+name);
    }
    public void printAgeAndHeight(int age,Double height){
        System.out.println("age is: " + age);
        System.out.println("Height is: "+height);
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Machine robot = new Machine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of robot");
        String name = scanner.nextLine();
        robot.speakName(name);
        System.out.println("Enter the age and height");
        int age = scanner.nextInt();
        Double height = scanner.nextDouble();
        robot.printAgeAndHeight(age,height);

    }
}
