package task_3;

public class Main {
    public static void main(String[] args) {
        Info<String> stringInfo = new Info<>("ABC");
        Info<Long> integerInfo = new Info<>(1234567);
        Info<Double> doubleInfo = new Info<>(123.45);
        Info<Float> floatInfo = new Info<>((float) 15.5f);
        Info<Long> longInfo = new Info<>((long) 1234567891);

        stringInfo.getInfo();
        integerInfo.getInfo();
        doubleInfo.getInfo();
        floatInfo.getInfo();
        longInfo.getInfo();
    }
}