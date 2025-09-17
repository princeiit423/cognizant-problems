import java.util.*;

public class maxBallon_12 {
    public static void maxBal(int n, int money, int ballon[], int budget[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (budget[i] + budget[j] <= money && budget[i] + budget[j] < max) {
                    max = ballon[i] + ballon[j];
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = sc.nextInt();
        int[] ballon = new int[n];
        for (int i = 0; i < n; i++) {
            ballon[i] = sc.nextInt();
        }
        int[] budget = new int[n];
        for (int i = 0; i < n; i++) {
            budget[i] = sc.nextInt();
        }

        maxBal(n, money, ballon, budget);
    }
}
