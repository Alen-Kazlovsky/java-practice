package course;

import java.util.Scanner;

public class Money implements Exchange {

    private int id;
    private int sum;
    private double usd;
    private double eur;


    public Money(double usd, double eur) {
        this.usd = usd;
        this.eur = eur;

    }


    @Override
    public double usd(int sum, double usd) {

        return sum * usd;
    }

    @Override
    public double eur(int sum, double eur) {
        return sum * eur;
    }

    @Override
    public void converter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирете валюту:");
        System.out.printf("1.USD\n2.EUR\n");
        id = scanner.nextInt();
        System.out.printf("Введите сумму\n");
        sum = scanner.nextInt();
        if (id == 1) {
            double usa = usd(sum, usd);
            System.out.printf("%.2f BYN за %d USD", usa, sum);
        } else if (id == 2) {
            double euro = eur(sum, eur);
            System.out.printf("%.2f BYN за %d euro", euro, sum);

        }
    }


}