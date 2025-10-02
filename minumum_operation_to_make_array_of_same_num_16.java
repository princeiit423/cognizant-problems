import java.util.Arrays;

public class minumum_operation_to_make_array_of_same_num_16 {
    public static void findMinOpe(int arr[]) {

        int min = Integer.MAX_VALUE;
        int count = 0;
        Arrays.sort(arr);
        int middle = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            count += Math.abs(arr[i] - arr[middle]);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 2, 9 };
        findMinOpe(arr);
    }
}
