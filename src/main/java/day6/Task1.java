package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW5");
        car.setColor("Black");
        car.setYear(2014);

        Motorbike motorbike = new Motorbike("Suzuki", "Red", 2019);

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2023));
        System.out.println(motorbike.yearDifference(2008));
    }
}

