package calc;

public class View {
    public void printX() {
        System.out.println("Введи x: ");
    }

    public void printY() {
        System.out.println("Введи y: ");
    }

    public void printOp() {
        System.out.println("Введи операцию: ");
    }

    public void result(int res) {
        System.out.printf("Результат: %s", res);
    }
}
