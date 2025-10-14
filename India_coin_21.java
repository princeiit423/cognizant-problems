import java.util.ArrayList;
import java.util.Arrays;

public class India_coin_21 {
    public static void findMinCoin(int coins[], int amount) {
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(coins);
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 590;
        findMinCoin(coins, amount);

    }
}
