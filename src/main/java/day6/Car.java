package day6;

public class Car {

    private String model;
    private String color;
    private int year;

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getcolor() {

        return color;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getyear() {

        return year;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {

        return Math.abs(inputYear - year);
    }


}
