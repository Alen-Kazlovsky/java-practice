package hw170519;

public class Print {
    public static void main(String[] args) {
        System.out.println("Первое животное.");
        Cat cat1 = new Cat("Кот", 5, "Шотландец", 3,
                "Средней длинны", "Голубые");
        cat1.printInfCat();

        System.out.println();
        System.out.println("Второе животное.");
        Dog dog = new Dog("Собака", 12, "Такса", 15, 30);
        dog.infDog();

        System.out.println();
        System.out.println("Третье животное.");
        Horse horse = new Horse("Лошадь", 8, "Лошадь Пржевальского", 150, true);
        horse.infHorse();
    }
}
