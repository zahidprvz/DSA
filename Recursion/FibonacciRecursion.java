public class FibonacciRecursion {

    public static int fibonacci(int n) {

        if(n < 0) {
            return -1;
        }        
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("The " + n + "th number in the Fibonacci sequence is: " + result);
    }
}
