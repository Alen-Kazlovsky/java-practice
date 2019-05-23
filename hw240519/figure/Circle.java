package figure;

public class Circle extends Figure {
    private double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void square() {
        double plo = Math.PI * (radius * radius);
        System.out.printf("Площадь круга равна:%.2f см.\n", plo);
    }

    public void perimetr() {
        double per = 2 * Math.PI * radius;
        System.out.printf("Периметр круга равен:%.2f см.\n", per);
    }
}

