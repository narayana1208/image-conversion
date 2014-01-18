/*
 * Main.java
 *
 * @author www.javadb.com
 */
public class Main {
    
    /*
     * This method converts an byte array to a String object.
     */
    
    public void convertByteArrayToString() {
        
        byte[] byteArray = new byte[] {87, 79, 87, 46, 46, 46};
        
        String value = new String(byteArray);
        
        System.out.println(value);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().convertByteArrayToString();
    }
}
