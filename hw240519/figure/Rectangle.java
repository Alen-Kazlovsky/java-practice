package figure;

public class Rectangle {
    private int firstSideLength;
    private int secondSideLength;

    Rectangle(int firstSideLength, int storona2) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = storona2;
    }

    public int getFirstSideLength() {
        return firstSideLength;
    }

    public int getSecondSideLength() {
        return secondSideLength;
    }

    public void square() {
        int plo = firstSideLength * secondSideLength;
        System.out.printf("Площадь прямоугольника:%d см.\n", plo);
    }

    public void perimetr() {
        int per = (firstSideLength + secondSideLength) * 2;
        System.out.printf("Периметр прямоугольника равен:%d см.\n", per);
    }
}
