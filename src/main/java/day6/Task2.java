package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplain = new Airplane("GAZ", 2011, 18, 20400);

        airplain.setYearOfRelease(2012);
        airplain.setLength(22);

        airplain.fillUp(600);
        airplain.fillUp(800);

        airplain.info();
    }
}
