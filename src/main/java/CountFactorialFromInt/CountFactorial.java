package CountFactorialFromInt;

public class CountFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(12));
    }

    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            int result = 1;
            while(n>1) {
                result *= n;
                n--;
            }
            return result;
        }
    }
}
