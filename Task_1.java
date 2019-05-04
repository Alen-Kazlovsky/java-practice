package hw260419;

public class Task_1 {
    public static void main(String[] args) {
        int array[] = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9);
            System.out.print(array[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) array[i] = 0;
            System.out.print(array[i] + " ");
        }

    }

}
