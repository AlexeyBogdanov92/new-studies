package day5;

public class Car {

    private String model;
    private String color;
    private int yearOfRelease;

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

    public void setYearOfRelese(int yearOfRelease) {

        this.yearOfRelease = yearOfRelease;
    }

    public int getyearOfRelese() {

        return yearOfRelease;
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - yearOfRelease);
    }


}






