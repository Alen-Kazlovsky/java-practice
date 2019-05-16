package hw170519;

public class Animal {
    private String name;
    private int age;
    private String pedigree;

    public Animal(String name, int age, String pedigree) {
        this.name = name;
        this.age = age;
        this.pedigree = pedigree;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void infAnimal() {
        System.out.println("Наименование вида животного: " + name + "."+" Возраст равен: " + age + " лет."+" Порода: " + pedigree+".");

    }
}


