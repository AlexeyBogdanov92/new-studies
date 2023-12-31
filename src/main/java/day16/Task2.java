package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random ranom = new Random();

        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);

        for(int i = 0; i <1000; i++)
            pw1.println(ranom.nextInt(100));

        pw1.close();

        Scanner sc = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;
        while(sc.hasNextLine()){
            sum += Integer.parseInt(sc.nextLine());
            counter++;

            if(counter == 20){
                pw2.println(sum/20.0);

                counter = 0;
                sum = 0;
            }

        }
        pw2.close();

        Scanner sc2 = new Scanner(file2);
        double result = 0;
        while(sc2.hasNextLine())
            result += Double.parseDouble(sc2.nextLine());

        System.out.println((int)result);
    }
}
