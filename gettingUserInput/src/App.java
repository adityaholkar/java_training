import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Your name");
        String myName = sc.nextLine();
        System.out.println("Enter your age");
        int myAge = sc.nextInt();
        System.out.println("Enter Your height");
        double myHeight = sc.nextDouble();
        System.out.println("Your name is: "+myName);
        System.out.println("Your age is: "+myAge);
        System.out.println("Your height is: "+myHeight);

        sc.close();
    }
}
