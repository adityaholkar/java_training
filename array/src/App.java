import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner  = new Scanner(System.in);
        int[] values = new int[4];
        System.out.println("Enter the values of array");
        for(int i=0;i<values.length ; i++){
            values[i] = scanner.nextInt();
        }
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
    }
}
