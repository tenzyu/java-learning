public class Variable {
    public static void main(String[] args){
        Sample.variable1();
        Sample.variable2();
    }
}

class Sample {
    public static void variable1(){
        int a;
        a = 1;
        System.out.println(a);
    }

    public static void variable2(){
        int a = 2;
        System.out.println(a);
    }
}