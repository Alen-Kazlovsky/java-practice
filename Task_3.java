package hw260419;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = 0;
        n = sc.nextInt();
        if (n >= 4) {
            System.out.println("Введите число от 0 до 3:");
            sc.next();
        } else if (n < 0) {
            System.out.println("Введите число от 0 до 3:");
            sc.next();
        }
        int size = 0;
        size = n;
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * size + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int kol = 0;
        for (int x : array) {
            if ((x % 2) == 0)
                kol++;
        }

        int[] array2 = new int[kol];
        int j = 0;
        if (kol != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    array2[j] = array[i];
                    j++;
                }
            }
            System.out.print(array2[j]);

        } else System.out.println("В массиве четных элементов нет");

    }
}

