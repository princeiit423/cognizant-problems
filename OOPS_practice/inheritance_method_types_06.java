// inheritance have three methods:-
// 1) Inherited methods-> which cannot changed
// 2) overridden methods -> it means method which are present in parent calss but modify in child class for their use.
// 3) specified methods -> methods whih is only present in child class not in parent class.

class Plane {

    void takeOff() {
        System.out.println("plane take off...");
    }

    void land() {
        System.out.println("plane landing...");
    }

    void fly() {
        System.out.println("plane fly...");
    }
}

class Cargoplane extends Plane {
    // Overridden method which is modify for child
    void fly() {
        System.out.println("cargo plane fly...");
    }

    // specified methods
    void carryPlane() {
        System.out.println("Cargo plane carry plane...");
    }
}

class Fighterplane extends Plane {
    // method overridden
    void fly() {
        System.out.println("fighter plane fly...");
    }

    // specified methods
    void carryWeapon() {
        System.out.println("Fighter plane carry weapons..");
    }
}

public class inheritance_method_types_06 {
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        Fighterplane fp = new Fighterplane();

        cp.takeOff();
        cp.fly();
        cp.land();
        cp.carryPlane();

        System.out.println();
        fp.takeOff();
        fp.fly();
        fp.land();
        fp.carryWeapon();
    }
}
