public class P07Flow {
    public static void main(String[] args) {
        Sample7.flow1();
        Sample7.flow2();
        Sample7.flow3();
        Sample7.flow4();
        Sample7.flow5();
        Sample7.flow6();
        Sample7.flow7();
        Sample7.flow8();
        Sample7.flow9();
        Sample7.flow10();
        Sample7.flow11();
    }

}

class Sample7 {
    public static void flow1() {
        boolean result = 1 < 2;
        System.out.println(result);
    }

    public static void flow2() {
        int a = 2, b = 1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
    }

    public static void flow3() {
        int score = 60;
        if (score > 50) {
            System.out.println("Pass");
        }
    }

    public static void flow4() {
        int score = 30;
        if (score > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Failure");
        }
    }

    public static void flow5() {
        int score = 0;
        if (score > 50) {
            System.out.println("Pass");

        } else if (score > 10) {
            System.out.println("Failure");
        } else {
            System.out.println("Horrible");
        }
    }

    public static void flow6() {
        boolean result = true && true;
        System.out.println(result);
    }

    public static void flow7() {
        boolean a = true, b = false;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a && b : " + (a && b));
        System.out.println("a || b : " + (a || b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("!a : " + (!a));
    }

    public static void flow8() {
        int a = 60, b = 70;
        if (a > 50 && b > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Failure");
        }
    }

    public static void flow9() {
        int num = 3;
        switch (num) {
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        default:
            System.out.println("other");
            break;
        }
    }

    public static void flow10() {
        char a = 'a';
        switch (a) {
        case 'a':
            System.out.println("a");
            break;
        case 'b':
            System.out.println("b");
            break;
        default:
            System.out.println("other");
            break;
        }
    }

    public static void flow11() {
        char c = 'c';
        switch (c) {
        case 'y':
            System.out.println("y");
            break;
        case 'n':
            System.out.println("n");
            break;
        default:
            System.out.println("Please enter y or n.");
            break;
        }
    }
}