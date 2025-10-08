public class fractional_knapsack_19 {
    public static void findMaxVal(int value[], int weight[], int capacity) {
        int ratio[] = new int[value.length];
        int maxVal = 0;

        for (int i = 0; i < value.length; i++) {
            ratio[i] = value[i] / weight[i];
        }
        for (int i = 0; i < weight.length; i++) {
            if (capacity > 0) {
                int addValue = ratio[i] * weight[i];
                maxVal += addValue;
                capacity = capacity - addValue;
            }
        }
        System.out.println(maxVal);
    }

    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int capacity = 50;
        findMaxVal(value, weight, capacity);
    }
}