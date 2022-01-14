public class FibonacciExample {
    public static void main(String[] args) {
        System.out.println(ineffectiveFibonacci(5));
        System.out.println(effectiveFibonacci(100));
        //fibonacci
    }


    //This is not effective method for solve this problem
    private static long ineffectiveFibonacci(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return ineffectiveFibonacci(n - 1) + ineffectiveFibonacci(n - 2);

    }

    //It's effective
    private static long effectiveFibonacci(int n) {
        long arr[] = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

}
