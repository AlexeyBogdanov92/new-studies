package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("BMW11", "Black", 200);

        System.out.println("Модель: " + motorbike.getModel());
        System.out.println("Цвет: " + motorbike.getColor());
        System.out.println("Год выпуска: " + motorbike.getYearOfRelease());
    }
}
