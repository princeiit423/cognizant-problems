class Test {
    static int a, b;
    static {
        System.out.println("inside static block");
    }

    static void fun1() {
        System.out.println("inside static method");
        a = 10;
        b = 20;
    }

    int x, y;
    {
        System.out.println("inside instance block");
    }

    void fun2() {
        System.out.println("inside instance method");
    }

    Test() {
        System.out.println("inside constructor");
        x = 9;
        y = 99;
    }
}

public class static_concept_03 {
    public static void main(String[] args) {
        Test.fun1(); // static function for class
        Test t = new Test(); // instance is for object
        t.fun2();

    }
}