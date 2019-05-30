package task_1;

public class Button {
    private EventHandler eventHandler;

    public Button() {

    }

    public void exutive() {
    }

    public Button(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void clic() {
        eventHandler.execute();
    }
}
