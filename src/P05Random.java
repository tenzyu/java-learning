import java.util.Random;

class P05Random {
    // Random with argument
    public static void main(String[] args) {
        Random rand = new Random();
        int num = Integer.parseInt(args[0]);
        int result = rand.nextInt(num);
        System.out.println(result);
    }
}
