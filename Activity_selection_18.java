public class Activity_selection_18 {
    public static void findActivity(int start[], int end[]) {
        int maxAct = 1;
        int lastEnd = end[0];
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // System.out.println(lastEnd);
                maxAct++;
                lastEnd = end[i];
            }
        }
        System.out.println(maxAct);
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        findActivity(start, end);
    }
}
