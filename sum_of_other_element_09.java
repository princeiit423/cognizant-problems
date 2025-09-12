public class sum_of_other_element_09 {
    public static void findSum(int arr[]) {
        int sum = 0;
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int res = sum;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
            output[i] = sum;
            sum = res;
        }

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 };
        // result[0]= sum -> 2+3+4=9
        // result[1]= sum -> 1+3+4=8
        // result[2]= sum -> 1+2+4=7;
        findSum(arr);
    }
}