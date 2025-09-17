import java.util.Arrays;
import java.util.Scanner;

public class knowledge_Inhancement_14 {
    public static void findBook(int n, int hour, int arr[]) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (hour >= arr[i]) {
                count++;
                hour = hour - arr[i];
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hour = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findBook(n, hour, arr);
    }
}
