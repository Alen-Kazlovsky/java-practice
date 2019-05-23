package figure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга:");
        Scanner r1=new Scanner(System.in);
       double radius=r1.nextDouble();
        Circle c1=new Circle(radius);
        c1.square();
        c1.perimetr();

        System.out.println("Введите стороны треугольника:");
        Scanner s1=new Scanner(System.in);
        int storona1=s1.nextInt();
        Scanner s2=new Scanner(System.in);
        int storona2=s2.nextInt();
        Scanner s3=new Scanner(System.in);
        int storona3=s3.nextInt();
        System.out.println("Введите высоту треугольника:");
        Scanner v1=new Scanner(System.in);
        int visota1=v1.nextInt();

        Triangle t1=new Triangle(storona1,storona2,storona3,visota1);
        t1.square();
        t1.perimetr();

        System.out.println("Введите стороны прямоугольника:");
        Scanner p1=new Scanner(System.in);
        int firstSideLength=p1.nextInt();
        Scanner p2=new Scanner(System.in);
        int secondSideLength=p2.nextInt();

        Rectangle rectangle1=new Rectangle(firstSideLength,secondSideLength);
        rectangle1.square();
        rectangle1.perimetr();
    }

}
