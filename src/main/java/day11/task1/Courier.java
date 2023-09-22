package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static final int TASK_SALARY = 100;

    private Warehouse w;
    private boolean isPayed;

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementDeliveredOrder();
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус ещё недоступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже выплачен");
            return;
        }

        salary += 50000;
        isPayed = true;

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
