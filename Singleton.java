public class Singleton {

    // Create only one object
    private static Singleton instance = new Singleton();

    // Private constructor
    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    // Method to get the object
    public static Singleton getInstance() {
        return instance;
    }

    // Sample method
    public void showMessage() {
        System.out.println("Hello from Singleton Class");
    }
}