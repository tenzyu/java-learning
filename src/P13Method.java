public class P13Method {
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
        p("ready");
    } };

    private static <T> void p(T value) {
        System.out.println(value);
    }
}
