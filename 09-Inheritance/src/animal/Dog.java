package animal;

// Class inheritance
public class Dog extends Animal {

    // Child class may have its own member variables
    private int legs;

    // Inherited class should initialize values from parent class
    public Dog(int size) {
        // Superclass's constructor
        super("Dog", size);

        this.legs = 4;
    }

    private void chew() {
        System.out.println("The dog is chewing ...");
    }

    // Overriding parent class' method
    @Override
    public void eat() {
        super.eat();
        this.chew();
    }

    public void walk() {
        System.out.println("The dog is walking...");
        this.move(5);
    }

    public void run() {
        System.out.println("The dog is running...");
        this.move(10);
    }

    public void move(int speed) {
        System.out.println("The dog is moving at " + speed + " m/s");
    }
}
