public class SumToN {
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sumToN(n);
        System.out.println("The sum of integers from 1 to " + n + " is " + sum);
    }
}
