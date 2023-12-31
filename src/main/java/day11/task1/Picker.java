package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int TASK_SALARY = 80;
    private int bonus = 70000;

    private Warehouse w;
    private boolean isPayed;

    public Picker(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < BONUS_FOR_ORDER) {
            System.out.println("Бонус ещё недоступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже выплачен");
            return;
        }

        salary += bonus;
        isPayed = true;

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary= " + salary +
                ", isPayed= " + isPayed +
                '}';
    }
}
