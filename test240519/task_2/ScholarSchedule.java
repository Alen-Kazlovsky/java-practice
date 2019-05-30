package task_2;

import java.util.Scanner;

public class ScholarSchedule {


    public static int day() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день");
        System.out.printf("1.Monday,\n2.Tuesday,\n3.Wednesday,\n4.Thursday,\n5.Friday,\n5.Saturday,\n6.Sunday.\n");
        int day;
        day = scanner.nextInt();
        return day;
    }
}

