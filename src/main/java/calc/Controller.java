package calc;

import java.util.Scanner;

public class Controller {
    Model model = new Model();
    View view = new View();

    public void calc() {
        Scanner scanner = new Scanner(System.in);
        view.printX();
        model.setX(scanner.nextInt());
        view.printY();
        model.setY(scanner.nextInt());
        view.printOp();
        model.setOp(scanner.next());
        view.result(model.getResult());
    }
}
