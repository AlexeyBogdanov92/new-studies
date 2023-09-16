package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();//5
        int b = s.nextInt();//50
        while (a >= b) {
            System.out.println("Некорректный ввод");
            break;
        }
        while (a < b) {
            ++a;
            if (a % 5 == 0 && a % 10 != 0)

                System.out.print(a + " ");

        }

    }
}

