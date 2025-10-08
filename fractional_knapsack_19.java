import java.util.Arrays;
import java.util.Comparator;

public class fractional_knapsack_19 {
    public static void findMaxVal(int value[], int weight[], int cap) {
        int ratio[][] = new int[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / weight[i];
        }
        // sort in ascending but we want descending order so we reverse iterate
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = cap;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += value[idx];
                capacity -= weight[idx];
            } else {
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
            }
        }
        System.out.println(finalVal);
    }

    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int capacity = 50;
        findMaxVal(value, weight, capacity);
    }
}