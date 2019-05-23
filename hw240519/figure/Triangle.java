package figure;

public class Triangle extends Figure {
    private int storona1;
    private int visota;
    private int storona2;
    private int storona3;

    Triangle(int storona1, int storona2, int storona3, int visota) {
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
        this.visota = visota;

    }

    public int getStorona1() {
        return storona1;
    }

    public int getStorona2() {
        return storona2;
    }

    public int getStorona3() {
        return storona3;
    }

    public int getVisota() {
        return visota;
    }

    public void square() {
        double plo = 0.5 * storona1 * visota;
        System.out.printf("Площадь треугольника равна:%.2f см.\n", plo);

    }

    public void perimetr() {
        double per = storona1 + storona2 + storona3;
        System.out.printf("Периметр треугольника равен:%.2f см.\n", per);
    }

}

