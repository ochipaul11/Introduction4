public class Mammal extends Animal implements AnimalInterface {
    private int numberOfFur;

    public Mammal(String name, String color, int numberOfFur) {
        super(name, color);
        this.numberOfFur = numberOfFur;
    }

    public int getNumberOfFur() {
        return numberOfFur;
    }

    public void setNumberOfFur(int numberOfFur) {
        this.numberOfFur = numberOfFur;
    }

    public void printAnimalDetails() {
        super.printAnimalDetails();
        System.out.println("Animal Name:"+ getName() +"Color"+getColor() +" Number of fur "+ getNumberOfFur());
        //System.out.println("Animal Name:"+ name +"Color"+color);
    }

    @Override
    public void moves() {
        System.out.println("Mammals move by walking");
    }

    @Override
    public void communicate() {
        System.out.println("Mammals communicate by Talking");

    }
}
