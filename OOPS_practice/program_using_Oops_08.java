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

public class program_using_Oops_08 {
    public static void main(String args[]) {
        Square s = new Square();
        s.getInput();
        s.calcArea();
        s.dispArea();
    }
}
