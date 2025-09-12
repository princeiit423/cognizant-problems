import java.util.*;

class maximum_levels_10 {
    public static int highestPow(int n) {
        int num = 1;
        while (num * 2 <= n) {
            num = num * 2;
        }
        return num;
    }

    public static void main(String args[]) {
        int n = 18;
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int highPow = highestPow(n);
            sb.append(highPow);
            n = n - highPow;
        }
        System.out.println(sb.toString());

    }
}