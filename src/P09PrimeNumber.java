public class P09PrimeNumber {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        for (int num = 2; num <= max; num++) {
            boolean isPrimeNumber = true;
            for (int i = 2; i < num; i++) {
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
