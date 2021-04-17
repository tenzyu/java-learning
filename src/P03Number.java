public class P03Number {
    public static void main(String[] args) {
        Sample3.number1();
        Sample3.number2();
        Sample3.number3();
        Sample3.number4();
        Sample3.number5();
        Sample3.number6();
    }
}

class Sample3 {
    public static void number1() {
        System.out.println(1 + 2);
    }

    public static void number2() {
        int a = 1, b = 2;
        System.out.println("1 + 2 = " + (a + b));
    }

    public static void number3() {
        int a = 4, b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

    public static void number4() {
        int a = 1 + 2 + 3;
        int b = 1 + 2 * 3;
        int c = (1 + 2) * 3;
        System.out.println("1 + 2 + 3 = " + a);
        System.out.println("1 + 2 * 3 = " + b);
        System.out.println("(1 + 2) * 3 = " + c);
    }

    public static void number5() {
        int a = 2;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
    }

    public static void number6() {
        int a = 2;
        int b = a++;
        System.out.println(b);

        a = 2;
        int c = ++a;
        System.out.println(c);
    }
}
