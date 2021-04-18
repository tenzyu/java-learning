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
    }, () -> {
        int result = add2(2, 3);
        p(result);
    } };

    static void doSomething() {
        p("called");
    }

    static void add(int x, int y) {
        int num = x + y;
        p(num);
    }

    static int add2(int x, int y) {
        return x + y;
    }

    private static <T> void p(T value) {
        System.out.println(value);
    }
}
