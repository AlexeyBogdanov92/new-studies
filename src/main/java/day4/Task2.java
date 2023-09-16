package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10000);

        int max = 0;
        for (int element : arr) {
            if (element > max)
                max = element;

        }
        System.out.println(max);

        int min = 10000;
        for (int element : arr) {
            if (element < min)
                min = element;

        }
        System.out.println(min);

        int count0 = 0;
        for (int element : arr) {
            if (element % 10 == 0)
                count0++;
        }
        System.out.println(count0);

        int sum = 0;
        for (int element : arr) {
            if (element % 10 == 0)
                sum += element;
        }
        System.out.println(sum);
    }
}
