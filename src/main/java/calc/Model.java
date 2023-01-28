package calc;

public class Model {
    private int x;
    private int y;
    private String op;

    public Model(int x, int y, String op) {
        this.x = x;
        this.y = y;
        this.op = op;
    }

    public Model() {}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", x, y, op);
    }

    public int getResult() {
        return switch (op) {
            case "+" -> getX() + getY();
            case "-" -> getX() - getY();
            case "*" -> getX() * getY();
            case "/" -> getX() / getY();
            default -> 0;
        };
    }
}
