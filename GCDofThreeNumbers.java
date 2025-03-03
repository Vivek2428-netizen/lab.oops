public class GCDOfThreeNumbers {

    public static void main(String[] args) {
        int num1 = 12, num2 = 15, num3 = 9;
        int gcd = findGCD(num1, num2, num3);
        System.out.println("GCD of " + num1 + ", " + num2 + ", and " + num3 + " is: " + gcd);
    }

    public static int findGCD(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}