public class possible_dearrangement_05 {
    public static int findDearangment(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 0;
        }
        return (n - 1) * (findDearangment(n - 1) + findDearangment(n - 2));

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(findDearangment(n));
    }
}
