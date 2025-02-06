import java.util.Scanner; // Import Scanner for user input

// Define Box class
class Box {
    double length, width, height;

    // Constructor to initialize box dimensions
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate surface area
    public double getArea() {
        return 2 * (length * width + width * height + height * length);
    }

    // Method to calculate volume
    public double getVolume() {
        return length * width * height;
    }
}

// Main class
public class BoxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Input for Box 1
        System.out.println("Enter dimensions for Box 1:");
        System.out.print("Length: ");
        double length1 = scanner.nextDouble();
        System.out.print("Width: ");
        double width1 = scanner.nextDouble();
        System.out.print("Height: ");
        double height1 = scanner.nextDouble();

        // Input for Box 2
        System.out.println("\nEnter dimensions for Box 2:");
        System.out.print("Length: ");
        double length2 = scanner.nextDouble();
        System.out.print("Width: ");
        double width2 = scanner.nextDouble();
        System.out.print("Height: ");
        double height2 = scanner.nextDouble();

        // Create Box objects with user input
        Box box1 = new Box(length1, width1, height1);
        Box box2 = new Box(length2, width2, height2);

        // Display results for Box 1
        System.out.println("\nBox 1 - Area: " + box1.getArea() + ", Volume: " + box1.getVolume());

        // Display results for Box 2
        System.out.println("Box 2 - Area: " + box2.getArea() + ", Volume: " + box2.getVolume());

        scanner.close(); // Close scanner
    }
}
