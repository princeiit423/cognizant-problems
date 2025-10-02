public class implement_mathPower_fun_17 {
    public static void findPower(double x, long y) {
        if (x < 999999 && y < 999) {
            double ans = 1.0000;
            for (int i = 0; i <= y; i++) {
                ans *= x;
            }
            System.out.println(ans);
        } else {
            System.out.println("Invalid number exceed");
        }
    }

    public static void main(String[] args) {
        double x = 2.36589123;
        long y = 3;
        findPower(x, y);

    }
}
