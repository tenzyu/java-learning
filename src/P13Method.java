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
    }, () -> {
        add(1, 2);
    } };

    static void doSomething() {
        p("called");
    }

    static void add(int x, int y) {
        int num = x + y;
        p(num);
    }

    private static <T> void p(T value) {
        System.out.println(value);
    }
}
