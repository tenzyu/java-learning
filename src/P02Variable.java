public class P02Variable {
    public static void main(String[] args) {
        Sample.variable1();
        Sample.variable2();
        Sample.variable3();
        Sample.variable4();
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

    public static void variable4() {
        String s1 = "ABC" + "DEF";
        System.out.println(s1);

        String bar = "Bar";
        String s2 = "Foo" + bar;
        System.out.println(s2);

        String s3 = "abc" + 123;
        System.out.println(s3);
    }
}