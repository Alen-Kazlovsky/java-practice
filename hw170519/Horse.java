package hw170519;

public class Horse extends Animal {
    private int height;
    private boolean wearsHorseShoe;

    public Horse(String name, int age, String pedigree, int height, boolean wearsHorseShoe) {
        super(name, age, pedigree);
        this.height = height;
        this.wearsHorseShoe = wearsHorseShoe;

    }

    public int getHeight() {
        return height;
    }

    public boolean getWearsHorseShoe() {
        return wearsHorseShoe;

    }

    public void infHorse() {
        super.infAnimal();
        System.out.println("Высота лошади: " + height + " см. " + "Носит ли подковы: " + wearsHorseShoe + ".");


    }
}


