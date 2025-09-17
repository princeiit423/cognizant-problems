import java.util.Scanner;

public class magical_libray_13 {
    public static void magicalRow(int row, int col, int library[][]) {
        int count = 0;

        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                if (library[i][j] % 2 != 0) {
                    sum += library[i][j];
                }
            }
            if (sum % 2 == 0) {
                count++;

            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int library[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                library[i][j] = sc.nextInt();
            }
        }
        magicalRow(row, col, library);
    }
}
