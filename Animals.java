// Grandparent class
class Animals {
    // Instance variable
    String name;

    // Constructor to initialize name
    public Animals(String name) {
        this.name = name;
    }

    // Method to display Animals's name
    public void display() {
        System.out.println("Animals Name: " + name);
    }
}

// Parent class (inherits from Animals)
class Mammal extends Animals {
    // Constructor that calls the superclass constructor
    public Mammal(String name) {
        super(name);  // Calling the constructor of Animals
    }

    // Method specific to Mammal
    public void walk() {
        System.out.println(name + " can walk.");
    }
}

// Child class (inherits from Mammal)
class Dog extends Mammal {

    // Constructor that calls the constructor of Mammal
    public Dog(String name) {
        super(name);  // Calling the constructor of Mammal
    }

    // Method specific to Dog
    public void bark() {
        System.out.println(name + " barks: Woof!");
    }

    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog("Buddy");

        // Calling methods from all levels of inheritance
        dog.display();  // Inherited from Animals class
        dog.walk();     // Inherited from Mammal class
        dog.bark();     // Defined in Dog class
    }
}
