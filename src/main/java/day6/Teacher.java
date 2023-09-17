package day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String lesson;

    public Teacher(String fio, String lesson) {
        this.fio = fio;
        this.lesson = lesson;

    }

    public String getFIO() {
        return fio;
    }

    public void setFIO(String FIO) {
        this.fio = fio;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        String evaluation = "";
        switch (randomValue) {
            case (2):
                evaluation = "неудовлетворительно";
                break;
            case (3):
                evaluation = "удовлетворительно";
                break;
            case (4):
                evaluation = "хорошо";
                break;
            default:
                evaluation = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.fio + " оценил студента с именем " + student.getFIO()
                + " по предмету " + this.lesson + " на оценку " + evaluation + ".");
    }

}
