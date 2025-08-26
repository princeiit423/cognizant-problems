public class sum_digit_until_single_digit_06 {
    public static void sumDigit(int n) {

        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            n = sum;
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5978;
        sumDigit(n);

    }
}