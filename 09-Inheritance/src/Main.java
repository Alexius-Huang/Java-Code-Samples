import animal.Animal;
import animal.Dog;

public class Main {

    public static void main(String[] args) {
        // Creating parent class' instance
        Animal animal = new Animal("Cat", 100);

        // Creating child class' instance
        Dog dog = new Dog(200);

        // Child class can use parent class' method
        animal.eat();
        dog.eat();
    }

}
