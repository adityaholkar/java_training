public class App {
    public static void main(String[] args) throws Exception {
        int loopCount=0;
        while(true){
            System.out.println("Looping: " + loopCount);
            if(loopCount == 5){
                break;
            }
            else{
                System.out.println("Runnuing ");
            }
            loopCount++;
        }
    }
}
