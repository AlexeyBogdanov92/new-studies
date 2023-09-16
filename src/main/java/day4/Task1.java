package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// Длинна масива

        Random random = new Random();
        random.nextInt(10);
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10);

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

        int count8 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 8)
                count8++;

        }
        System.out.println(count8);

        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1)
                count1++;

        }
        System.out.println(count1);

        int countE = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                countE++;

        }
        System.out.println(countE);

        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                countOdd++;

        }
        System.out.println(countOdd);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
