public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is adam");
        sb.append(" ");
        sb.append("I am 20 year old");
        System.out.println(sb.toString());
        StringBuilder s = new StringBuilder();
        s.append("My name is bob")
         .append(" ")
         .append("I am builder");
        System.out.println(s.toString());

        //formating string
        System.out.print("This is text.\ttab keyword.\n new line keyword");
        System.out.println("inbuilt println for new line");
        //Formatting int
        System.out.printf("Age of adam is %3d,height is %d\n",20,6);

        for(int i=1;i<21;i++){
            System.out.printf("%2d: line number\n",i);
        }
        //Formating float   %space.decimalPlacef
        System.out.printf("Height of adam is %.2f\n",5.6762);

        

    }
}
