public class SingletonDemo {

    public static void main(String[] args) {

        // Get first object
        Singleton obj1 = Singleton.getInstance();

        // Get second object
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Check whether both are same
        if (obj1 == obj2) {
            System.out.println("Both objects are same");
        } else {
            System.out.println("Objects are different");
        }
    }
}