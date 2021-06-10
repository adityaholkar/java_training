import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start or stop command");
        String  command = scanner.nextLine();
        switch(command){
            case "start":
                System.out.println("Machine started");
                break;
            case "stop":
                System.out.println("Machine stopped ");
                break;
            default:
                System.out.println("Enter valid command");
            }
    }
}
