import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the number");
        int value;
        do{
            System.out.println("Enter the value ");
            value = scanner.nextInt();

        }while(value != 10);
        System.out.println("got 10!!!");
    }
}
