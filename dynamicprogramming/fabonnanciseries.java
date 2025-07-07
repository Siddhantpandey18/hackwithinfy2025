public class FibonacciDP {
    private static int[] memo;

    public static int fibonacci(int n) {
       
        if (memo == null || memo.length <= n) {
            memo = new int[n + 1];
        }
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) { 
            return memo[n];
        }
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at index " + n + ": " + fibonacci(n));
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}