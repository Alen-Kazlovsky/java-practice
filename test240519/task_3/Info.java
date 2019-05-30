package task_3;

public class Info<T> {
    T name;

    public Info(T name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println(name + " - " + name.getClass().getName());
    }
}