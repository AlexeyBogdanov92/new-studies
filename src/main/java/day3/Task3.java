package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 5) {

            double x = sc.nextDouble();
            double y = sc.nextDouble();
            count++;
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(x / y);
        }

    }
}
