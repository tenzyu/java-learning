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
    }, () -> {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;

        for (int i = 0; i < a.length; i++) {
            p("a[" + i + "] = " + a[i]);
        }
    }, () -> {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;

        for (int num : a) {
            p(num);
        }
    }, () -> {
        String[] s = new String[3];
        s[0] = "ABC";
        s[1] = "foo";
        s[2] = "bar";
        for (int i = 0; i < s.length; i++) {
            p("s[" + i + "] = " + s[i]);
        }
    }, () -> {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            p("a[" + i + "] = " + a[i]);
        }
    }, () -> {
        int[] a = { 10, 20, 30 };
        for (int i = 0; i < a.length; i++) {
            p("a[" + i + "] = " + a[i]);
        }
    } };

    private static <T> void p(T value) {
        System.out.println(value);
    }
}
