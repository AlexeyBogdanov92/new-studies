package day7;

public class Airplane {

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufakturer, int yearOfRelease, int length,
                    int weigth) {
        this.manufacturer = manufakturer;
        this.year = yearOfRelease;
        this.length = length;
        this.weight = weigth;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year
                + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfRelease() {
        return year;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.year = yearOfRelease;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength() ){
            System.out.println("Первый самолет длиннее");
        }else if (airplane1.getLength() < airplane2.getLength() ){
            System.out.println("Второй самолет длиннее");
        }else {
            System.out.println("Длины самолетов равны");
        }
    }
}
