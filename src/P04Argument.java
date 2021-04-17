class P04Argument {
    public static void main(String[] args) {
        Sample3.argument1(args);
        Sample3.argument2(args);
    }
}

class Sample3 {
    public static void argument1(String[] args) {
        System.out.println("Args0 = " + args[0]);
        System.out.println("Args1 = " + args[1]);
    }

    public static void argument2(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(num + 100);
        System.out.println(args[0] + 100);
    }
}