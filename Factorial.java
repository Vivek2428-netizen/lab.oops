public class Factorial {

    public static void main(String[] args) {
        int number = 5; // Change this number to calculate a different factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        }
        return n * calculateFactorial(n - 1); // Recursive case
    }
}