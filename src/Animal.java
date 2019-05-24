public  class Animal {
    private String name;
    private String color;
   //or use protected for other classes to access the attributes directly
    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
            }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printAnimalDetails(){
        System.out.println("Animal Name:"+ name +"Color"+color);
    }


 /*   public static void main(String[] args) {
        Animal animal;
        animal = new Animal("Cat","Black and white");
        animal.printAnimalDetails();
        //System.out.println("Animal Name:"+" name" +"Color"+"color");
        //Animal animal2=new Animal("Cat","Black and white");

*/


    }



