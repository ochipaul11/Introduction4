public class Main {
    public static void main(String[] args) {
        Animal animal;
        animal = new Animal("Cat","Black and white");
        animal.printAnimalDetails();
        //System.out.println("Animal Name:"+" name" +"Color"+"color");
        //Animal animal2=new Animal("Cat","Black and white");

        Reptile reptile= new Reptile("Crocodile","brown",500);
        reptile.printAnimalDetails();


    }
}
