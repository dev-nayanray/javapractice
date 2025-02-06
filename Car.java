class Car {

    // Instance variables (attributes)
    String model;
    int year;

    // Constructor to initialize the object
    public Car(String model, int year) {
        this.model = model;  // Assign the value to the model attribute
        this.year = year;    // Assign the value to the year attribute
    }

    // Method to display the car's details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an object of the Car class using the constructor
        Car myCar = new Car("Toyota", 2020);
        
        // Calling the method to display the car details
        myCar.displayDetails();
    }
}
