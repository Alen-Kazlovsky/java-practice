package figure;

public abstract class Figure {
    final double pi = 3.14;

    private int weight;
    private int height;

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public abstract void square();

    public abstract void perimetr();


}

