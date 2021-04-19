public class P14PrimeNumberMethod {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        for (int num = 0; num < max; num++) {
            boolean isPrimeNumber = checkPrimeNumber(num);
            if (isPrimeNumber) {
                p(num);
            }
        }
    }

    private static boolean checkPrimeNumber(int num) {
        boolean isPrimeNumber = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }

    private static <T> void p(T value) {
        System.out.println(value);
    }
}
