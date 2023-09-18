package day8;

public class Task1 {
    public static void main(String[] args) {
    String numbers = "";

        long startTime = System.currentTimeMillis();
    for(int i = 0; i <= 20000; i++)
       numbers+= i + " ";
        long stopTime = System.currentTimeMillis();
       System.out.println("Длительность работы String, в мс. : "+(stopTime - startTime));

    StringBuilder snumbers = new StringBuilder("");

    long sbStartTime = System.currentTimeMillis();
    for(int j = 0; j <= 20000; j++)
        snumbers.append(j).append(" ");
        long sbStopTime = System.currentTimeMillis();
    System.out.println("Длительность работы StringBuilder, в мс. : " + (sbStopTime - sbStartTime));

    }
}
