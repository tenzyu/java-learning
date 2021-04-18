public class P08Flow2 {
    public static void main(String[] args) {
        boolean first = true;
        for (Runnable flow : flows) {
            if (first) {
                first = false;
            } else {
                System.out.println("----------");
            }
            flow.run();
        }
    }

    private static Runnable[] flows = { () -> {
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
    }, () -> {
        for (int i = 3; i < 6; i++) {
            System.out.println("i = " + i);
        }
    }, () -> {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            count += i;
        }
        System.out.println("count = " + count);
    }, () -> {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }, () -> {
        int i = 0;
        while (i < 3) {
            System.out.println("i = " + i);
            i++;
        }
    }, () -> {
        int i = 10;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 13);
    }, () -> {
        int i = 0;
        while (true) {
            if (i > 2) {
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
    }, () -> {
        for (int j = 0; j < 3; j++) {
            if (j == 1) {
                continue;
            }
            System.out.println("j = " + j);
        }
    }, () -> {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println(" j = " + j);
            }
        }
    }, () -> {
        outer_loop: for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outer_loop;
                }
                System.out.println(" j = " + j);
            }
        }
    } };
}
