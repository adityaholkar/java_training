public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println(factorial(10));
    }
    public static int factorial(int val){
        if(val == 1) return 1;
        return val * factorial(val-1);
    }
}
