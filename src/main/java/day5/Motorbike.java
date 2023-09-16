package day5;

public class Motorbike {

    private final String model;
    private final String color;
    private final int yearOfRelease;

    public Motorbike(String model, String color, int yearOfRelease) {


        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
        //System.out.println("Модель: "+name);
        //System.out.println("Цвет: "+color);
        // System.out.println("Год выпуска: "+yearOfRelease);

    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}

