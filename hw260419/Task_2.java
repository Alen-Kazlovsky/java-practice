package hw260419;

public class Task_2 {
    public static void main(String[] args) {
        int array1[] = new int[]{1, 2, 3, 4, 5};
        int array2[] = new int[]{6, 7, 8, 9, 10};
        double everage1 = 0;

        double everage2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 6);

            everage1 += array1[i];
            everage1 /= 5;
            System.out.print(array1[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 6);
            everage2 += array2[i];
            everage2 /= 5;
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        if (everage1 > everage2) {
            System.out.print("Среднее значение первого массива больше и равно: " + everage1);
        } else if (everage1 < everage2) {
            System.out.print("Среднее значение второго массива больше и равно: " + everage2);
        } else {
            System.out.println("Средние значения массивов равны.");
        }
    }
}
