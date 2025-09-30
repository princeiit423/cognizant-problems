class Animal {
    void walk() {
        System.out.println("Animal is walking");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Lion extends Animal {
    // method overriding
    void walk() {
        System.out.println("Lion is walking");
    }

    // specified methods
    void hunt() {
        System.out.println("Lion is Hunting...");
    }
}

class Zebra extends Animal {
    // method overriding
    void walk() {
        System.out.println("Zebra is walking");
    }

    // specified methods
    void eatGrass() {
        System.out.println("Zebra eat grass...");
    }
}

public class Polymorphism_07 {
    public static void main(String[] args) {
        Lion l = new Lion(); // tight coupling bcoz of child refrence to child object
        Zebra z = new Zebra(); // ""

        // for polymorphism 1:many we need loose coupling which means parents refrenc
        // to child object but this have one problem which is this refrence can't
        // called specified method of child class , so for solving this issue we have
        // to typecast the parent refrence to child refrence.

        Animal ref;
        ref = l;
        ref.walk(); // method overridden it will work on this refrence
        // ref.hunt(); // specified method this will not work this refrence typecast
        // required
        ((Lion) (ref)).hunt(); // this will work becase of typecast to child object

        System.out.println();

        ref = z;
        ref.walk();
        ((Zebra) (ref)).eatGrass(); // this also specified method required typecast
    }
}