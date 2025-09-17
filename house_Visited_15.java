import java.util.*;

public class house_Visited_15 {
    public static void findVisited(int n, int arr[]) {
        int count = 0;
        int i = 1;
        while (i <= n) {
            count++;
            i += i + arr[i];
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        findVisited(n, arr);
    }
}
