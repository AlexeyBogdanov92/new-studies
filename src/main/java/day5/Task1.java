package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setModel("MB_211");
        car1.setColor("silver");
        car1.setYearOfRelese(2004);
        System.out.println("Модель: " + car1.getModel());
        System.out.println("Цвет: " + car1.getcolor());
        System.out.println("Год выпуска: " + car1.getyearOfRelese());

    }
}
