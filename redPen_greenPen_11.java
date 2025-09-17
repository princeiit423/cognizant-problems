import java.util.*;

public class redPen_greenPen_11 {
    public static void redPen(int n, int arr[]) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] % 2 > 0 && arr[i + 1] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        redPen(n, arr);
    }
}