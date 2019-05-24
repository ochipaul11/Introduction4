public class Reptile extends Animal implements AnimalInterface {
     private int numberOfScarels;




    public Reptile(String name, String color, int numberOfScarels) {
        super(name, color);
        this.numberOfScarels = numberOfScarels;

    }

    //public Reptile(String name, String color, int numberOfScarels ){


    public void setNumberOfScarels(int numberOfScarels) {
        this.numberOfScarels = numberOfScarels;
    }

    public int getNumberOfScarels() {
        return numberOfScarels;
    }

    @Override
    public void printAnimalDetails() {
        super.printAnimalDetails();
        System.out.println("Animal Name:"+ getName() +"Color"+getColor());
        //System.out.println("Animal Name:"+ name +"Color"+color);
    }

    @Override
    public void moves() {
        System.out.println("Reptiles move by crawling");
    }

    @Override
    public void communicate() {
        System.out.println("Reptiles communicate by hissing");

    }
}
