public class SimpleInterest {

    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5; // Interest rate
        int time = 3; // Time in years

        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest for " + time + " years: $" + interest);
    }

    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
}