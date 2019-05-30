package task_1;

public class Main {
    public static void main(String[] args) {
        Button changePinButton=new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Измените PIN-код");
            }
        });
        Button checkBalanceButton=new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Проверка баланса");
            }
        });

    changePinButton.clic();
    changePinButton.clic();

    }

}
