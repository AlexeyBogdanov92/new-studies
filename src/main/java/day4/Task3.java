package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];

        Random random = new Random();
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                matrix[m][n] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxSumIdx = 0;
        for (int m = 0; m < matrix.length; m++) {
            int sum = 0;
            for (int n = 0; n < matrix[m].length; n++) {
                sum += matrix[m][n];
            }

            if (sum >= maxSum) {
                maxSum = sum;
                maxSumIdx = m;
            }
        }
        System.out.println(maxSumIdx);
    }
}
