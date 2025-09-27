class Test1 {
    int x, y;

    Test1() {
        // super() by default call
        System.out.println("0-paramter constuctor of parent");
        x = 100;
        y = 200;
    }

    Test1(int x, int y) {
        // super() by default call
        System.out.println("paramter constuctor of parent");
        this.x = x;
        this.y = y;
    }
}

class Test2 extends Test1 {
    int a, b;

    Test2() {
        // super() call by default
        System.out.println("0-paramter constuctor of child");
        a = 9;
        b = 99;
    }

    Test2(int a, int b) {
        // super() call by default
        System.out.println("paramter constuctor of child");
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}

public class constructor_chain_inheritance_05 {
    public static void main(String[] args) {
        Test2 t2 = new Test2(45, 46);
        t2.disp();
    }
}
