public class Variable {
    public static void main(String[] args) {
        Sample.variable1();
        Sample.variable2();
        Sample.variable3();
    }
}

class Sample {
    public static void variable1() {
        int a;
        a = 1;
        System.out.println(a);
    }

    public static void variable2() {
        int a = 2;
        // this 2 is called a literal.
        System.out.println(a);
    }

    public static void variable3() {
        String text;
        text = "first";
        System.out.println(text);
        text = "second";
        System.out.println(text);
    }
}