import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class minimum_Absolute_diffrence_20 {
    public static void findMinDiff(int A[], int B[]) {
        int diffArr[][] = new int[A.length][2];
        for (int i = 0; i < A.length; i++) {
            diffArr[i][0] = i;
            diffArr[i][1] = (int) Math.abs(A[i] - B[i]);
        }
        Arrays.sort(diffArr, Comparator.comparingDouble(o -> o[1]));

        System.out.println(diffArr[0][1]);
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };
        findMinDiff(A, B);
    }
}
