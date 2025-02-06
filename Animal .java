// Parent class (Superclass)
class Animal {
    // Instance variable
    String name;

    // Constructor to initialize name
    public Animal(String name) {
        this.name = name;
    }

    // Method to display animal's name
    public void display() {
        System.out.println("Animal Name: " + name);
    }
}

// Child class (Subclass) that inherits from Animal
class Dog extends Animal {

    // Constructor that calls the superclass constructor
    public Dog(String name) {
        super(name);  // Calling the constructor of Animal
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " says: Woof!");
    }

    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog("Buddy");

        // Calling methods from both the Dog class and the Animal class
        dog.display();  // Inherited from Animal class
        dog.bark();     // Defined in Dog class
    }
}
