public class maxRow_minColumn_sum_01 {
    public static void findSum(int matrix[][]) {
        int maxRow = 0;
        int minCol = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int curr = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                curr += matrix[i][j];
            }
            if (maxRow < curr) {
                maxRow = curr;
            }
        }
        System.out.println(maxRow);

        int maxCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > maxCol) {
                maxCol = matrix[i].length;
            }
        }
        for (int i = 0; i < maxCol; i++) {
            int temp = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (i < matrix[j].length) {
                    temp += matrix[j][i];
                }
            }
            if (temp < minCol) {
                minCol = temp;
            }
        }
        System.out.println(minCol);

        System.out.println("Sum of maxRow and minCol is: " + (maxRow + minCol));
    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 4 },
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        findSum(matrix);
    }
}