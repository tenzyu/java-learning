public class P10FastPrimeNumber {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        for (int num = 2; num <= max; num++) {
            boolean isPrimeNumber = true;
            if (num != 2 && num % 2 == 0) {
                isPrimeNumber = false;
            }

            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.println(num);
            }
        }
        System.out.println("END");
    }
}
