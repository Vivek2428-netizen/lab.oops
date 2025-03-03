public class CompoundInterest {

    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5; // Interest rate
        int time = 10; // Time in years

        double amount = calculateCompoundInterest(principal, rate, time);
        System.out.println("Total amount after " + time + " years: " + amount);
    }

    public static double calculateCompoundInterest(double principal, double rate, int time) {
        return principal * Math.pow((1 + rate / 100), time);
    }
}