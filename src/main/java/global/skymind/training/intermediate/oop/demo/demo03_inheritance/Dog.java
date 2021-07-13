package global.skymind.training.intermediate.oop.demo.demo03_inheritance;

public class Dog extends Animal{    //extends keyword used to show inheritance i.e. Dog IS-AN animal

    private String breed;

    public Dog(boolean domestic, int legs){
        super(domestic, legs);              //Super keyword to invoke constructor of parent class Animal
    }

    public Dog(boolean domestic, int legs, String breed){
        super(domestic, legs);
        this.breed = breed;
    }

    public void getBreed(){
        System.out.println(super.getName() + " is a " + breed);
    }

    public void bark(){
        System.out.println("The dog is barking!");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog(true, 4, "Golden Retriever");

        d1.setName("Puppy");
        d1.bark();
        d1.getBreed();

        // Try creating an instance of a dog but declaring it as animal, do you see any difference?
    }
}
