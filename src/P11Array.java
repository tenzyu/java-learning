public class P11Array {
    public static void main(String[] args) {
        boolean first = true;
        for (Runnable flow : flows) {
            if (first) {
                first = false;
            } else {
                p("----------");
            }
            flow.run();
        }
    }

    private static Runnable[] flows = { () -> {
        int[] a;
        a = new int[3];
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;
        p("a[0] = " + a[0]);
        p("a[1] = " + a[1]);
        p("a[2] = " + a[2]);
    } };

    private static <T> void p(T value) {
        System.out.println(value);
    }
}
