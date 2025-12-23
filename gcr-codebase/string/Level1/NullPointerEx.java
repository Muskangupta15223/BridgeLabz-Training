public class NullPointerEx{

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        int size = text.length();
    }

    public static void handleException() {
        String text = null;
        try {
            int length = text.length();
        } 
        catch (java.lang.NullPointerException e) {
            System.out.println("Error occurred and error message is: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstration of NullPointerException");
        try {
            generateException();
        } 
        catch (java.lang.NullPointerException e) {
            handleException();
            System.out.println("Error occurred and error message is: " + e.getMessage());
        }
    }
}