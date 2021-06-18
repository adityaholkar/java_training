public class App {
    public static void main(String[] args) throws Exception {
        int intValue = 7341;
        Long longValue = (long) 333333;
        short shortValue = 122;
        byte byteValue=23;
        float floatValue = 36.521f;
        Double doubleValue = 234.35;
        System.out.println(Byte.MAX_VALUE);
        
        intValue = (int)shortValue;
        
        System.out.println(intValue);
        
        doubleValue = (double) intValue;
        System.out.println(doubleValue);
        
        intValue = (int)floatValue;
        System.out.println(intValue);
    
    
        // The following won't work as we expect it to!!
        // 128 is too big for a byte. All datatype can only hold within perticular 
        // range.
        //byteValue = (byte)128;
        System.out.println(byteValue);


    }
}
