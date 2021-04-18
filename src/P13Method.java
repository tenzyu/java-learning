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
        p("before call");
        doSomething();
        p("after call");
    } };

    static void doSomething() {
        p("called");
    }

    private static <T> void p(T value) {
        System.out.println(value);
    }
}
