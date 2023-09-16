package day6;

import java.util.Random;

public class Teacher {
    private String FIO;
    private String lesson;

    public Teacher(String FIO, String lesson) {
        this.FIO = FIO;
        this.lesson = lesson;

    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
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
            case (5):
                evaluation = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.FIO + " оценил студента с именем " + student.getFIO()
                + " по предмету " + this.lesson + " на оценку " + evaluation + ".");
    }

}
