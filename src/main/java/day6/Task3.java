package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Сергей Валерьевич Барсуков", "Экономика");
        Student student = new Student("Анатолий Павлович Курбанов");

        teacher.evaluate(student);
    }
}
