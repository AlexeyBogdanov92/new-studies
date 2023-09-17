package day7;



public class Task1 {
    public static void main(String[] args) {
    Airplane airplane1 = new Airplane("Gaz339", 2016, 34, 17000);
        Airplane airplane2 = new Airplane("Mag42", 2020, 41, 20000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}