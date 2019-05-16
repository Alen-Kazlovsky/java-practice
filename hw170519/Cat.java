package hw170519;

class Cat extends Animal {
    private int mustacheSize;
    private String clawsSharpness;
    private String eyesColor;


    public Cat(String name, int age, String pedigree, int mustacheSize, String clawsSharpness, String eyesColor) {
        super(name, age, pedigree);
        this.mustacheSize = mustacheSize;
        this.clawsSharpness = clawsSharpness;
        this.eyesColor = eyesColor;
    }

    public int getMustacheSize() {
        return mustacheSize;
    }

    public String getClawsSharpness() {
        return clawsSharpness;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void printInfCat() {
        super.infAnimal();
        System.out.println("Размер усов равен: " + mustacheSize+" см. " + "Острота когтей: "
                + clawsSharpness +". "+ "Цвет глаз: " + eyesColor+".");


    }

}
