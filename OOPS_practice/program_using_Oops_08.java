import java.util.Scanner;

abstract class Shape {
    abstract void getInput();

    abstract void calcArea();

    abstract void dispArea();

}

class Square extends Shape {
    private float side;
    private float area;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side: ");
        side = sc.nextFloat();
    }

    public void calcArea() {
        area = side * side;
    }

    public void dispArea() {
        System.out.println(area);
    }
}

class Rectangle extends Shape {
    private float length;
    private float breadth;
    private float area;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Length");
        length = sc.nextFloat();
        System.out.println("Input breadth: ");
        breadth = sc.nextFloat();
    }

    public void calcArea() {
        area = length * breadth;
    }

    public void dispArea() {
        System.out.println(area);
    }
}

class Permit { // do this for polymorphism
    public void allow(Shape ref) {
        ref.getInput();
        ref.calcArea();
        ref.dispArea();
    }
}

public class program_using_Oops_08 {
    public static void main(String args[]) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Permit p = new Permit();
        p.allow(s);
        p.allow(r);

    }
}
