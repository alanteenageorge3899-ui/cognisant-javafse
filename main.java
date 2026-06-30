import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of products
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Store product names
        String[] products = new String[n];

        for (int i = 0; i < n; i++) {
            products[i] = sc.nextLine();
        }

        // Product to search
        String searchProduct = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < n; i++) {
            if (products[i].equalsIgnoreCase(searchProduct)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }

        sc.close();
    }
}