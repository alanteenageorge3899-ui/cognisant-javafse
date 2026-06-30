import java.util.Scanner;

public class Solution {

    static double forecast(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }

        return forecast(amount * (1 + rate / 100), rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialAmount = sc.nextDouble();
        double growthRate = sc.nextDouble();
        int years = sc.nextInt();

        double futureValue = forecast(initialAmount, growthRate, years);

        System.out.printf("%.2f\n", futureValue);

        sc.close();
    }
}