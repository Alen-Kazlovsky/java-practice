package hw170519;

public class Dog extends Animal {
    private int tailLength;
    private int size;

    public Dog(String name, int age, String pedigree, int tailLength, int size) {
        super(name, age, pedigree);
        this.tailLength = tailLength;
        this.size = size;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void infDog() {
        super.infAnimal();
        System.out.println("Длина хвоста равна: "+tailLength+" см. "+"Размер собаки равен:"+size+" см.");

    }
}
