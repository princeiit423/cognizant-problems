public class findPyramidSum_08 {
    public static void findSum(int n) {
        int sum = 1;
        int res = 1;
        if (n == 1) {
            System.out.println("1");
        }
        for (int i = 2; i <= n; i++) {
            sum = sum + (i + i);
            res += sum;
        }
        System.out.println(res);

    }

    public static void main(String args[]) {
        // 1
        // 2 1 2
        // 3 2 1 2 3 -> this is Pyramid shape

        // input = 3
        // output= 1+5+11=17

        int n = 3;
        findSum(n);

    }
}
