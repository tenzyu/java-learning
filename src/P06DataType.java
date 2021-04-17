class P06DataType {
    public static void main(String[] args) {
        Sample6.dataType1();
        Sample6.dataType2();
        Sample6.dataType3(args);
    }
}

class Sample6 {
    public static void dataType1() {
        long bignum = 100;
        int num = (int) bignum;
        System.out.println(num);
    }

    public static void dataType2() {
        char c = 'あ';
        System.out.println(c);
    }

    public static void dataType3(String[] args) {
        double height = Double.parseDouble(args[0]) / 100; // 170cm -> 1.70m
        double weight = Double.parseDouble(args[1]);
        double bmi = weight / (height * height);
        System.out.println("BIM = " + bmi);
    }
}