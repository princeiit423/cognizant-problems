import java.util.Scanner;

class BussinessMan {
    private float p;
    private int t;
    private float si;
    static private float r;
    static {
        r = 13.2f;
    }

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter loan amount");
        p = sc.nextFloat();
        System.out.println("enter loan tenure");
        t = sc.nextInt();
    }

    public void calculateInterest() {
        si = (p * r * t) / 100;
    }

    // setter
    public void display() {
        System.out.println("Loan amount to pay is: " + si);
    }
}

public class static_concept_04 {
    public static void main(String args[]) {
        BussinessMan b1 = new BussinessMan();
        b1.setData();
        b1.calculateInterest();
        b1.display();

        BussinessMan b2 = new BussinessMan();
        b2.setData();
        b2.calculateInterest();
        b2.display();

    }
}
